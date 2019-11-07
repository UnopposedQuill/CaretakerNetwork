/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author rober2
 */
public class Calification {
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
