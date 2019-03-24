package com.mindtree.service;

import java.util.List;

import com.mindtree.entity.Album;
import com.mindtree.entity.Song;

public interface MusicService {
	public List<Song> getallSongsOfArtist(String name);
	public List<Album> getMaxPrice(String name);
	public List<Song> countLanguage(String name);
}
