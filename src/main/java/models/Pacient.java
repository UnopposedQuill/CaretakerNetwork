/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import dev.morphia.annotations.Id;
import java.util.Date;
import java.util.List;
import models.CareService.CareService;
import models.CareService.Disease;
import models.CareService.Treatment;
import org.bson.types.ObjectId;


/**
 *
 * @author rober2
 */
public class Pacient extends User {
   @Id
  private String id = ObjectId.get().toString();
  private List<CareService> suscriptions;
  private List<Treatment> sessions;
  private List<Disease> disease;
  private User guardian;

  public Pacient() {
  }

  public void setDisease(List<Disease> disease) {
    this.disease = disease;
  }

  public User getGuardian() {
    return guardian;
  }

  public void setGuardian(User guardian) {
    this.guardian = guardian;
  }

  
  public Pacient(String nombre, Date fechaNacimiento) {
    super(nombre, fechaNacimiento);
  }

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public List<Disease> getDisease() {
    return disease;
  }
  
  public List<CareService> getSuscriptions() {
    return suscriptions;
  }

  public void setSuscriptions(List<CareService> suscriptions) {
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
