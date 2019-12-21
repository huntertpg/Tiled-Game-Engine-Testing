/* @author Hunter Barnard
 * @version 0.1a
 * @since 2019-08-11
 */
package com.hunter.barnard.util;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public class TextureAtlasLoader {

	public TextureAtlas loadTextureAtlas(String path) {
		return new TextureAtlas(path);
	}

}
