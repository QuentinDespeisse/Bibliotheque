package mainBiblio;

public class Video {

	private String nom, genre, realisateur;
	private boolean dispo = true;

	public Video(String nom, String genre, String auteur) {
		this.nom = nom;
		this.genre = genre;
		this.realisateur = auteur;
	}
	
	public String getNom() {
		return nom;
	}

	public String getGenre() {
		return genre;
	}

	public String getRealisateur() {
		return realisateur;
	}

	public boolean isDispo() {
		return dispo;
	}

	public void setDispo(boolean dispo) {
		this.dispo = dispo;
	}

}
