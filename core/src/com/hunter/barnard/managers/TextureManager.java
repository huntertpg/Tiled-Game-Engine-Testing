/* @author Hunter Barnard
 * @version 0.1a
 * @since 2019-08-11
 * 
 * This class is used to load and store textures into memory. This is done by an array list and
 * a custom class called TextureLoader that loads in the textures to a texture array list
 * 
 */

package com.hunter.barnard.managers;

import java.util.ArrayList;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.hunter.barnard.util.TextureLoader;

public class TextureManager {

	// Create the Array List of textures that is used to store all of the textures
	private ArrayList<Texture> textures = new ArrayList<Texture>();
	// Create the texture loader that is used to load textures
	private TextureLoader textureLoader = new TextureLoader();

	// Create the texture manager constructor
	public TextureManager() {
		System.out.println("Loading Textures...");
		loadTextures();
		System.out.println("Textures Loaded...");
	}

	// This function is used to load textures and add them to the textures array
	// list
	public void loadTextures() {
		textures.add(textureLoader.loadTexture("sprites/001.png"));
		textures.add(textureLoader.loadTexture("textures/badlogic.jpg"));
		textures.add(textureLoader.loadTexture("textures/grasslands.png"));
	}


	// This is used to get textures by its id
	public Texture getTexture(int textureID) {
		return this.textures.get(textureID);
	}

	// This is used to add textures externally
	public void addTexture(Texture texture) {
		this.textures.add(texture);
	}

	// This is used to dispose the textures to prevent memory leakage
	public void disposeTextures() {
		System.out.println("Disposing Textures...");
		for (int i = 0; i < textures.size(); i++) {
			textures.get(i).dispose();
		}
		System.out.println("Textures Disposed...");

	}

}
