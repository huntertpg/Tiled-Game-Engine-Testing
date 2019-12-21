/* @author Hunter Barnard
 * @version 0.1a
 * @since 2019-08-11
 * 
 * This class is used to load music from an external file
 * 
 */

package com.hunter.barnard.util;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;

public class MusicLoader {
	
	//This function loads music by taking in a string containing the path of the file
	public Music loadMusic(String path) {
		return Gdx.audio.newMusic(Gdx.files.internal(path));
	}
	
}
