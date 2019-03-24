package com.mindtree.service.impl;

import java.util.List;

import com.mindtree.dao.impl.MusicDaoImpl;
import com.mindtree.entity.Album;
import com.mindtree.entity.Song;
import com.mindtree.service.MusicService;

public class MusicServiceImpl implements MusicService {
	MusicDaoImpl musicDaoImpl = new MusicDaoImpl();
	
	public List<Song> getallSongsOfArtist(String name) {
		List<Song> song = musicDaoImpl.getSongs(name);
		return song;
	}
	public List<Album> getMaxPrice(String name){
		List<Album> album = musicDaoImpl.getAlbum(name);
		return album;
	}
	public List<Song> countLanguage(String name){
		List<Song> song = musicDaoImpl.getLanguage(name);
		return song;
 	}
}
