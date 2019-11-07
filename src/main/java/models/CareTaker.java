/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import dev.morphia.annotations.Id;
import java.rmi.StubNotFoundException;
import java.util.List;
import models.EmployeesStudies.Qualification;
import org.bson.types.ObjectId;

/**
 *
 * @author rober2
 */
public class CareTaker {

  @Id
  private ObjectId id;
  private String careTakerOverview;
  private List<Calification> scores;
  private List<Qualification> especialities;

  public CareTaker() {
  }

  public Qualification categorize() {
    return null;
  }
  
  
  
  
  public ObjectId getId() {
    return id;
  }

  public void setId(ObjectId id) {
    this.id = id;
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
