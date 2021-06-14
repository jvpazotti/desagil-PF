package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrackTest {
	
	private Track track;
	private Artist artist;
	
	@BeforeEach
	void setUp() {
		artist=new Artist("Drake");
		
	}

	@Test
	void testZeroSeconds() {
		track= new Track(artist,"God's Plan",0);
		assertEquals("0:00", track.getDurationString());
	}

	@Test
	void testFiveSeconds() {
		track= new Track(artist,"God's Plan",5);
		assertEquals("0:05", track.getDurationString());
	}

	@Test
	void testTwentyFiveSeconds() {
		track= new Track(artist,"God's Plan",25);
		assertEquals("0:25", track.getDurationString());
	}

	@Test
	void testOneMinuteZeroSeconds() {
		track= new Track(artist,"God's Plan",60);
		assertEquals("1:00", track.getDurationString());
	}

	@Test
	void testOneMinuteFiveSeconds() {
		track= new Track(artist,"God's Plan",65);
		assertEquals("1:05", track.getDurationString());
	}

	@Test
	void testOneMinuteTwentyFiveSeconds() {
		track= new Track(artist,"God's Plan",85);
		assertEquals("1:25", track.getDurationString());
	}

	@Test
	void testTwoMinutesZeroSeconds() {
		track= new Track(artist,"God's Plan",120);
		assertEquals("2:00", track.getDurationString());
	}

	@Test
	void testTwoMinutesFiveSeconds() {
		track= new Track(artist,"God's Plan",125);
		assertEquals("2:05", track.getDurationString());
	}

	@Test
	void testTwoMinutesTwentyFiveSeconds() {
		track= new Track(artist,"God's Plan",145);
		assertEquals("2:25", track.getDurationString());
	}

	@Test
	void testOneCollaborator() {
		List<Artist>artists = new ArrayList<>();
		Artist artist2=new Artist("Anitta");
		artists.add(artist2);
		
		track= new CollaborationTrack(artist,"God's Plan",20,artists);
		assertEquals("Drake (feat. Anitta)", track.getFullArtistName());
	}

	@Test
	void testTwoCollaborators() {
		List<Artist>artists = new ArrayList<>();
		Artist artist2=new Artist("Anitta");
		Artist artist3=new Artist("Snoop Dog");
		artists.add(artist2);
		artists.add(artist3);
		
		track= new CollaborationTrack(artist,"God's Plan",20,artists);
		assertEquals("Drake (feat. Anitta, Snoop Dog)", track.getFullArtistName());
	}
}
