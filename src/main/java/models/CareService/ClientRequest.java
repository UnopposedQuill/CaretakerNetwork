/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.CareService;

import models.Pacient;


/**
 *
 * @author rober2
 */
public class ClientRequest {
  
  public static enum StateRequest {
    RECHAZADO, ENCURSO, ACEPTADO 
  }
  private Pacient pacient;
  private StateRequest state;

  public ClientRequest(Pacient pacient, StateRequest state) {
    this.pacient = pacient;
    this.state = state;
  }

  
  
  public Pacient getPacient() {
    return pacient;
  }

  public void setPacient(Pacient pacient) {
    this.pacient = pacient;
  }

  public StateRequest getState() {
    return state;
  }

  public void setState(StateRequest state) {
    this.state = state;
  }
  
    
  
  
  
}
