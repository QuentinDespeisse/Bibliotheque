package mainBiblio;

import java.time.LocalDate;

public class Livre {
	
	private String nom, genre, auteur;
	private boolean dispo = true;

	public Livre(String nom, String genre, String auteur) {
		this.nom = nom;
		this.genre = genre;
		this.auteur = auteur;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getAuteur() {
		return auteur;
	}


	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}


	public boolean isDispo() {
		return dispo;
	}


	public void setDispo(boolean dispo) {
		this.dispo = dispo;
	}
	
	

}
