package br.edu.insper.desagil.backend.model;

public class Track{
	
	private Artist artist;
	private String name;
	private int duration;
	public Track(Artist artist, String name, int duration) {
		this.artist = artist;
		this.name = name;
		this.duration = duration;
	}
	
	
	
	public Artist getArtist() {
		return this.artist;
	}



	public String getName() {
		return this.name;
	}



	public int getDuration() {
		return this.duration;
	}



	public String getDurationString() {
		int minutos=this.duration/60;
		int segundos = this.duration - 60*minutos;
		if(segundos<10) {
			return Integer.toString(minutos)+":0"+Integer.toString(segundos);
		}
		else {
			return Integer.toString(minutos)+":"+Integer.toString(segundos);
		}
		
	}
	
	public String getFullArtistName() {
		return this.artist.getName();
	}
	
	
	

}
