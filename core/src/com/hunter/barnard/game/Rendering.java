/* @author Hunter Barnard
 * @version 0.1a
 * @since 2019-08-11
 */
package com.hunter.barnard.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.hunter.barnard.managers.MasterManager;
import com.hunter.barnard.util.RenderingUtil;

public class Rendering {

	private SpriteBatch batch;
	private MasterManager masterManager;
	private Player player;
	public RenderingUtil renderingUtil;

	public Rendering(MasterManager masterManager, Player player) {
		this.masterManager = masterManager;
		this.player = player;
		batch = new SpriteBatch();
		renderingUtil = new RenderingUtil(masterManager, batch);

	}

	public void realRendering() {
		masterManager.tiledMapManager.renderTiledMap(1, masterManager.camera.getCamera(), masterManager.textureAtlasManager.getTextureAtlas(0).findRegion("001"));
		renderingUtil.renderBegin();
		// renderingUtil.renderTexture(2, 0, 0);
		player.updatePlayerAnimation(this);
		
		masterManager.fontManager.setFontColor(1, Color.BLACK);
		renderingUtil.renderFont(1, "HunterTPG", masterManager.camera.getCameraX() - 6,
				masterManager.camera.getCameraY() + 73);
		masterManager.fontManager.setFontColor(1, Color.WHITE);
		renderingUtil.renderFont(1, "HunterTPG", masterManager.camera.getCameraX() - 8,
				masterManager.camera.getCameraY() + 75);
		renderingUtil.renderEnd();
	}

}
