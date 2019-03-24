package com.mindtree.entity;

public class Album {
	int albumId;
	String albumName;
	Double albumPrice;
	Double rating;
	int songId;
	
	public Album() {
		
	}

	public Album(int albumId, String albumName, Double albumPrice, Double rating, int songId) {
		super();
		this.albumId = albumId;
		this.albumName = albumName;
		this.albumPrice = albumPrice;
		this.rating = rating;
		this.songId = songId;
	}

	public int getAlbumId() {
		return albumId;
	}

	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public Double getAlbumPrice() {
		return albumPrice;
	}

	public void setAlbumPrice(Double albumPrice) {
		this.albumPrice = albumPrice;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public int getSongId() {
		return songId;
	}

	public void setSongId(int songId) {
		this.songId = songId;
	}
	
	
}
