/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.report;

import java.util.Date;
import jdk.javadoc.doclet.Reporter;

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
    return report;
  }
  
  
}
