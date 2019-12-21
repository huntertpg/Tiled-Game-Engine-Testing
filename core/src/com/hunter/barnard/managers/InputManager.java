/* @author Hunter Barnard
 * @version 0.1a
 * @since 2019-08-11
 * 
 * The main point of this class is to provide input to the player. This has the option to control
 * a camera, a sprite, or both. This class will be expanded to control all input. This currently uses functions
 * such as moveUp, left, right, and down to move the sprite, camera, or both.
 * 
 */

package com.hunter.barnard.managers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class InputManager {
	
	private static final float WALK_SPEED = 5f;
	private static final float RUN_SPEED = 10f;
	public boolean isW = false;
	public boolean isS = false;
	public boolean isA = false;
	public boolean isD = false;
	public String direction = "Down";
	
	public InputManager() {
		System.out.println("Initalizing player input...");
	}

	//This function handles movement by passing in the sprite that is to be controlled.
	public void handleMovement(Sprite sprite) {

		//This checks if the W key is pressed, if so move the sprite up
		if (Gdx.input.isKeyPressed(Input.Keys.W)) {
			moveUp(sprite);
		}
		//This checks to see if the S key is pressed, if it is move the sprite down
		if (Gdx.input.isKeyPressed(Input.Keys.S)) {
			moveDown(sprite);
		}
		//Checks if the A key is pressed, if it is move the sprite left
		if (Gdx.input.isKeyPressed(Input.Keys.A)) {
			moveLeft(sprite);
		}
		//Checks if the D key is pressed, if so move the sprite right
		if (Gdx.input.isKeyPressed(Input.Keys.D)) {
			moveRight(sprite);
		}
	}
	//This function handles movement by taking in the camera to move
	public void handleMovement(Camera camera) {

		//This checks if the W key is pressed, if so move the camera up
		if (Gdx.input.isKeyPressed(Input.Keys.W)) {
			this.isW = true;
			this.isA = false;
			this.isS = false;
			this.isD = false;
			this.direction = "Up";
			moveUp(camera);
		}
		//This checks if the S key is pressed, if so move the camera down
		else if (Gdx.input.isKeyPressed(Input.Keys.S)) {
			this.isW = false;
			this.isA = false;
			this.isS = true;
			this.isD = false;
			this.direction = "Down";
			moveDown(camera);
		}
		//This checks if the A key is pressed, if so move the camera left
		else if (Gdx.input.isKeyPressed(Input.Keys.A)) {
			this.isW = false;
			this.isA = true;
			this.isS = false;
			this.isD = false;
			this.direction = "Left";
			moveLeft(camera);
		}
		//This checks to see if the D key is pressed, if so move the camera right.
		else if (Gdx.input.isKeyPressed(Input.Keys.D)) {
			this.isW = false;
			this.isA = false;
			this.isS = false;
			this.isD = true;
			this.direction = "Right";
			moveRight(camera);
		}
		else {
			this.isW = false;
			this.isA = false;
			this.isS = false;
			this.isD = false;
		}
	
	}
	
	//This function moves the sprite up by getting a passed through sprite and translating it's Y position
	public void moveUp(Sprite sprite) {
		sprite.translateY(5f);
	}
	
	//This function moves the passed in sprite down by translating its position in a negative Y position
	public void moveDown(Sprite sprite) {
		sprite.translateY(-5.0f);
	}
	//This function takes in the passed in sprite and moves it left by translating it in a negative X position
	public void moveLeft(Sprite sprite) {
		sprite.translateX(-5f);
	}
	//This function takes in a passed sprite and moves it right by translating its X position
	public void moveRight(Sprite sprite) {
		sprite.translateX(5.0f);
	}
	//This function moves the passed in camera up by translating its Y position 
	public void moveUp(Camera camera) {
		camera.translate(0, WALK_SPEED, 0);
	}
	//This function moves the camera down by translating its Y position in the negative direction.
	public void moveDown(Camera camera) {
		camera.translate(0, -WALK_SPEED, 0);
	}
	//This function moves the passed in camera left by translating its x position in the negative direction
	public void moveLeft(Camera camera) {
		camera.translate(-WALK_SPEED, 0, 0);
	}
	//This function moves the passed in camera right by translating its x position
	public void moveRight(Camera camera) {
		camera.translate(WALK_SPEED, 0, 0);
	}
}
