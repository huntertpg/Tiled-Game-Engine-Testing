/* @author Hunter Barnard
 * @version 0.1a
 * @since 2019-08-11
 * 
 * This is the main class. Currently all the rendering and updating is handled in this class.
 * This will be changed in the future as separate classes will be used to handle the rendering and initializations
 * as well as the disposing.
 * 
 */

package com.hunter.barnard.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.hunter.barnard.managers.MasterManager;

public class Land_of_Gongoria extends ApplicationAdapter {

	/*
	 * Declare the Spritebatch variable. This is used for rendering textures and
	 * such to the screen Declare the MasterManager class with the master manager
	 * variable. This is for handling all other managers such as the sound
	 * manager, texture manager, etc... see the manager classes for more details
	 */
	private MasterManager masterManager;

	private Rendering rendering;

	private Player player;

	// The create method is basically for when the game starts create whatever. This
	// used for basic initialization
	@Override
	public void create() {

		// Initialize the master manager for use of the managers
		masterManager = new MasterManager();
		// load all the managers(may be deprecated)

		player = new Player(masterManager);

		rendering = new Rendering(masterManager, player);
		masterManager.loadAllManagers();
		masterManager.fontManager.setFontScale(1, 0.5f);
	}

	@Override
	public void render() {
		// Set the clear color for OpenGL when the window is refreshed
		Gdx.gl.glClearColor(0f, 0f, 0f, 0.1f);
		// Clear with the color buffer bit that is set
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		// Handle movement and pass the camera so the position of the camera can be set
		masterManager.inputManager.handleMovement(masterManager.camera.getCamera());

		rendering.renderingUtil.setCamera(masterManager.camera.getCamera());
		// Update the camera so the position can be updated
		masterManager.camera.updateCamera();
		// Begin rendering to the screen
		rendering.realRendering();
		// End rendering to the screen
	}

	// This function disposes of textures when stopping the game to prevent memory
	// leakage
	@Override
	public void dispose() {
		// Dispose the batch used for rendering
		masterManager.disposeManagers();
	}
}
