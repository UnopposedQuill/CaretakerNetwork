/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.CareService;

import java.util.Calendar;

/**
 *
 * @author rober2
 */
public class CareRequest {
  
  public static enum StateRequest {
    RECHAZADO, ENCURSO, ACEPTADO 
  }
  Calendar c = Calendar.getInstance();

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone(); //To change body of generated methods, choose Tools | Templates.
  }
  
  
  
  
}
