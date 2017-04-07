package mainBiblio;

public class Client {
	
	private String nom, prenom, email, tel;
	private int numCl;
	
	public Client(String nom, String prenom, String email, int numCl, String tel) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.numCl = numCl;
		this.tel = tel;
	}
	
	public void reserverArticle (Article article) {
		Bibliotheque.getInstance().ajouterReservation(article, this);
		
	}
	
	public void suggererArticle (String titre) {
		Bibliotheque.getInstance().ajouterSuggestion(titre);
		
	}
	
	public void emprunter (Article article) {
		Bibliotheque.getInstance().ajouterEmprunt(article, this);
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumCl() {
		return numCl;
	}

	public void setNumCl(int numCl) {
		this.numCl = numCl;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", numCl=" + numCl + ", tel=" + tel
				+ "]";
	}
}
