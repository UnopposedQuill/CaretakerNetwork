/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.report;


import database.DatabaseNoSQL;
import dev.morphia.Datastore;
import dev.morphia.query.Query;
import java.util.Date;
import java.util.List;
import models.CareService.CareService;
import models.CareService.ClientRequest;
import models.CareService.ServiceByHour;
import models.Employee;
import models.Pacient;

/**
 *
 * @author rober2
 */
public class BuilderReport {
    
  private Report report;

  
  public BuilderReport() {
    report = new Report();
  }
  public BuilderReport setPersonName(String name) {
    this.setByPacient(name);
    this.setByEmployee(name);
    return this;
  }
  public BuilderReport setDateRange(Date inicialDate, Date endDate) {
    this.report.setFechaIncial(inicialDate);
    this.report.setFechaFinal(endDate);
    return this;
  }
    
  public BuilderReport setTypeService(String name) {
    CareService.CareServiceType care= null;
    try {
      care = CareService.CareServiceType.valueOf(name);
    } catch (Exception e) {
    }
    this.report.setTipoServicio(care);
    return this;
  }
  
  public BuilderReport setByPacient(String patientName) {
    this.report.setClientSelected(patientName);
    return this;
  }
  
  public BuilderReport setByEmployee(String employeeName) {
    this.report.setEmployyeSelected(employeeName);
    return this;
  }

  @Override
  public String toString() {
    return report.toString();
  }
  
  
 
  
  public Report build() {
    
    /*
    El administrador del lugar, debe de poder ver diferentes
    tipos de reportes para obtener información sobre cantidad y 
    montos de servicios dados,
    por tipo de servicio, por persona, por cliente y/o fechas. 
    Para todos los centros o solo uno.
    */    
    DatabaseNoSQL instance = DatabaseNoSQL.getNoSQLInstance();
    Datastore datastore = instance.getDataStore();
    
    Query<ClientRequest> pacients= datastore.createQuery(ClientRequest.class);
    //Tipo
    if(report.getTipoServicio() != null){
      pacients.field("pacient.suscriptions.type").equal(report.getTipoServicio());
    }
    //Persona
    if(report.getEmployyeSelected() != null){
      pacients.field("pacient.suscriptions.careTaker").equal(report.getEmployyeSelected());
    }
    //Cliente
    if(report.getClientSelected() != null) {
      pacients.field("pacient.name").equal(this.report.getClientSelected());
    }
    //Fechas
    if(report.getFechaIncial() != null) {
      pacients.field("pacient.suscriptions.initDate").greaterThanOrEq(this.report.getFechaIncial());
    }
    if(report.getFechaFinal() != null) {
      pacients.field("pacient.suscriptions.endDate").lessThanOrEq(this.report.getFechaFinal());
    }
    
    List<ClientRequest> p = pacients.asList();
    
    String[] nothingSelected = {"Price","Type","CareTaker","ClientName","InicialDate","EndDate"};
    String[][] data = new String[p.size()][6]; 
    for (int i = 0; i < p.size(); i++) {
      List<CareService> suscriptions = p.get(i).getPacient().getSuscriptions();
      for (int j = 0; j < suscriptions.size(); j++) {
        data[i][0] = suscriptions.get(j).getPrice()+"";
        data[i][1] = suscriptions.get(j).getType().toString();
        data[i][2] = suscriptions.get(j).getCareTaker().getId();
        data[i][3] = p.get(i).getPacient().getName();
        data[i][4] = suscriptions.get(j).getInicialDate().toString();
        data[i][5] = suscriptions.get(j).getEndDate().toString();
      }
    }
    report.setColumns(nothingSelected);
    report.setRows(data);
    System.out.println(this.report.toString());
    
    return report;
  }
  
  
}
