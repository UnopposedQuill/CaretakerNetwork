/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.CareService;

import dev.morphia.annotations.Id;
import java.util.Date;
import models.CareTaker;
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
  private Date initDate;
  private Date endDate;
  private CareServiceState estate;
  private String description;
  private int price;
  private Clinic clinic;
  private CareTaker careTaker;
  private CareServiceType type;
  public enum CareServiceState {
    AGENDADO,ENCURSO,FINALIZADO
  }
  public enum CareServiceType {
    PORMES, NOCTURNO, PORHORA,NINOS,ADULTOS,PERSONALIZADO,ANIO
  }

  public CareService() {

  }

  public CareService(String nombre, Date initDate, Date endDate, CareServiceState estate, String description, int price, Clinic clinic) {
    this.nombre = nombre;
    this.initDate = initDate;
    this.endDate = endDate;
    this.estate = estate;
    this.description = description;
    this.price = price;
    this.clinic = clinic;
  }
  
  public boolean suscribe() {
    return false;
  }

  public Date getInitDate() {
    return initDate;
  }

  public void setInitDate(Date initDate) {
    this.initDate = initDate;
  }

  public CareServiceType getType() {
    return type;
  }

  public void setType(CareServiceType type) {
    this.type = type;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Date getInicialDate() {
    return initDate;
  }

  public void setInicialDate(Date inicialDate) {
    this.initDate = inicialDate;
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

  public CareTaker getCareTaker() {
    return careTaker;
  }

  public void setCareTaker(CareTaker careTaker) {
    this.careTaker = careTaker;
  }

  
  @Override
  public String toString() {
    return "CareService{" + "nombre=" + nombre + ", inicialDate=" + initDate + ", endDate=" + endDate + ", estate=" + estate + ", description=" + description + ", price=" + price + ", clinic=" + clinic + ", type=" + type + '}';
  }
  
  
}
