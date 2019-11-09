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
  
}
