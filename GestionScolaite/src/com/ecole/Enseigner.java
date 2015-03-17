package com.ecole;

import java.util.Date;

public class Enseigner {
  private Date date_seance;
  public Enseigner(Date date_seance){
	  this.date_seance=date_seance;
  }
public Date getDate_seance() {
	return date_seance;
}
public void setDate_seance(Date date_seance) {
	this.date_seance = date_seance;
}
}
