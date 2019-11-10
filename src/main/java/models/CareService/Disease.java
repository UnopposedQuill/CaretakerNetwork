/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.CareService;

import java.util.List;

/**
 *
 * @author rober
 */
public class Disease {
  private String name;
  private List<Treatment> treatments;

  public Disease(String name) {
    this.name = name;
  }

  public Disease() { }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Treatment> getTreatments() {
    return treatments;
  }

  public void setTreatments(List<Treatment> treatments) {
    this.treatments = treatments;
  }
  
  
  
}
