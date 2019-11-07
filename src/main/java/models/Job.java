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
public class Job {
    @Id
    private ObjectId id;
    private String name;
    private String description;
    private String responsabilities;

  public Job() {
  }

  public Job(String name, String description, String responsabilities) {
    this.name = name;
    this.description = description;
    this.responsabilities = responsabilities;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getResponsabilities() {
    return responsabilities;
  }

  public void setResponsabilities(String responsabilities) {
    this.responsabilities = responsabilities;
  }
    
    
}
