package com.ecole;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="VideoProjecteur")

public class VideoProjecteur {

	@Id
	@GeneratedValue
	@Column(name="id_videoprojecteur")
	private int id_VideoProjecteur;
	
	@Column(name="code")
	private String code;
	
	@Column(name="etat")
	private String etat;
	private Enseignant enseignant;
	public VideoProjecteur(int id_VideoProjecteur,String code,String etat){
		this.id_VideoProjecteur=id_VideoProjecteur;
		this.code=code;
		this.etat=etat;
	}
	public Enseignant getEnseignant() {
		return enseignant;
	}
	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}
	@OneToOne(mappedBy="videoprojecteur", cascade=CascadeType.ALL)
	public int getId_VideoProjecteur() {
		return id_VideoProjecteur;
	}
	public void setId_VideoProjecteur(int id_VideoProjecteur) {
		this.id_VideoProjecteur = id_VideoProjecteur;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}

}
