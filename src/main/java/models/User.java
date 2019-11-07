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
  private ObjectId id;
  private String name;
  private Date birthday;
  private Location location;
  
  public User() {
  }

  public User(String nombre, Date fechaNacimiento) {
    this.name = nombre;
    this.birthday = fechaNacimiento;
  }

  public ObjectId getId() {
    return id;
  }

  public void setId(ObjectId id) {
    this.id = id;
  }

  public String getNombre() {
    return name;
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

}
