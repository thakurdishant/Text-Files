package com.mindtree.entity;

public class Song {
	int songId;
	String songName;
	Double likes;
	String language;
	int artistId;
	public Song() {
		
	}
public Song(String songName) {
		super();
		this.songName = songName;
	}

	public Song(int songId, String songName, Double likes, String language, int artistId) {
		super();
		this.songId = songId;
		this.songName = songName;
		this.likes = likes;
		this.language = language;
		this.artistId = artistId;
	}

	public int getSongId() {
		return songId;
	}

	public void setSongId(int songId) {
		this.songId = songId;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public Double getLikes() {
		return likes;
	}

	public void setLikes(Double likes) {
		this.likes = likes;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getArtistId() {
		return artistId;
	}

	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}
	
	
	
	
}
