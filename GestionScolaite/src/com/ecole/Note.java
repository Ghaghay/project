package com.ecole;

public class Note {

	private int id_Note;
	private float note_matiere;
	public Note(int id_Note, float note_matiere){
		this.id_Note=id_Note;
		this.note_matiere=note_matiere;
	}
	public int getId_Note() {
		return id_Note;
	}
	public void setId_Note(int id_Note) {
		this.id_Note = id_Note;
	}
	public float getNote_matiere() {
		return note_matiere;
	}
	public void setNote_matiere(float note_matiere) {
		this.note_matiere = note_matiere;
	}
}
