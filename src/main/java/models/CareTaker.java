/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import models.CareService.CareService;
import models.EmployeesStudies.Qualification;
import org.bson.types.ObjectId;

/**
 *
 * @author rober2
 */
public class CareTaker extends Employee{

  private String id = ObjectId.get().toString();
  private String careTakerOverview;
  private List<Calification> scores;
  private List<Qualification> especialities;
  private List<CareService> careServices;

  public CareTaker() {
  }

  
  public CareTaker(Privilegios privilege, String name, String username, Date birthday, Location location, String email, String gender, String password) {
    super(Privilegios.CARETAKER, name, username, birthday, location, gender, gender, password);
    this.scores = new ArrayList<>();
    this.especialities = new ArrayList<>();
    this.careServices = new ArrayList<>();
    this.careTakerOverview = "";
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
  
  public int getCost(){
    return 0 + this.especialities.stream().mapToInt(e->e.getPrice()).sum();
  }
  
  public int getRatingAverage(){
    return (100+this.scores.stream().mapToInt(e->e.getCalification()).sum())/this.scores.size()+1;
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
