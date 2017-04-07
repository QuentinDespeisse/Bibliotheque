package mainBiblio;

import static org.junit.Assert.*;

import org.junit.Test;

public class VideoTest {

	public void testVideoNom() {
		Video video = new Video("Harry Potter", "Fantastique", "J.K Rowling");
		assertEquals(video.getNom(), "Harry Potter");
	}
	
	public void testVideoRealisateur() {
		Video video = new Video("Harry Potter", "Fantastique", "J.K Rowling");
		assertEquals(video.getRealisateur(), "Harry Potter");
	}
	
	public void testVideoGenre() {
		Video video = new Video("Harry Potter", "Fantastique", "J.K Rowling");
		assertEquals(video.getGenre(), "Harry Potter");
	}
	
	public void testVideoDispo() {
		Video video = new Video("Harry Potter", "Fantastique", "J.K Rowling");
		assertEquals(video.isDispo(), true);
	}

}
