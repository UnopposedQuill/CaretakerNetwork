/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;
import java.util.List;
import models.CareService.CareService;
import models.EmployeesStudies.Qualification;
import org.bson.types.ObjectId;

/**
 *
 * @author rober2
 */
public class CareTaker extends User{

  private String id = ObjectId.get().toString();
  private String careTakerOverview;
  private List<Calification> scores;
  private List<Qualification> especialities;
  private List<CareService> careServices;

  public CareTaker() {
  }

  public CareTaker(String name, String username, Date birthday, Location location, String email, String gender, String password) {
    super(name, username, birthday, location, email, gender, password);
  }

  public Qualification categorize() {
    return null;
  }

  @Override
  public String getId() {
    return id;
  }

  @Override
  public void setId(String id) {
    this.id = id;
  }

  public List<CareService> getCareServices() {
    return careServices;
  }

  public void setCareServices(List<CareService> careServices) {
    this.careServices = careServices;
  }
  
  
  
  


  public String getCareTakerOverview() {
    return careTakerOverview;
  }

  public void setCareTakerOverview(String careTakerOverview) {
    this.careTakerOverview = careTakerOverview;
  }

  public List<Calification> getScores() {
    return scores;
  }

  public void setScores(List<Calification> scores) {
    this.scores = scores;
  }

  public List<Qualification> getEspecialities() {
    return especialities;
  }

  public void setEspecialities(List<Qualification> especialities) {
    this.especialities = especialities;
  }
  
}
