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
    DatabaseNoSQL instance = DatabaseNoSQL.getNoSQLInstance();
    Datastore datastore = instance.getDataStore();
    Query<Employee> employees = datastore.createQuery(Employee.class);
    Query<Pacient> pacients= datastore.createQuery(Pacient.class);
    Query<CareService> typesServices = datastore.createQuery(CareService.class);
    typesServices.filter("price >=",1000);
    
    
    
    
    
    return report;
  }
  
  
}
