/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.EmployeeActivities;

import java.util.ArrayList;
import java.util.List;
import models.Employee;

/**
 *
 * @author rober2
 */
public class ActivitiesManager {
  
  
  
  /** This is the manager for activities you need to give a employee and they get back the activities
   * 
   * @param employee 
   */
  public ActivitiesManager() {
  
  }
  
  public List<Activity> getActivities(Employee employee) {
    List<Activity> activities = new ArrayList<>();
    
    return activities; 
  }
  
  
}
