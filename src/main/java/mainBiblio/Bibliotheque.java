package mainBiblio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bibliotheque {

	private static Bibliotheque instance = new Bibliotheque();
	private List<Article> listArticle;
	private List<String> listSuggestion;
	private Map<Client, Article> reservation = new HashMap<Client, Article>();
	private Map<Client, Article> emprunt = new HashMap<Client, Article>();
	
	private Bibliotheque() {
		listArticle = new ArrayList<Article>();
		listSuggestion = new ArrayList<String>();
	}
	
	public static Bibliotheque getInstance() {return instance;}
	
	public List<Article> getLivreGenre(String genre) {
		List<Article> articlesGenre = new ArrayList<Article>();
		for(Article livre: listArticle ){
			if (livre.getGenre().equals(genre)) 
				articlesGenre.add(livre);
		}
		return articlesGenre;
	}
	
	public List<Article> getLivreNom(String nom) {
		List<Article> articlesNom = new ArrayList<Article>();
		for(Article livre: listArticle ){
			if (livre.getNom().equals(nom))
				articlesNom.add(livre);
		}
		return articlesNom;
	}
	
	public List<Article> getLivreAuteur(String auteur) {
		List<Article> articlesAuteur = new ArrayList<Article>();
		for(Article livre: listArticle ){
			if (livre.getNom().equals(auteur))
				articlesAuteur.add(livre);
		}
		return articlesAuteur;
	}
	
	public void ajouterReservation(Article article, Client client) {
		reservation.put(client, article);
	}
	
	public boolean ajouterEmprunt(String titre, Client client) {
		boolean reserve = false;
		for (Article livre : getLivreNom(titre)){
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
	
	public void ajouterSuggestion(String titre) {listSuggestion.add(titre);}
	
	public void addArticles(Article article) {listArticle.add(article);}
	
}
