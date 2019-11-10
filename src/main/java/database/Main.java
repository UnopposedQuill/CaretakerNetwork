/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import models.CareService.CareService;
import models.CareService.Disease;
import models.CareService.ServiceByHour;
import models.Clinic;
import models.Employee;
import models.Location;
import models.Pacient;
import models.User;
import models.report.BuilderReport;
import models.report.Report;

/**
 *
 * @author rober
 */
public class Main {

  public static void main(String[] args) {

    DatabaseNoSQL database = DatabaseNoSQL.getNoSQLInstance();
    Employee e = new Employee(Employee.Privilegios.ADMINISTRATIVO, "AAAAaaa", "huiqdnqwbname", new Date(), new Location(), "asdfasf", "Hombre", "123f132");
    database.save(e);
        
    BuilderReport reportBuilder = new BuilderReport();
    Calendar calendar = Calendar.getInstance();
    calendar.set(2017, 11, 17);
    Calendar calendar2 = Calendar.getInstance();
    calendar2.set(2021, 07, 07);
    
    Report report = reportBuilder.setByEmployee("aaa").setByPacient("rto").
        setDateRange(calendar.getTime(), calendar2.getTime()).build();
    
//    List<Disease> diseases = new ArrayList<>();
//    Disease d = new Disease("Alefdgsdgrgia");
//    Pacient pacient = new Pacient(diseases, new User("SiGsdfgsdfguardian", new Date()), "aaaarto", "Usernameiojqwij", new Date(), new Location(),"asdff@asdasdf.com" , "Mujer", "1234");
//    
//    ServiceByHour c = new ServiceByHour("Asaaao", "Usernameiojqwij", new Date(), new Date(), CareService.CareServiceState.FINALIZADO, "asdfa", 23, new Clinic());
//    List<CareService> lc = new ArrayList<>();
//    lc.add(c);
//    pacient.setSuscriptions(lc);
//    database.save(pacient);
//    
//    List<Pacient> pList = database.getAll(Pacient.class);
//    
//    pList.forEach((t) -> {
//      System.out.println(t.toString());
//    });
//    
    
//    ServiceByHour c = new ServiceByHour("Alfonso", new Date(), new Date(), CareService.CareServiceState.AGENDADO, "asdfasdf", 123123, new Clinic());
//    ServiceByMonth c2 = new ServiceByMonth("Alfonso", new Date(), new Date(), CareService.CareServiceState.AGENDADO, "asdfasdf", 123123, new Clinic());
//    ServiceByCustom c3 = new ServiceByCustom("Alfonso", new Date(), new Date(), CareService.CareServiceState.AGENDADO, "asdfasdf", 123123, new Clinic());
//    ServiceByYear c4 = new ServiceByYear("Aaaaa", new Date(), new Date(), CareService.CareServiceState.AGENDADO, "asdfasdf", 123123, new Clinic());
//
//    database.save(c);
//    database.save(c2);
//    database.save(c3);
//    database.save(c4);
//
//    List<ServiceByHour> byHour = database.getAll(ServiceByHour.class);
//    List<ServiceByCustom> byCustom = database.getAll(ServiceByCustom.class);
//    List<ServiceByMonth> byMonth = database.getAll(ServiceByMonth.class);
//    List<ServiceByYear> byYear = database.getAll(ServiceByYear.class);
//    
//    List<CareService> allCare = new ArrayList<>();
//    allCare.addAll(byHour);
//    allCare.addAll(byCustom);
//    allCare.addAll(byMonth);
//    allCare.addAll(byYear);
//    
//    for (CareService careService : allCare) {
//      System.err.println(careService.getNombre()+ careService.getType());
//    }
//    
//    
//    for (ServiceByHour serviceByHour : byHour) {
//      System.out.println(serviceByHour.getNombre());
//    }

  }
}
