/* @author Hunter Barnard
 * @version 0.1a
 * @since 2019-08-11
 */
package com.hunter.barnard.managers;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.g2d.Animation;

public class AnimationManager {
	
	public ArrayList<Animation> playerAnimation = new ArrayList<Animation>();
	private TextureAtlasManager textureAtlasManager;
	
	public AnimationManager(TextureAtlasManager textureAtlasManager) {
		System.out.println("Loading Animations...");
		this.textureAtlasManager = textureAtlasManager;
		loadAnimations();
		System.out.println("Animations Loaded...");
	}
	
	@SuppressWarnings("unchecked")
	public void loadAnimations() {
		
		playerAnimation.add(new Animation(1/4f, (textureAtlasManager.getTextureAtlas(0).findRegion("005")), 
												(textureAtlasManager.getTextureAtlas(0).findRegion("006")), 
												(textureAtlasManager.getTextureAtlas(0).findRegion("007")),
												(textureAtlasManager.getTextureAtlas(0).findRegion("006"))));
		
		playerAnimation.add(new Animation(1/4f, (textureAtlasManager.getTextureAtlas(0).findRegion("0029")), 
												(textureAtlasManager.getTextureAtlas(0).findRegion("0030")), 
												(textureAtlasManager.getTextureAtlas(0).findRegion("0031")),
												(textureAtlasManager.getTextureAtlas(0).findRegion("0030"))));
		
		playerAnimation.add(new Animation(1/4f, (textureAtlasManager.getTextureAtlas(0).findRegion("0013")), 
												(textureAtlasManager.getTextureAtlas(0).findRegion("0014")), 
												(textureAtlasManager.getTextureAtlas(0).findRegion("0015")),
												(textureAtlasManager.getTextureAtlas(0).findRegion("0014"))));
		
		playerAnimation.add(new Animation(1/4f, (textureAtlasManager.getTextureAtlas(0).findRegion("0021")), 
												(textureAtlasManager.getTextureAtlas(0).findRegion("0022")), 
												(textureAtlasManager.getTextureAtlas(0).findRegion("0023")),
												(textureAtlasManager.getTextureAtlas(0).findRegion("0022"))));
		//----------------------------------------------------------------------------------------------------
		playerAnimation.add(new Animation(1/4f, (textureAtlasManager.getTextureAtlas(0).findRegion("002")), 
												(textureAtlasManager.getTextureAtlas(0).findRegion("003")), 
												(textureAtlasManager.getTextureAtlas(0).findRegion("004")),
												(textureAtlasManager.getTextureAtlas(0).findRegion("003"))));
		
		playerAnimation.add(new Animation(1/4f, (textureAtlasManager.getTextureAtlas(0).findRegion("0026")), 
												(textureAtlasManager.getTextureAtlas(0).findRegion("0027")), 
												(textureAtlasManager.getTextureAtlas(0).findRegion("0028")),
												(textureAtlasManager.getTextureAtlas(0).findRegion("0027"))));
		
		playerAnimation.add(new Animation(1/4f, (textureAtlasManager.getTextureAtlas(0).findRegion("0010")), 
												(textureAtlasManager.getTextureAtlas(0).findRegion("0011")), 
												(textureAtlasManager.getTextureAtlas(0).findRegion("0012")),
												(textureAtlasManager.getTextureAtlas(0).findRegion("0011"))));
		
		playerAnimation.add(new Animation(1/4f, (textureAtlasManager.getTextureAtlas(0).findRegion("0018")), 
												(textureAtlasManager.getTextureAtlas(0).findRegion("0019")), 
												(textureAtlasManager.getTextureAtlas(0).findRegion("0020")),
												(textureAtlasManager.getTextureAtlas(0).findRegion("0019"))));
	
	}

}
