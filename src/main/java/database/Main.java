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
import models.CareService.FactoryCareService;
import models.CareService.ServiceByHour;
import models.Clinic;

import models.User;

/**
 *
 * @author rober
 */
public class Main {

  public static void main(String[] args) {

    DatabaseNoSQL database = DatabaseNoSQL.getNoSQLInstance();
    ServiceByHour c = new ServiceByHour("Alfonso", new Date(), new Date(), CareService.CareServiceState.AGENDADO, "asdfasdf", 123123, new Clinic());
    database.save(c);

    List<ServiceByHour> byHour = database.getAll(ServiceByHour.class);
    
    for (ServiceByHour serviceByHour : byHour) {
      System.out.println(serviceByHour.getNombre());
    }

  }
}
