package mainBiblio;

import static org.junit.Assert.*;

import org.junit.Test;

public class LivreTest {

	Livre livre = new Livre("Harry Potter", "Fantastique", "J.K Rowling");

	@Test
	public void testLivreNom() {
		assertEquals(livre.getNom(), "Harry Potter");
	}
	
	public void testLivreAuteur() {
		assertEquals(livre.getAuteur(), "J.K Rowling");
	}
	
	public void testLivreGenre() {
		assertEquals(livre.getGenre(), "Fantastique");
	}
	
	public void testLivreDispo() {
		assertEquals(livre.isDispo(), true);
	}
	
	public void testToString() {
		assertEquals(livre.toString(), "Harry Potter, Fantastique écrit par J.K Rowling");
	}

}
