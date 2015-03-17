package com.ecole;

import java.util.Date;

public class Actualite {
 private int id_Actualite;
 private String titre;
 private String sujet;
 private Date date_act;
 public Actualite(int id_Actualite,String titre,String sujet,Date date_act){
	 this.id_Actualite=id_Actualite;
	 this.titre=titre;
	 this.sujet=sujet;
	 this.date_act=date_act;
 }
public String getTitre() {
	return titre;
}
public int getId_Actualite() {
	return id_Actualite;
}
public void setId_Actualite(int id_Actualite) {
	this.id_Actualite = id_Actualite;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getSujet() {
	return sujet;
}
public void setSujet(String sujet) {
	this.sujet = sujet;
}
public Date getDate_act() {
	return date_act;
}
public void setDate_act(Date date_act) {
	this.date_act = date_act;
}
}
