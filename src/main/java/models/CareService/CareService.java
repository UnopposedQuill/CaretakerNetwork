/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.CareService;

import java.util.Date;

/**
 *
 * @author rober2
 */
public abstract class CareService {

  public enum CareServiceState {

  }
  private String nombre;
  private Date inicialDate;
  private Date endDate;
  private CareServiceState estate;
  private String description;
  private int price;

  public CareService() {
  }
 
  public boolean suscribe() {
    return false;
  }
}
