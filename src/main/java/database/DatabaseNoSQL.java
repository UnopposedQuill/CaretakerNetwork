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
import java.util.List;

/**
 *
 * @author rober2
 */
public class DatabaseNoSQL implements DatabaseInterface {

  final private Datastore datastore;
  private static DatabaseNoSQL database;
  
  private DatabaseNoSQL() {
    final Morphia morphia = new Morphia();
    morphia.mapPackage("models");
    MongoClientURI uri = new MongoClientURI("mongodb://heroku_8prjmqnp:k6cum7ua12dcnei86ckg78h8g0@ds339348.mlab.com:39348/heroku_8prjmqnp");
    MongoClient mongoClient = new MongoClient(uri);
    this.datastore = morphia.createDatastore(mongoClient, "heroku_8prjmqnp");

  }
  
   public DatabaseNoSQL(String nombre) {
    final Morphia morphia = new Morphia();
    morphia.mapPackage("models");
    MongoClientURI uri = new MongoClientURI("mongodb://heroku_8prjmqnp:k6cum7ua12dcnei86ckg78h8g0@ds339348.mlab.com:39348/heroku_8prjmqnp");
    MongoClient mongoClient = new MongoClient(uri);
    this.datastore = morphia.createDatastore(mongoClient, "heroku_8prjmqnp");

  }
  
  public static DatabaseNoSQL getNoSQLInstance() {
    if(database == null) {
      database = new DatabaseNoSQL();
    }
    return database;
  }
  
  @Override
  public <T> List<T> getAll(Class<T> type) {
    return this.datastore.createQuery(type).asList();
  }

  @Override
  public <T> T get(Class<T> type) {
    List<T> lp = this.datastore.createQuery(type).asList();
    return lp.get(0);
  }

  @Override
  public <T> boolean update(Class<T> type, List<String> names, List<String> values) {
    for (int i = 0; i < names.size(); i++) {
      this.datastore.createUpdateOperations(type).set(names.get(i), values.get(i));
    }
    return true;
  }

  @Override
  public <T> boolean updateByID(Class<T> type, String id, String field, Object value) {
    Query<T> query = datastore.createQuery(type).field("_id").equal(id);
    UpdateOperations<T> ops = datastore.createUpdateOperations(type).set(field, value);
    
    datastore.update(query, ops);
    return true;
  }
  
  @Override
  public <T> boolean delete(T t) {
    this.datastore.delete(t);
    return true;

  }

  @Override
  public <T> boolean save(T t) {
    this.datastore.save(t);
    return true;
  }
  
  public Datastore getDataStore() {
    return this.datastore;
  }
}
