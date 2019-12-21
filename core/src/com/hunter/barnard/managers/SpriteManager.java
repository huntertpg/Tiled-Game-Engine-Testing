/* @author Hunter Barnard
 * @version 0.1a
 * @since 2019-08-11
 * 
 * The main point of this class is to load and store sprites for use. Sprites are 
 * movable images that can be animated mainly used for entities. So sprites use textures loaded
 * by the texture manager. 
 * 
 */
package com.hunter.barnard.managers;

import java.util.ArrayList;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.hunter.barnard.util.SpriteLoader;

public class SpriteManager {
	//Create an arraylist of sprites to store all the sprites in
	private ArrayList<Sprite> sprites = new ArrayList<Sprite>();
	//Create the sprite loader for loading in the sprites to the sprites array list
	private SpriteLoader spriteLoader = new SpriteLoader();
	//Create the texture manager so the sprites added has a texture 
	private TextureManager textureManager;
	
	//Create the sprite manager constructor that just loads the sprites 
	public SpriteManager(TextureManager textureManager) {
		System.out.println("Loading sprites...");
		this.textureManager = textureManager;
		loadSprites();
		System.out.println("Sprites loaded...");
	}
	//This function basically just loads the sprites the the array list
	public void loadSprites() {
		//add the sprite by calling the sprite loader and passing in the texture manager and the ID of the texture
		sprites.add(this.spriteLoader.loadSprite(textureManager.getTexture(0)));
	}
	//This function is for getting sprites by passing in the sprite ID
	public Sprite getSprite(int spriteID) {
		//Return the sprite from the sprite list
		return this.sprites.get(spriteID);
	}
	//this adds a sprite to the sprite list
	public void addSprite(Sprite sprite) {
		this.sprites.add(sprite);
	}
}
