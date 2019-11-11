/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.EmployeesStudies;

import models.CareService.CareService;

/**
 *
 * @author rober2
 */
public class Certification extends Qualification{

  public int getPrecio() {
    return 1000;
  }

  public CareService.CareServiceType getCategoria() {
    return CareService.CareServiceType.NINOS;
  }
    
}
