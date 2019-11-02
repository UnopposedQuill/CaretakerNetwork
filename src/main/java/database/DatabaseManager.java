/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import com.mongodb.MongoClient;
import dev.morphia.Datastore;
import dev.morphia.Morphia;

/**
 *
 * @author rober
 */
public class DatabaseManager {

    public DatabaseManager() {
        final Morphia morphia = new Morphia();
        morphia.mapPackage("dev.morphia.example");
        final Datastore datastore = morphia.createDatastore(new MongoClient(), "morphia_example");
        datastore.ensureIndexes();
    }
    
    
}
