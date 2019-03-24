package com.mindtree.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.mindtree.dao.MusicDao;
import com.mindtree.entity.Album;
import com.mindtree.entity.Song;
import com.mindtree.util.DataBaseUtility;


public class MusicDaoImpl implements MusicDao{
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	
	static {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public List<Song> getSongs(String name){
		List<Song> result = new ArrayList<>();
		ResultSet rs = null;
		Connection con = DataBaseUtility.getConnection();
		String query = "select s.songName from song s inner join artist a on s.artistId=a.artistId where artistName = '"+name+"';";
		try {
			rs = con.createStatement().executeQuery(query);
			while(rs.next()) {
				Song song = new Song(rs.getString(1));
				result.add(song);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public List<Album> getAlbum(String name){
		List<Album> result = new ArrayList<>();
		ResultSet rs = null;
		Connection con = DataBaseUtility.getConnection();
		String query = "select album.albumId,album.albumName,max(album.albumprice),album.songId,album.rating from song,artist,album where song.artistId=artist.artistId and song.songId=album.songId and artist.artistname='"+name+"';";
		try {
			rs = con.createStatement().executeQuery(query);
			while(rs.next()) {
				Album album = new Album(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getDouble(4),rs.getInt(5));
				result.add((Album) album);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public List<Song> getLanguage(String name){
		List<Song> result = new ArrayList<>();
		ResultSet rs = null;
		Connection con = DataBaseUtility.getConnection();
		String query = "select s.language from song s inner join artist a on a.artistId=s.artistId where artistName = '"+name+"';";
		try {
			rs = con.createStatement().executeQuery(query);
			while(rs.next()) {
				Song song = new Song(rs.getString(1));
				result.add(song);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
