/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.CareService;

import java.util.Date;

/**
 *
 * @author rober2
 */
public abstract class Suscription {
    private enum EstadoSuscripcion{
       SOLICITADA, ENCURSO, FINALIZADA
    }
    
    private String nombre;
    private Date initDate;
    private Date endDate;
    
}
