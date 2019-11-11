/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import dev.morphia.annotations.Id;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author rober2
 */
public class Clinic {
  @Id
  private String id = ObjectId.get().toString();
  private String name;
  private List<Employee> employees;
  private Location location;
  private boolean active;

  public Clinic() {
  }

  public Clinic(String name, List<Employee> employees, Location location) {
    this.name = name;
    this.employees = employees;
    this.location = location;
    this.active = true;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }
}
