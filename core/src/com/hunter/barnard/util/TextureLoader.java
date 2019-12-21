/* @author Hunter Barnard
 * @version 0.1a
 * @since 2019-08-11
 * 
 * The point of this class is used to load in textures by passing in a string representing its path
 * 
 */

package com.hunter.barnard.util;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class TextureLoader {
	
	//This function returns a new texture that takes in the path for the texture that is to be loaded in
	public Texture loadTexture(String path) {
		return new Texture(Gdx.files.internal(path));
	}

}
