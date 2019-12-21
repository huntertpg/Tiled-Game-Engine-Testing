/* @author Hunter Barnard
 * @version 0.1a
 * @since 2019-08-11
 * 
 * The point of this class is to load sprites by either taking in a texture path and using
 * the texture loader, or taking in a pre-exsisting texture
 * 
 */

package com.hunter.barnard.util;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class SpriteLoader {
	
	private TextureLoader loadTexture = new TextureLoader();
	
	public Sprite loadSprite(String path) {
		return new Sprite(loadTexture.loadTexture(path));
	}
	
	public Sprite loadSprite(Texture texture) {
		return new Sprite(texture);
	}

}
