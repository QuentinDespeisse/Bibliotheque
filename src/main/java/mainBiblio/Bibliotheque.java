package mainBiblio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bibliotheque {

	private static Bibliotheque instance = new Bibliotheque();
	private static ArrayList<Article> listArticle;
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
	

	public List<Article> getArticleByNom(String nom) {
		List<Article> articlesNom = new ArrayList<Article>();
		for(Article livre: listArticle ){
			if (livre.getNom().equals(nom))
				articlesNom.add(livre);
		}
		return articlesNom;
	}
	

	public List<Article> getLivreByAuteur(String auteur) {
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
	
	public boolean ajouterEmprunt(Article article, Client client) {
		boolean reserve = false;
			if(article.isDispo()){
				emprunt.put(client, article);
				article.setDispo(false);
				reserve = true;
			}
		return reserve;
	}
	
	public void rendreEmprunt(Client client) {
		emprunt.get(client).setDispo(true);
		emprunt.remove(client);
	}
	
	public void ajouterSuggestion(String titre) {listSuggestion.add(titre);}
	

	public void addArticles(Article article) {listArticle.add(article);}
	
	public void showArticles(){
		String listeArticles = "";
		for(Article article : listArticle){
			listeArticles += article.toString();
			listeArticles += '\n';
		}
		
		System.out.println(listeArticles);
	}
	
	public static ArrayList<Article> TriAlphabetique()
	{
		Integer i, j, min;
		Article article;
		for(i = 0; i < listArticle.size(); i++)
		{
			min = i;
			for(j = i; j < listArticle.size(); j++)
			{				
				if(listArticle.get(min).getNom().compareTo(listArticle.get(j).getNom()) > 0)
				{					
					min = j;
				}
			}
			article = listArticle.get(i);
			listArticle.set(i, listArticle.get(min));
			listArticle.set(min, article);			
		}
		return listArticle;		
	}
}
