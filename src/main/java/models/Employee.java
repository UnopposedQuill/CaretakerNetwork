/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import dev.morphia.annotations.Id;
import java.util.List;
import models.EmployeeActivities.Activity;
import org.bson.types.ObjectId;

/**
 *
 * @author rober2
 */
public class Employee extends User{
    @Id
    private String id = ObjectId.get().toString();
    private List<Activity> activities;
    private Job job;
    private String employeeCode; 
    private String privilegio;

    public static enum Privilegios{
      Administrativo, Backoffice
    }




}
