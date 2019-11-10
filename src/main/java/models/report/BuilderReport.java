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
  
  public BuilderReport setDateRange(Date inicialDate, Date endDate) {
    this.report.setFechaIncial(inicialDate);
    this.report.setFechaFinal(endDate);
    return this;
  }
  
  public BuilderReport setCountServices() {
    
    return this;
  }
  
  public BuilderReport setPriceServices() {
    return this;
  }
  
  public BuilderReport setTypeService() {
    return this;
  }
  
  public BuilderReport setByPacient(String patientName) {
    this.report.setClientSelected(patientName);
    return this;
  }
  
  public BuilderReport setByEmployee(String employeeName) {
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
    Query<Pacient> pacients= datastore.createQuery(Pacient.class);
    System.out.println(this.report.toString());
    //Tipo
    if(report.getTipoServicio() != null){
      pacients.field("suscriptions.type").equal(report.getTipoServicio());
    }
    //Persona
    if(report.getEmployyeSelected() != null){
      pacients.field("suscriptions.careTaker").equal(report.getEmployyeSelected());
    }
    //Cliente
    if(report.getClientSelected() != null) {
      pacients.field("name").equal(this.report.getClientSelected());
    }
    //Fechas
    
    pacients.field("suscriptions.initDate").greaterThanOrEq(this.report.getFechaIncial());
    pacients.field("suscriptions.endDate").lessThan(this.report.getFechaFinal());    

    List<Pacient> p = pacients.asList();
    System.out.println("Builder");
    p.forEach((t) -> {
    System.out.println(t.toString());

    });
    
    return report;
  }
  
  
}
