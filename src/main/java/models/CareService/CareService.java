/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.CareService;

import dev.morphia.annotations.Id;
import java.util.Date;
import models.Clinic;
import org.bson.types.ObjectId;

/**
 *
 * @author rober2
 */
public abstract class CareService {
  
  @Id
  private String id = ObjectId.get().toString();
  private String nombre;
  private Date inicialDate;
  private Date endDate;
  private CareServiceState estate;
  private String description;
  private int price;
  private Clinic clinic;
  private FactoryCareService.TipoSuscripcion type;
  
  public enum CareServiceState {

  }
  public CareService() {

  }
  
  public boolean suscribe() {
    return false;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Date getInicialDate() {
    return inicialDate;
  }

  public void setInicialDate(Date inicialDate) {
    this.inicialDate = inicialDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public CareServiceState getEstate() {
    return estate;
  }

  public void setEstate(CareServiceState estate) {
    this.estate = estate;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public Clinic getClinic() {
    return clinic;
  }

  public void setClinic(Clinic clinic) {
    this.clinic = clinic;
  }

  @Override
  public String toString() {
    return "CareService{" + "nombre=" + nombre + ", inicialDate=" + inicialDate + ", endDate=" + endDate + ", estate=" + estate + ", description=" + description + ", price=" + price + ", clinic=" + clinic + ", type=" + type + '}';
  }
  
  
}
