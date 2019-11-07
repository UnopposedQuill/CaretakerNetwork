/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import dev.morphia.Datastore;
import dev.morphia.Morphia;
import dev.morphia.query.Query;
import dev.morphia.query.UpdateOperations;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import models.User;

/**
 *
 * @author rober
 */
public class Main {

  public static void main(String[] args) {

    DatabaseNoSQL database = new DatabaseNoSQL();
    User usuario = new User("Atun", new Date());
    
    List<User> listUser = database.getAll(User.class);
    //database.delete(listUser.get(0));
    for (User user : listUser) {
      System.out.println(user.getNombre());
    }
    
    
    List<String> listString = new ArrayList<>();
    listString.add("aaa");
    listString.add("cccc");
    
  }
}
