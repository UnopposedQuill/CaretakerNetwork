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
import models.CareService.CareService;
import models.CareService.ServiceByHour;

import models.User;

/**
 *
 * @author rober
 */
public class Main {

  public static void main(String[] args) {

    DatabaseNoSQL database = DatabaseNoSQL.getNoSQLInstance();

    Datastore data = database.getDataStore();
    User usuario = new User("Salmon", new Date());
    CareService care = new ServiceByHour();
    care.setInicialDate(new Date());
    care.setEndDate(new Date());
    care.setNombre("Servicion Alfonoso");
    database.save(care);

    List<User> listUser = database.getAll(User.class);
    List<ServiceByHour> listService = database.getAll(ServiceByHour.class);
    System.out.println(listService.size());
    for (CareService careservice : listService) {

      System.out.println("hola");
      System.out.println(listService.size());
      System.out.println(careservice.toString());

    }

//    database.save(usuario);
//    
//    List<String> listString = new ArrayList<>();
//    listString.add("aaa");
//    listString.add("cccc");
//    
  }
}
