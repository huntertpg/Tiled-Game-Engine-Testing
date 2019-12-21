/* @author Hunter Barnard
 * @version 0.1a
 * @since 2019-08-11
 * 
 * This class is used to create and handle cameras. Currently it creates orthagraphic cameras
 * 
 */

package com.hunter.barnard.util;

import com.badlogic.gdx.graphics.OrthographicCamera;

public class CameraHandler {
	
	//Declare the orthagraphic camera
	private OrthographicCamera camera;
	//this function is used to create the camera by taking in the width and height for the camera
	public void createOrthographicCamera(float screenWidth, float screenHeight) {
		camera = new OrthographicCamera(screenWidth, screenHeight);
	}
	//This is used to get the cameras current x position
	public float getCameraX() {
		return camera.position.x;
	}
	//This is used to get the cameras current y
	public float getCameraY() {
		return camera.position.y;
	}
	//This is used to get the actual camera
	public OrthographicCamera getCamera() {
		return camera;
	}
	//This is used to update the camera 
	public void updateCamera() {
		camera.update();
	}
}
