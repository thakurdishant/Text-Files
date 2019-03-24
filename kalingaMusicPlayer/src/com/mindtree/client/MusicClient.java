package com.mindtree.client;

import java.util.List;
import java.util.Scanner;

import com.mindtree.entity.Album;
import com.mindtree.entity.Song;
import com.mindtree.service.impl.MusicServiceImpl;


public class MusicClient {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		MusicServiceImpl mussicService = new MusicServiceImpl();
		
		do {
			System.out.println("===============================================================");
			System.out.println("Kalinga Music Player");
			System.out.println("================================================================");
			System.out.println("1 -> Get all songs of an artist");
			System.out.println("2 -> Get most expensive album by an artist");
			System.out.println("3 -> No of languages worked in");
			System.out.println("4 -> Exit");
			System.out.println("Enter your choice: ");
			int choice = in.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the name of Artist: ");
				String name = in.next();
				 List<Song> song = mussicService.getallSongsOfArtist(name); 
				 System.out.println("The songs are");
				 for(Song s: song) {
					 System.out.println(s.getSongName());
				 }
				break;
			case 2:
				System.out.println("Enter Artist name");
				String artistName = in.next();
				List<Album> album = mussicService.getMaxPrice(artistName);
				System.out.println("The details are");
				for(Album a: album) {
					System.out.println(a.getAlbumId()+","+a.getAlbumName()+","+a.getAlbumPrice()+","+a.getRating()+","+a.getSongId());
				}
				break;
			case 3:
				System.out.println("Enter Artist name");
				String artName = in.next();
				List<Song> songs = mussicService.countLanguage(artName);
				System.out.println("The details are");
				System.out.println(songs.size());
				 
				break;
			case 4:
				System.out.println("Adios Amigo!!!!");
				System.exit(0);
			}
	}while(true);
  }
}

