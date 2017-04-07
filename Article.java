package mainBiblio;

public class Article {

	private String nom;
	private String genre;
	private boolean dispo = true;
	private String type;

	public Article(String nom, String genre, String type) {
		this.nom = nom;
		this.genre = genre;
		this.type = type;
	}

	public String getNom() {
		return nom;
	}

	public String getGenre() {
		return genre;
	}
	
	public boolean isDispo() {
		return dispo;
	}

	public void setDispo(boolean dispo) {
		this.dispo = dispo;
	}

	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}
	
}
