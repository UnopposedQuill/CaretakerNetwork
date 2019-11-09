/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import dev.morphia.annotations.Id;
import java.util.Date;
import org.bson.types.ObjectId;

/**
 *
 * @author rober
 */
public class User {

  @Id
  private String id = ObjectId.get().toString();
  private String name;
  private Date birthday;
  private Location location;
  
  public User() {
  }

  public User(String nombre, Date fechaNacimiento) {
    this.name = nombre;
    this.birthday = fechaNacimiento;
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

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }


  
  public String getNombre() {
    return this.name;
  }

  public void setNombre(String nombre) {
    this.name = nombre;
  }

  public Date getFechaNacimiento() {
    return birthday;
  }

  public void setFechaNacimiento(Date fechaNacimiento) {
    this.birthday = fechaNacimiento;
  }

  @Override
  public String toString() {
    return "User{" + "id=" + id + ", name=" + name + ", birthday=" + birthday + ", location=" + location + '}';
  }  
}
