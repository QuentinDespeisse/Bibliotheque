package mainBiblio;

public class gererBiblio {
	
	public gererBiblio() {
		// TODO Auto-generated constructor stub
	}
	
	public Client ajouterClient (String nom, String prenom, String email, int numCl, String tel) {
		Client  client = new Client(nom, prenom, email, numCl, tel);
		return client;
	}
	

	public static void main(String[] args) {
		gererBiblio gererbiblio = new gererBiblio();
		
		Bibliotheque biblio = Bibliotheque.getInstance();
		
		Article livre1 = new Livre("La vie est belle", "Science-fiction", "Ricard51");
		Article livre2 = new Livre("Bimbo l'éléphante", "Comédie", "Jean-Paul de la Ruelle");
		Article video1 = new Video("Batman rencontre Zoro", "Comédie Classique", "Léo du Bouchon");
		
		Client client = gererbiblio.ajouterClient("Richard", "Albert", "richard.albert@biblio.com", 201540, "0654287519");

		biblio.addArticles(livre1);
		biblio.addArticles(livre2);
		biblio.addArticles(video1);
		
		biblio.ajouterEmprunt(livre1, client);
		System.out.println(livre1.getNom() + "   " + livre1.isDispo());
		System.out.println(livre2.getNom() + "   " + livre2.isDispo());
		System.out.println(video1.getNom() + "   " + video1.isDispo());
		
		biblio.showArticles();
		
		biblio.TriAlphabetique();
		
		biblio.showArticles();

	}
}
