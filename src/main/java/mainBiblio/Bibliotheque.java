package mainBiblio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bibliotheque {

	private static Bibliotheque instance = new Bibliotheque();
	private List<Livre> listLivre;
	private List<String> listSuggestion;
	private Map<Client, String> reservation = new HashMap<Client, String>();
	private Map<Client, Livre> emprunt = new HashMap<Client, Livre>();
	
	private Bibliotheque() {
		listLivre = new ArrayList<Livre>();
		listSuggestion = new ArrayList<String>();
	}
	
	public static Bibliotheque getInstance() {
		return instance;
	}
	
	public List<Livre> getLivreGenre(String genre) {
		List<Livre> livresGenre = new ArrayList<Livre>();
		for(Livre livre: listLivre ){
			if (livre.getGenre().equals(genre)){
				livresGenre.add(livre);
			}
		}
		return livresGenre;
	}
	
	public List<Livre> getLivreNom(String nom) {
		List<Livre> livresNom = new ArrayList<Livre>();
		for(Livre livre: listLivre ){
			if (livre.getNom().equals(nom)){
				livresNom.add(livre);
			}
		}
		return livresNom;
	}
	
	public List<Livre> getLivreAuteur(String auteur) {
		List<Livre> livresAuteur = new ArrayList<Livre>();
		for(Livre livre: listLivre ){
			if (livre.getNom().equals(auteur)){
				livresAuteur.add(livre);
			}
		}
		return livresAuteur;
	}
	
	public void ajouterReservation(String titre, Client client) {
		reservation.put(client, titre);

	}
	
	public boolean ajouterEmprunt(String titre, Client client) {
		boolean reserve = false;
		for (Livre livre : getLivreNom(titre)){
			if(livre.isDispo()){
				emprunt.put(client, livre);
				livre.setDispo(false);
				reserve = true;
			}

		}
		return reserve;
	}
	
	public void rendreEmprunt(Client client) {
		emprunt.get(client).setDispo(true);
		emprunt.remove(client);
		
	}
	
	public void ajouterSuggestion(String titre) {
		listSuggestion.add(titre);

	}
	
	public void addLivre(Livre livre) {
		listLivre.add(livre);
	}
	
}
