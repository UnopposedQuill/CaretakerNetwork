/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.CareService;

/**
 *
 * @author rober2
 */
public class FactoryCareService {
 
  public FactoryCareService() {
    
    
  }
    
  public CareService getInstance(CareService.CareServiceType type) {
    if(CareService.CareServiceType.ADULTOS == type) {
      CareService careService = new ServiceAdult();
      return careService;
    }
    if(CareService.CareServiceType.ANIO == type) {
      CareService careService = new ServiceAdult();   
      return careService;
    }
    if(CareService.CareServiceType.NINOS == type) {
      CareService careService = new ServiceAdult();
      return careService;
    }    
    if(CareService.CareServiceType.NOCTURNO == type) {
      CareService careService = new ServiceAdult();   
      return careService;
    }
    if(CareService.CareServiceType.PERSONALIZADO== type) {
      CareService careService = new ServiceAdult();
      return careService;
    }
    if(CareService.CareServiceType.PORHORA == type) {
      CareService careService = new ServiceByHour();
      return careService;
    }
    if(CareService.CareServiceType.PORMES == type) {
      CareService careService = new ServiceByMonth();
      return careService;
    }
    return null;
  }
  
  
  
}
