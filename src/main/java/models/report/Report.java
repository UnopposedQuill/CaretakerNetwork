/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.report;

import java.util.Date;
import java.util.List;
import models.CareService.CareService;

/**
 *
 * @author rober2
 */
public class Report {
    private Date fechaIncial;
    private Date fechaFinal;
    private boolean inputPrice;
    private boolean inputNumberServices;
    private CareService.CareServiceType tipoServicio;
    private String employyeSelected;
    private String clientSelected;
    private String nombreCentro;
    private String[] columns;
    private String[][] rows;

  public boolean isInputPrice() {
    return inputPrice;
  }

  public void setInputPrice(boolean inputPrice) {
    this.inputPrice = inputPrice;
  }

  public boolean isInputNumberServices() {
    return inputNumberServices;
  }

  public void setInputNumberServices(boolean inputNumberServices) {
    this.inputNumberServices = inputNumberServices;
  }
  
  public Date getFechaIncial() {
    return fechaIncial;
  }

  public void setFechaIncial(Date fechaIncial) {
    this.fechaIncial = fechaIncial;
  }

  public Date getFechaFinal() {
    return fechaFinal;
  }

  public void setFechaFinal(Date fechaFinal) {
    this.fechaFinal = fechaFinal;
  }

  public CareService.CareServiceType getTipoServicio() {
    return tipoServicio;
  }

  public void setTipoServicio(CareService.CareServiceType tipoServicio) {
    this.tipoServicio = tipoServicio;
  }

  

  public String getEmployyeSelected() {
    return employyeSelected;
  }

  public void setEmployyeSelected(String employyeSelected) {
    this.employyeSelected = employyeSelected;
  }

  public String getClientSelected() {
    return clientSelected;
  }

  public void setClientSelected(String clientSelected) {
    this.clientSelected = clientSelected;
  }

  public String getNombreCentro() {
    return nombreCentro;
  }

  public void setNombreCentro(String nombreCentro) {
    this.nombreCentro = nombreCentro;
  }

  public String[] getColumns() {
    return columns;
  }

  public void setColumns(String[] columns) {
    this.columns = columns;
  }

  public String[][] getRows() {
    return rows;
  }

  public void setRows(String[][] rows) {
    this.rows = rows;
  }

  @Override
  public String toString() {
    return "Report{" + "fechaIncial=" + fechaIncial + ", fechaFinal=" + fechaFinal + ", inputPrice=" + inputPrice + ", inputNumberServices=" + inputNumberServices + ", tipoServicio=" + tipoServicio + ", employyeSelected=" + employyeSelected + ", clientSelected=" + clientSelected + ", nombreCentro=" + nombreCentro + ", columns=" + columns + ", rows=" + rows + '}';
  }
  
  
  
  public boolean generarReporte() {
    return true;
  }
    
    
    
    
    
}
