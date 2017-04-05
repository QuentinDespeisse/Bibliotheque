package mainBiblio;

public class Client {
	
	private String nom, prenom, email;
	private int num, tel;
	
	public Client(String nom, String prenom, String email, int num, int tel) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.num = num;
		this.tel = tel;
	}
	
	public void reserverLivre (String titre) {
		Bibliotheque.getInstance().ajouterReservation(titre, this);
		
	}
	
	public void suggererLivre (String titre) {
		Bibliotheque.getInstance().ajouterSuggestion(titre);
		
	}
}
