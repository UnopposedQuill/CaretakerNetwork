/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import dev.morphia.annotations.Id;
import org.bson.types.ObjectId;

/**
 *
 * @author rober2
 */
public class Location {
    @Id
  private String id = ObjectId.get().toString();
  private String location;
  private String country;
  private String region;

  public Location() {
  }

  public Location(String location) {
    this.location = location;
  }

  public Location(String location, String country, String region) {
    this.location = location;
    this.country = country;
    this.region = region;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

 

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }
  
  
  
}
