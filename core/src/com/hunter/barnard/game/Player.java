/* @author Hunter Barnard
 * @version 0.1a
 * @since 2019-08-11
 */
package com.hunter.barnard.game;

import com.hunter.barnard.managers.MasterManager;

public class Player {

	private MasterManager manager;
	
	public Player(MasterManager manager) {
		this.manager = manager;
	}
	
	public void updatePlayerAnimation(Rendering renderer) {
		if(manager.inputManager.isW) {
			renderer.renderingUtil.renderAnaimation(1, manager.camera.getCameraX(), manager.camera.getCameraY());
		} else if(manager.inputManager.isA) {
			renderer.renderingUtil.renderAnaimation(2, manager.camera.getCameraX(), manager.camera.getCameraY());
		} else if(manager.inputManager.isS) {
			renderer.renderingUtil.renderAnaimation(0, manager.camera.getCameraX(), manager.camera.getCameraY());
		} else if(manager.inputManager.isD) {
			renderer.renderingUtil.renderAnaimation(3, manager.camera.getCameraX(), manager.camera.getCameraY());
		} else {
			if(manager.inputManager.direction.equals("Up")) {
				renderer.renderingUtil.renderTextureRegion(0, "0030", manager.camera.getCameraX(), manager.camera.getCameraY());
			}
			else if(manager.inputManager.direction.equals("Down")) {
				renderer.renderingUtil.renderTextureRegion(0, "001", manager.camera.getCameraX(), manager.camera.getCameraY());
			}
			else if(manager.inputManager.direction.equals("Left")) {
				renderer.renderingUtil.renderTextureRegion(0, "0014", manager.camera.getCameraX(), manager.camera.getCameraY());
			}
			else if(manager.inputManager.direction.equals("Right")) {
				renderer.renderingUtil.renderTextureRegion(0, "0022", manager.camera.getCameraX(), manager.camera.getCameraY());
			}
		}
	}
	
}
