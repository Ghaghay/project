package com.ecole;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="personne")


public class Personne {
	@Id
	@GeneratedValue
	@Column(name="personne_id")
	private int id_Personne;
	@Column(name="cin")
	private String cin;
	@Column(name="nom")
	private String nom;
	@Column(name="prenom")
	private String prenom;
	@Column(name="date_naissance")
	private Date date_naissance;
	@Column(name="email")
	private String email;
	@Column(name="telephone")
	private String telephone;
	public Compte getCompte_personne() {
		return compte_personne;
	}

	public void setCompte_personne(Compte compte_personne) {
		this.compte_personne = compte_personne;
	}
	@OneToOne(mappedBy="personne", cascade=CascadeType.ALL)
	private Compte compte_personne;
public Personne(int id_Personne,String cin,String nom,String prenom, Date date_naissance, String email, String telephone){
	this.id_Personne=id_Personne;
	this.cin=cin;
	this.nom=nom;
	this.prenom=prenom;
	this.date_naissance=date_naissance;
	this.email=email;
	this.telephone=telephone;
	
}

public int getId_Personne() {
	return id_Personne;
}
public void setId_Personne(int id_Personne) {
	this.id_Personne = id_Personne;
}
public String getCin() {
	return cin;
}
public void setCin(String cin) {
	this.cin = cin;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public Date getDate_naissance() {
	return date_naissance;
}
public void setDate_naissance(Date date_naissance) {
	this.date_naissance = date_naissance;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getTelephone() {
	return telephone;
}
public void setTelephone(String telephone) {
	this.telephone = telephone;
}

}
