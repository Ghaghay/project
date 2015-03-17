package com.ecole;

import java.util.Date;

public class Commentaire {
	private int id_Commentaire;
	private Date date_commentaire;
	public Commentaire(int id_Commentaire,Date date_commentaire){
		this.id_Commentaire=id_Commentaire;
		this.date_commentaire=date_commentaire;
	}
	public int getId_Commentaire() {
		return id_Commentaire;
	}
	public void setId_Commentaire(int id_Commentaire) {
		this.id_Commentaire = id_Commentaire;
	}
	public Date getDate_commentaire() {
		return date_commentaire;
	}
	public void setDate_commentaire(Date date_commentaire) {
		this.date_commentaire = date_commentaire;
	}

}
