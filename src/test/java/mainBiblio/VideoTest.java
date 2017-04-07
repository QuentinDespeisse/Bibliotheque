package mainBiblio;

import static org.junit.Assert.*;

import org.junit.Test;

public class VideoTest {
	

	Video video = new Video("Harry Potter", "Fantastique", "J.K Rowling");

	public void testVideoNom() {
		assertEquals(video.getNom(), "Harry Potter");
	}
	
	public void testVideoRealisateur() {
		assertEquals(video.getRealisateur(), "Harry Potter");
	}
	
	public void testVideoGenre() {
		assertEquals(video.getGenre(), "Harry Potter");
	}
	
	public void testVideoDispo() {
		assertEquals(video.isDispo(), true);
	}
	
	public void testToString() {
		assertEquals(video.toString(), "Harry Potter, Fantastique réalisé par J.K Rowling");
	}

}
