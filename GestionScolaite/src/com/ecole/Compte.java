package com.ecole;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="compte")
public class Compte {
	@Id
	@Column(name="id_compte", unique=true)
	@GeneratedValue(generator="gen")
	@GenericGenerator(name="gen", strategy="foreign", parameters=@Parameter(name="property", value="personne"))
	
	private int id_Compte;
	
	@Column(name="login")
	private String login;
	
	@Column(name="mdp")
	private String mdp;
	
	@Column(name="profil")
	private String profil;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Personne personne;

	public Compte(int id_Compte,String login, String mdp, String profil){
		this.id_Compte=id_Compte;
		this.login=login;
		this.mdp=mdp;
		this.profil=profil;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getId_Compte() {
		return id_Compte;
	}
	public void setId_Compte(int id_Compte) {
		this.id_Compte = id_Compte;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public String getProfil() {
		return profil;
	}
	public void setProfil(String profil) {
		this.profil = profil;
	}

}
