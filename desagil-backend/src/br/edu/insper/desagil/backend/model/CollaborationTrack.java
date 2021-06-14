package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.List;

public class CollaborationTrack extends Track{
	
	private List<Artist> collaborators;

	public CollaborationTrack(Artist artist, String name, int duration,List<Artist> collaborators) {
		super(artist, name, duration);
		this.collaborators=collaborators;
		
	}
	
	public String getFullArtistName() {
		List<String>artists = new ArrayList<>();
		for (Artist artist:this.collaborators) {
			artists.add(artist.getName());
		}
		String listaVirgula= String.join(", ", artists);
		return this.getArtist().getName()+" (feat. "+listaVirgula+")";
	
	
	}
	
	

}
