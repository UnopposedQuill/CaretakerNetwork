/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import com.mongodb.MongoClient;
import dev.morphia.Datastore;
import dev.morphia.Morphia;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rober
 */
public class DatabaseManager {
  public static enum DatabaseTypes {
    NOSQL,SQL,GRAPH
  }
  DatabaseInterface database;
  
  public DatabaseManager() {
    
  }
  public DatabaseManager(String databaseType) {
    if(databaseType.equals(DatabaseTypes.NOSQL)) {
      database = new DatabaseNoSQL();
    } else {
      try {
        throw new Exception();
      } catch (Exception ex) {
        Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    
  }

}
