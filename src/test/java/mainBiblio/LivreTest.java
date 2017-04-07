package mainBiblio;

import static org.junit.Assert.*;

import org.junit.Test;

public class LivreTest {

	@Test
	public void testLivreNom() {
		Livre livre = new Livre("Harry Potter", "Fantastique", "J.K Rowling");
		assertEquals(livre.getNom(), "Harry Potter");
	}
	
	public void testLivreAuteur() {
		Livre livre = new Livre("Harry Potter", "Fantastique", "J.K Rowling");
		assertEquals(livre.getAuteur(), "J.K Rowling");
	}
	
	public void testLivreGenre() {
		Livre livre = new Livre("Harry Potter", "Fantastique", "J.K Rowling");
		assertEquals(livre.getGenre(), "Fantastique");
	}
	
	public void testLivreDispo() {
		Livre livre = new Livre("Harry Potter", "Fantastique", "J.K Rowling");
		assertEquals(livre.isDispo(), true);
	}

}
