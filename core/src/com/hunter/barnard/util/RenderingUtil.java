/* @author Hunter Barnard
 * @version 0.1a
 * @since 2019-08-11
 */
package com.hunter.barnard.util;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.hunter.barnard.managers.MasterManager;

public class RenderingUtil {
	
	private SpriteBatch batch;
	private MasterManager masterManager;
	private float elapsedTime = 0;

	public RenderingUtil(MasterManager masterManager, SpriteBatch batch) {
		
		this.batch = batch;
		this.masterManager = masterManager;
	}
	
	
	
	public void renderTexture(int textureID, float x, float y) {
		batch.draw(masterManager.textureManager.getTexture(textureID), x, y);
	}
	
	public void renderTexture(Texture texture, float x, float y) {
		batch.draw(texture, x, y);
	}
	
	public void renderTextureRegion(int atlasID, String region, float x, float y) {
		batch.draw((TextureRegion) masterManager.textureAtlasManager.getTextureAtlas(atlasID).findRegion(region), x, y);
	}
	
	public void renderSprite(int spriteID, float x, float y) {
		masterManager.spriteManager.getSprite(spriteID).setPosition(x, y);
		masterManager.spriteManager.getSprite(spriteID).draw(batch);
	}
	
	public void renderSprite(int spriteID) {
		masterManager.spriteManager.getSprite(spriteID).draw(batch);
	}
	
	public void renderAnaimation(int animationID, float x, float y) {
		batch.draw((TextureRegion) masterManager.animationManager.playerAnimation.get(animationID).getKeyFrame(elapsedTime, true), x, y);

	}
	
	public void renderFont(int fontID, String text, float x, float y) {
		masterManager.fontManager.getFont(fontID).draw(batch, text, x, y);
	}
	//Set the batch to view through the camera
	public void setCamera(Camera camera) {
		batch.setProjectionMatrix(masterManager.camera.getCamera().combined);
	}
	
	public void renderBegin() {
		batch.begin();
		elapsedTime += Gdx.graphics.getDeltaTime();

	}
	
	public void renderEnd() {
		batch.end();
	}

}
