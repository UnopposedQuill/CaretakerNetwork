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
import models.CareService.CareService;
import models.CareService.ServiceByHour;
import models.Employee;
import models.Pacient;

/**
 *
 * @author rober2
 */
public class BuilderReporte {
    
  private Report report;

  public BuilderReporte() {
    report = new Report();
  }
  
  public BuilderReporte setDateRange(Date inicialDate, Date endDate) {
    this.report.setFechaFinal(inicialDate);
    this.report.setFechaFinal(endDate);
    return this;
  }
  
  public BuilderReporte setCountServices() {
    
    return this;
  }
  
  public BuilderReporte setPriceServices() {
    return this;
  }
  
  public BuilderReporte setTypeService() {
    return this;
  }
  
  public BuilderReporte setByPacient() {
    return this;
  }
  
  public BuilderReporte setByEmployee() {
    return this;
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
    
    String parameterPrice = "price";
    pacients.filter(parameterPrice+">=",1000);
    
    String parameterStartDate = "initDate";
    pacients.filter(parameterStartDate+">=",1000);

    String parameterEndDate = "endDate";
    pacients.filter(parameterEndDate+">=",1000);
    
    
    return report;
  }
  
  
}
