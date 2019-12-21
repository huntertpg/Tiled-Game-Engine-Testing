/* @author Hunter Barnard
 * @version 0.1a
 * @since 2019-08-11
 * 
 * This class is used for loading external font files for custom fonts.
 * 
 */
package com.hunter.barnard.util;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

public class FontLoader {
	//This function is used to load a default font
	public BitmapFont loadFont() {
		return new BitmapFont();
	}
	//This function is used to load a custom font
	public BitmapFont loadFont(String path) {
		return new BitmapFont(Gdx.files.internal(path));
	}

}
