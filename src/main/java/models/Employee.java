/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.List;
import models.EmployeeActivities.Activity;

/**
 *
 * @author rober2
 */
public class Employee extends User{
    private List<Activity> activities;
    private Job job;
    
}