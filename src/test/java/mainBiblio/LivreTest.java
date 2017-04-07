package mainBiblio;

import static org.junit.Assert.*;

import org.junit.Test;

public class LivreTest {

	Livre livre = new Livre("Harry Potter", "Fantastique", "J.K Rowling");

	@Test
	public void testLivreNom() {
		assertEquals(livre.getNom(), "Harry Potter");
	}
	
	@Test
	public void testLivreAuteur() {
		assertEquals(livre.getAuteur(), "J.K Rowling");
	}
	
	@Test
	public void testLivreGenre() {
		assertEquals(livre.getGenre(), "Fantastique");
	}
	
	@Test
	public void testLivreDispo() {
		assertEquals(livre.isDispo(), true);
	}
	
	@Test
	public void testToString() {
		String test  = livre.toString();
		assertEquals(test, "Harry Potter, Fantastique écrit par J.K Rowling --> Disponible");
	}

}
