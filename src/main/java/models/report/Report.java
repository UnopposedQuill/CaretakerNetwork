/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.report;

import java.util.Date;
import java.util.List;

/**
 *
 * @author rober2
 */
public class Report {
    private Date fechaIncial;
    private Date fechaFinal;
    private int inputPrice;
    private int inputNumberServices;
    private String tipoServicio;
    private String employyeSelected;
    private String clientSelected;
    private String nombreCentro;
    private List<String> columns;
    private List<String> rows;

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

  public int getInputPrice() {
    return inputPrice;
  }

  public void setInputPrice(int inputPrice) {
    this.inputPrice = inputPrice;
  }

  public int getInputNumberServices() {
    return inputNumberServices;
  }

  public void setInputNumberServices(int inputNumberServices) {
    this.inputNumberServices = inputNumberServices;
  }

  public String getTipoServicio() {
    return tipoServicio;
  }

  public void setTipoServicio(String tipoServicio) {
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

  public List<String> getColumns() {
    return columns;
  }

  public void setColumns(List<String> columns) {
    this.columns = columns;
  }

  public List<String> getRows() {
    return rows;
  }

  public void setRows(List<String> rows) {
    this.rows = rows;
  }
    
    
    
    
    
}