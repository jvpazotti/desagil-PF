package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlaylistTest {
	private static double DELTA = 0.000001;
	private Playlist playlist;

	@BeforeEach	
	void setUp() {
		playlist=new Playlist(1);
	}

	@Test
	void testRoundDownToZero() {
		playlist.putRating("o", 1);
		playlist.putRating("a", 2);
		playlist.putRating("e", 3);
		playlist.putRating("i", 3);
		assertEquals(2.0,playlist.averageRatings(),DELTA);
	}

	@Test
	void testRoundUpToHalf() {
		playlist.putRating("oe", 1);
		playlist.putRating("ai", 2);
		playlist.putRating("eu", 1);
		assertEquals(1.5,playlist.averageRatings(),DELTA);
	}

	@Test
	void testRoundDownToHalf() {
		playlist.putRating("oa", 1);
		playlist.putRating("ae", 2);
		playlist.putRating("ei", 2);
		assertEquals(1.5,playlist.averageRatings(),DELTA);
	}

	@Test
	void testRoundUpToOne() {
		playlist.putRating("oa", 1);
		playlist.putRating("au", 1);
		playlist.putRating("eo", 2);
		playlist.putRating("ua", 3);
		assertEquals(2.0,playlist.averageRatings(),DELTA);
	}
}
