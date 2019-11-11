/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;
import java.util.List;
import models.EmployeeActivities.Activity;
import models.Schedules.ScheduleManager;
import org.bson.types.ObjectId;

/**
 *
 * @author rober2
 */
public class Employee extends User{
    private String id = ObjectId.get().toString();
    private List<Activity> activities;
    private Job job;
    private String employeeCode; 
    private Privilegios privilegio;
    private ScheduleManager scheduleManager;
    public static enum Privilegios{
      ADMINISTRATIVO, BACKOFFICE, CARETAKER
    }

  public Employee() {
  }

  public Employee(List<Activity> activities, Job job, String employeeCode, Privilegios privilegio, ScheduleManager scheduleManager, String name, String username, Date birthday, Location location, String correo, String gender, String password) {
    super(name, username, birthday, location, correo, gender, password);
    this.activities = activities;
    this.job = job;
    this.employeeCode = employeeCode;
    this.privilegio = privilegio;
    this.scheduleManager = scheduleManager;
  }

  public Employee(Privilegios privilegio, String name, String username, Date birthday, Location location, String correo, String gender, String password) {
    super(name, username, birthday, location, correo, gender, password);
    this.privilegio = privilegio;
  }

  public Privilegios getPrivilegio() {
    return privilegio;
  }

  public void setPrivilegio(Privilegios privilegio) {
    this.privilegio = privilegio;
  }

    @Override
  public String getId() {
    return id;
  }

    @Override
  public void setId(String id) {
    this.id = id;
  }

  public List<Activity> getActivities() {
    return activities;
  }

  public void setActivities(List<Activity> activities) {
    this.activities = activities;
  }

  public Job getJob() {
    return job;
  }

  public void setJob(Job job) {
    this.job = job;
  }

  public String getEmployeeCode() {
    return employeeCode;
  }

  public void setEmployeeCode(String employeeCode) {
    this.employeeCode = employeeCode;
  }


  public ScheduleManager getScheduleManager() {
    return scheduleManager;
  }

  public void setScheduleManager(ScheduleManager scheduleManager) {
    this.scheduleManager = scheduleManager;
  }

  @Override
  public String toString() {
    return "Employee{" + "id=" + id + ", activities=" + activities + ", job=" + job + ", employeeCode=" + employeeCode + ", privilegio=" + privilegio + ", scheduleManager=" + scheduleManager + '}';
  }

  



}
