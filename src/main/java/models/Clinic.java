/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.List;

/**
 *
 * @author rober2
 */
public class Clinic {
  private String name;
  private List<Employee> employees;
  private Location location;

  public Clinic() {
  }

  public Clinic(String name, List<Employee> employees, Location location) {
    this.name = name;
    this.employees = employees;
    this.location = location;
  }
  

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Employee> getEmployees() {
    return employees;
  }

  public void setEmployees(List<Employee> employees) {
    this.employees = employees;
  }

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }
  
  
  
}
