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
public class Calification {
  @Id
  private String id = ObjectId.get().toString();
  private String comment;
  private String calification;

  public Calification() {
  }

  public Calification(String comment, String calification) {
    this.comment = comment;
    this.calification = calification;
  }

  public String getComment() {
    return comment;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public String getCalification() {
    return calification;
  }

  public void setCalification(String calification) {
    this.calification = calification;
  }
  
  
}
