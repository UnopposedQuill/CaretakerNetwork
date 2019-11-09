package models.EmployeeActivities;

import models.Schedules.ScheduleManager;

public class Activity implements ActivityInterface{
  private ScheduleManager scheduleManager;
  private String name;
  private int price;
  public Activity(ScheduleManager scheduleManager) {
    this.scheduleManager = scheduleManager;
  }

  public Activity(ScheduleManager scheduleManager, String name) {
    this.scheduleManager = scheduleManager;
    this.name = name;
  }

  public ScheduleManager getScheduleManager() {
    return scheduleManager;
  }

  public void setScheduleManager(ScheduleManager scheduleManager) {
    this.scheduleManager = scheduleManager;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
  
  
  
  @Override
  public String getDescripcion() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public int getPrecio() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
  
}
