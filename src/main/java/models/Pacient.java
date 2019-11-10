/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import dev.morphia.annotations.Id;
import dev.morphia.annotations.Property;
import dev.morphia.annotations.Reference;
import java.util.ArrayList;
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
  private String id = ObjectId.get().toString();
 
  private List<CareService> suscriptions = new ArrayList<>();
  private List<Treatment> sessions = new ArrayList<>();
  private List<Disease> disease = new ArrayList<>();
  private User guardian;

  public Pacient(List<Disease> disease, User guardian, String name, Date birthday, Location location, String correo, String gender, String password) {
    super(name, birthday, location, correo, gender, password);
    this.disease = disease;
    this.guardian = guardian;
  }

  
  
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

  public Pacient(List<CareService> suscriptions, List<Treatment> sessions, List<Disease> disease, User guardian, String name, Date birthday, Location location, String correo, String gender, String password) {
    super(name, birthday, location, correo, gender, password);
    this.suscriptions = suscriptions;
    this.sessions = sessions;
    this.disease = disease;
    this.guardian = guardian;
  }
  
   @Override
  public String getId() {
    return id;
  }

   @Override
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

  @Override
  public String toString() {
    return super.toString()+"Pacient{" + "suscriptions=" + suscriptions + ", sessions=" + sessions + ", disease=" + disease + ", guardian=" + guardian + '}';
  }


  
 
  
  
  
  public boolean careRequerst() {
    return true;
  }
}
