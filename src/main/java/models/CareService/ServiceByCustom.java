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
public class ServiceByCustom extends CareService{

  public ServiceByCustom() {
  }
  
  public ServiceByCustom(Date initDate,Date endDate) {
    
  }

  public ServiceByCustom(String nombre, Date initDate, Date endDate, CareServiceState estate, String description, int price, Clinic clinic) {
    super(nombre, initDate, endDate, estate, description, price, clinic);
    super.setType(CareServiceType.PERSONALIZADO);
  }

  
  
  @Override
  public boolean suscribe() {
    return super.suscribe(); //To change body of generated methods, choose Tools | Templates.
  }
  
}
