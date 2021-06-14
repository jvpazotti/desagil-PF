package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Playlist {
	
	private int id;
	private List<Track>tracks;
	private Map<String,Integer>ratings;
	
	public Playlist(int id) {
		this.id = id;
		this.tracks=new ArrayList<>();
		this.ratings=new HashMap<>();
	}
	
	public void putRating(String nome,int avaliacao) {
		this.ratings.put(nome, avaliacao);
	}
	
	public void addTrack(Track track) {
		this.tracks.add(track);
	}
	
	public double averageRatings() {
		double total=0;
		for(int e:this.ratings.values()) {
			total+=e;
		}
		
		double average = total/this.ratings.size();
		
		int i = (int) average;
		double d = average - i;
		if(d>0.26 && d<0.74) {
			double v= i+0.5;
			return v;
			
		}
		if(d<0.26) {
			double v= i+0.0;
			return v;
			
		}
		
		else {
			double v = i+(1-d);
			return v;
		}
		
		
	}

	public int getId() {
		return this.id;
	}

	public List<Track> getTracks() {
		return this.tracks;
	}

	public Map<String, Integer> getRatings() {
		return this.ratings;
	}
	

	
}
