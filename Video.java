package mainBiblio;

public class Video extends Article{

	private String realisateur;

	public Video(String nom, String genre, String auteur) {
		super(nom, genre, "Video");
		this.realisateur = auteur;
	}
	

	public String getRealisateur() {
		return realisateur;
	}


}
