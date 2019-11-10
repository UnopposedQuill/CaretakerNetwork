/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.CareService;

import dev.morphia.annotations.Id;
import models.Pacient;
import org.bson.types.ObjectId;


/**
 *
 * @author rober2
 */
public class ClientRequest {
  
  public static enum StateRequest {
    RECHAZADO, ENCURSO, ACEPTADO 
  }
  
  @Id
  private String id = ObjectId.get().toString();
  private Pacient pacient;
  private StateRequest state;

  public ClientRequest() { }
  
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

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
