/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.Schedules;

/**
 *
 * @author rober
 */
public class Schedule {
  
  public enum Days {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
  }
  
  private int endHour;
  private int initHour;
  private Days day;

  public Schedule(int endHour, int initHour, Days day) {
    this.endHour = endHour;
    this.initHour = initHour;
    this.day = day;
  }

  public int getEndHour() {
    return endHour;
  }

  public void setEndHour(int endHour) {
    this.endHour = endHour;
  }

  public int getInitHour() {
    return initHour;
  }

  public void setInitHour(int initHour) {
    this.initHour = initHour;
  }

  public Days getDay() {
    return day;
  }

  public void setDay(Days day) {
    this.day = day;
  }
  
  
  
  
  
}
