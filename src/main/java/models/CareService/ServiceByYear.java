/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.CareService;

import java.util.Date;
import models.Clinic;

/**
 *
 * @author rober2
 */
public class ServiceByYear extends CareService{

  public ServiceByYear() {
  }
  
  public ServiceByYear(String nombre, String username, Date initDate, Date endDate, CareServiceState estate, String description, int price, Clinic clinic) {
    super(nombre, username, initDate, endDate, estate, description, price, clinic);
    super.setType(CareServiceType.ANIO);
  }

  
  
  
  @Override
  public boolean suscribe() {
    return super.suscribe(); //To change body of generated methods, choose Tools | Templates.
  }
  
}
