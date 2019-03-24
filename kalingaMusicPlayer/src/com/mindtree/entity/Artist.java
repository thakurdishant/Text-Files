package com.mindtree.entity;

public class Artist {
	int artistId;
	String artistName;
	String gender;
	int age;
	
	public Artist() {
		
	}
	public Artist(int artistId, String artistName, String gender, int age) {
		super();
		this.artistId = artistId;
		this.artistName = artistName;
		this.gender = gender;
		this.age = age;
	}
	public int getArtistId() {
		return artistId;
	}
	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
