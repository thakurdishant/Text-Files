package com.mindtree.dao;

import java.util.List;

import com.mindtree.entity.Album;
import com.mindtree.entity.Song;

public interface MusicDao {
	public List<Song> getSongs(String name);
	public List<Album> getAlbum(String name);
	public List<Song> getLanguage(String name);
}
