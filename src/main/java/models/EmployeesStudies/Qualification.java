/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.EmployeesStudies;

import models.CareService.CareService;

/**
 *
 * @author rober2
 */
public abstract class Qualification {
    private String nombre;
    private String descripcion;
    private CareService.CareServiceType type;
    
    public int getPrice(){ return 0; }
    public CareService.CareServiceType getCategory(){ return null; }

}
