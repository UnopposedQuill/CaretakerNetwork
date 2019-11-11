
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.Schedules;

import java.util.ArrayList;
import java.util.List;
import models.EmployeeActivities.Activity;

/**
 *
 * @author rober
 */
public class ScheduleManager {

  private List<Schedule> schedulues = new ArrayList<>();
  private List<Activity> activities = new ArrayList<>();

  public ScheduleManager(List<Schedule> schedulues) {
    this.schedulues = schedulues;
  }

  public ScheduleManager(List<Schedule> schedulues, List<Activity> activities) {
    this.schedulues = schedulues;
    this.activities = activities;
  }
  

  public ScheduleManager() {
    this.schedulues = new ArrayList<>();
  }
  public String getHorario() {
    String horario = "";
    for (Schedule schedulue : schedulues) {
      horario+= schedulue.getDay()+"-"+schedulue.getInitHour()+"-"+schedulue.getEndHour();
    }
    
    return horario;
  }
  
  public boolean addScheduale(Schedule schedule) {
    for (Schedule schedulueL : schedulues) {
      if(schedule.getDay() == schedulueL.getDay()) {
        if(schedule.getInitHour()> schedulueL.getInitHour()) {
          if(schedule.getEndHour()< schedulueL.getEndHour()) {
            return false;
          } 
        }
      }
      
    }
    this.schedulues.add(schedule);
    return true;
  }
  
  public boolean isAvalible(Schedule.Days dayAvalible, int start, int end) {
    boolean isAvalible = false;
    for (Schedule schedule : schedulues) {
      System.out.println("ssss "+schedule.getDay() +"---" + dayAvalible);
      if(schedule.getDay() == dayAvalible) {
        if(!isAvalibleSchedule(schedule, dayAvalible, start, end)) { 
          return false;
        }
      }
    }
    return true;
//    for (Activity activity : activities) {
//      for (Schedule schedule : activity.getScheduleManager().getSchedulues()) {        
//        System.out.println("Acti "+!isAvalibleSchedule(schedule, dayAvalible, start, end));
//        if(!isAvalibleSchedule(schedule, dayAvalible, start, end)) { 
//          return false; 
//        }
//      }
//    }    
  }

  public boolean isAvalibleSchedule(Schedule schedule, Schedule.Days dayAvalible, int start, int end) {
    if(schedule.getDay().equals(dayAvalible)) {
      if(schedule.getInitHour()< start) {
        if(schedule.getEndHour() > end) {
          return true;
        }
      }
    }
    return false;
  }
  
  public boolean range(int min,int max,int value) {
    return value >= min && value <= max;
  }
  public List<Schedule> getSchedulues() {
    return schedulues;
  }

  public void setSchedulues(List<Schedule> schedulues) {
    this.schedulues = schedulues;
  }

}
