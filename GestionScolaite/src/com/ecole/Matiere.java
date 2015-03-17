package com.ecole;

public class Matiere {
	private int id_Matiere;
	private String nom_matiere;
	private String duree;
	private float coeficient;
	private String description_matiere;
	private String type;
	public Matiere(int id_Matiere,String nom_matiere, String duree, float coeficient, String description_matiere, String type){
		this.id_Matiere=id_Matiere;
		this.nom_matiere=nom_matiere;
		this.duree=duree;
		this.coeficient=coeficient;
		this.description_matiere=description_matiere;
		this.type=type;
	}
	public int getId_Matiere() {
		return id_Matiere;
	}
	public void setId_Matiere(int id_Matiere) {
		this.id_Matiere = id_Matiere;
	}
	public String getNom_matiere() {
		return nom_matiere;
	}
	public void setNom_matiere(String nom_matiere) {
		this.nom_matiere = nom_matiere;
	}
	public String getDuree() {
		return duree;
	}
	public void setDuree(String duree) {
		this.duree = duree;
	}
	public float getCoeficient() {
		return coeficient;
	}
	public void setCoeficient(float coeficient) {
		this.coeficient = coeficient;
	}
	public String getDescription_matiere() {
		return description_matiere;
	}
	public void setDescription_matiere(String description_matiere) {
		this.description_matiere = description_matiere;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
