/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;
import java.util.List;
import models.CareService.Suscription;
import models.CareService.Treatment;


/**
 *
 * @author rober2
 */
public class Pacient extends User {
  
  private List<Suscription> suscriptions;
  private List<Treatment> sessions;
  public Pacient() {
  }
  
  public Pacient(String nombre, Date fechaNacimiento) {
    super(nombre, fechaNacimiento);
  }

  public List<Suscription> getSuscriptions() {
    return suscriptions;
  }

  public void setSuscriptions(List<Suscription> suscriptions) {
    this.suscriptions = suscriptions;
  }

  public List<Treatment> getSessions() {
    return sessions;
  }

  public void setSessions(List<Treatment> sessions) {
    this.sessions = sessions;
  }
  
 
  
  
  
  public boolean careRequerst() {
    return true;
  }
}
