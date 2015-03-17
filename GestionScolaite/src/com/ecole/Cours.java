package com.ecole;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
@Entity
@Table(name="cours")
public class Cours {
	@Id
	@Column(name="id_cours", unique=true)
	@GeneratedValue(generator="gen")
	@GenericGenerator(name="gen", strategy="foreign", parameters=@Parameter(name="property", value="enseignant"))
	
	private int id_Cours;
	
	@Column(name="nom_cours")
	private String nom_cours;
	
	@Column(name="description")
	private String description;
	@OneToMany
	@PrimaryKeyJoinColumn
    private Enseignant enseignant;
	


	
	public Cours(int id_Cours,String nom_cours,String description ){
		this.id_Cours=id_Cours;
		this.nom_cours=nom_cours;
		this.description=description;
		
	}
	public int getId_Cours() {
		return id_Cours;
	}
	public void setId_Cours(int id_Cours) {
		this.id_Cours = id_Cours;
	}
	public String getNom_cours() {
		return nom_cours;
	}
	public void setNom_cours(String nom_cours) {
		this.nom_cours = nom_cours;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
