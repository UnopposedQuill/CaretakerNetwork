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
  private String email;
  private String username;
  private String gender;
  private String password;
  
  public User() {
  }

  public User(String name, String username, Date birthday, Location location, String email, String gender, String password) {
    this.name = name;
    this.username = username;
    this.birthday = birthday;
    this.location = location;
    this.email = email;
    this.gender = gender;
    this.password = password;
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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void setPassword(String password) {
    this.password = password;
  }
  
  public boolean matchesPassword(String password){
    return password.contains(this.password);
  }
  
  @Override
  public String toString() {
    return "User{" + "id=" + id + ", name=" + name + ", birthday=" + birthday + ", location=" + location + '}';
  }  
}
