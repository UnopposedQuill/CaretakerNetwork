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
import dev.morphia.query.UpdateOperator;
import java.util.Date;
import java.util.List;
import models.User;

/**
 *
 * @author rober
 */
public class Main {

  public static void main(String[] args) {

    final Morphia morphia = new Morphia();
    morphia.mapPackage("models");
    MongoClientURI uri = new MongoClientURI("mongodb://heroku_8prjmqnp:k6cum7ua12dcnei86ckg78h8g0@ds339348.mlab.com:39348/heroku_8prjmqnp");
    MongoClient mongoClient = new MongoClient(uri);
    final Datastore datastore = morphia.createDatastore(mongoClient, "heroku_8prjmqnp");

    User usuario = new User("Rob", new Date());
    datastore.save(usuario);
    List<User> usuarioList = datastore.createQuery(User.class).asList();
    System.out.println(usuarioList.get(0).getFechaNacimiento());
    
    UpdateOperations<User> ops = datastore.
        createUpdateOperations(User.class).
        set("nombre", "Alberto");
    
    
   
    
    Query qry = datastore.createQuery(User.class);
   
    
  //  datastore.delete(qry);
    
  //  datastore.update(qry, ops);
    
    
    System.out.println(usuarioList.get(0).getFechaNacimiento());
    
  }
}
