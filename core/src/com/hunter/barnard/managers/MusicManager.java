/* @author Hunter Barnard
 * @version 0.1a
 * @since 2019-08-11
 * 
 * The point of this class is to handle all music and store them in a array list
 * this calls upon the music loader class to load the music into the array list.
 * 
 */

package com.hunter.barnard.managers;

import java.util.ArrayList;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Music;
import com.hunter.barnard.util.MusicLoader;

public class MusicManager {
	// Create the Music array list that will hold all of the music
	private ArrayList<Music> musics = new ArrayList<Music>();

	// Craete the music loader class to load the music in
	private MusicLoader musicLoader = new MusicLoader();

	// Create the class constructor to load in the music
	public MusicManager() {
		System.out.println("Loading music...");
		loadMusic();
		System.out.println("Music Loaded...");
	}

	// This function is used to load the music.
	public void loadMusic() {
		musics.add(musicLoader.loadMusic("music/Land_of_Gongoria_Menu_music.mp3"));
		musics.add(musicLoader.loadMusic("music/Luma_town_background_music.mp3"));
		musics.add(musicLoader.loadMusic("music/Voltage_[8-bit].mp3"));
		musics.add(musicLoader.loadMusic("music/make it simple - song by FainterStreak.mp3"));

	}

	// This function is used to get music by its ID.
	public Music getMusic(int musicID) {
		return musics.get(musicID);
	}

	// This is used to add music externally
	public void addMusic(Music music) {
		musics.add(music);
	}

	// This is used to dispose the music to prevent memory leakage
	public void disposeMusic() {
		System.out.println("Disposing Music...");
		for (int i = 0; i < musics.size(); i++) {
			musics.get(i).dispose();
		}
		System.out.println("Music Disposed...");

	}

}
