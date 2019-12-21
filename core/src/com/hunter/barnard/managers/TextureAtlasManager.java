/* @author Hunter Barnard
 * @version 0.1a
 * @since 2019-08-11
 */
package com.hunter.barnard.managers;

import java.util.ArrayList;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.hunter.barnard.util.TextureAtlasLoader;

public class TextureAtlasManager {

	private ArrayList<TextureAtlas> textureAtlie = new ArrayList<TextureAtlas>();
	private TextureAtlasLoader textureAtlasLoader = new TextureAtlasLoader();

	public TextureAtlasManager() {
		System.out.println("Loading texture atlie...");
		loadTextureAtlie();
		System.out.println("Texture Altie loaded...");
	}

	public void loadTextureAtlie() {
		textureAtlie.add(textureAtlasLoader.loadTextureAtlas("assets/textureatlas/spritesheet.atlas"));
	}

	public TextureAtlas getTextureAtlas(int id) {
		return textureAtlie.get(id);
	}

	public void disposeTextureAtlie() {
		System.out.println("Disposing TextureAtlie...");
		for (int i = 0; i < textureAtlie.size(); i++) {
			textureAtlie.get(i).dispose();
		}
		System.out.println("TextureAtlie Disposed...");

	}

}
