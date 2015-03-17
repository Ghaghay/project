package com.ecole;

import java.util.Date;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
@Entity
@Table(name="enseignant")

public class Enseignant extends Personne{
	
	@Column(name="date_emb")
	@GeneratedValue(generator="gen")
	@GenericGenerator(name="gen", strategy="foreign", parameters=@Parameter(name="property", value="videoprojecteur"))
	private Date dateEmbauche;
	
	private Cours cours;
	@OneToMany(mappedBy="enseignant", cascade=CascadeType.ALL)
	public Cours getCours() {
		return cours;
	}
	public void setCours(Cours cours) {
		this.cours = cours;
	}
	public Enseignant(int id_Personne,String cin,String nom,String prenom, Date date_naissance, String email, String telephone,Date date_emb){
		   super(id_Personne, cin, nom,prenom, date_naissance,email,telephone);
		   this.dateEmbauche=date_emb;
	}
	public Date getDate_emb() {
		return dateEmbauche;
	}
	public void setDate_emb(Date date_emb) {
		this.dateEmbauche = date_emb;
	}

}
