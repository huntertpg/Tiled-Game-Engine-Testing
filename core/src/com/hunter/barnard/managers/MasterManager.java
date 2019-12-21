/* @author Hunter Barnard
 * @version 0.1a
 * @since 2019-08-11
 * 
 * The main point of this class is to handle all of the other managers and create them
 * for local variables. This loads all of the managers that are to be used.
 * 
 */

package com.hunter.barnard.managers;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.hunter.barnard.util.CameraHandler;

public class MasterManager {
	// Create the variables for all of the managers
	public TextureManager textureManager;
	public SpriteManager spriteManager;
	public FontManager fontManager;
	public InputManager inputManager;
	public CameraHandler camera;
	public MusicManager musicManager;
	public AnimationManager animationManager;
	public TextureAtlasManager textureAtlasManager;
	public TiledMapManager tiledMapManager;

	// this function loads all of the managers.
	public void loadAllManagers() {
		System.out.println("Loading Managers...");
		musicManager = new MusicManager();
		camera = new CameraHandler();
		camera.createOrthographicCamera(1280, 720);
		textureManager = new TextureManager();
		spriteManager = new SpriteManager(textureManager);
		fontManager = new FontManager();
		inputManager = new InputManager();
		textureAtlasManager = new TextureAtlasManager();
		animationManager = new AnimationManager(textureAtlasManager);
		tiledMapManager = new TiledMapManager(this);
		System.out.println("Managers Loaded...");
	}

	public void disposeManagers() {
		System.out.println("Disposing Managers...");
		textureManager.disposeTextures();
		fontManager.disposeFonts();
		musicManager.disposeMusic();
		textureAtlasManager.disposeTextureAtlie();
		System.out.println("Managers Disposed...");

	}

}
