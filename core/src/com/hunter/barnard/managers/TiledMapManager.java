/* @author Hunter Barnard
 * @version 0.1a
 * @since 2019-08-11
 */
package com.hunter.barnard.managers;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.maps.MapLayer;
import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.hunter.barnard.game.TiledRendererWithSprites;
import com.hunter.barnard.util.TMXMapLoader;

public class TiledMapManager {
	
	private ArrayList<TiledMap> tiledMaps = new ArrayList<TiledMap>();
	private TiledMapRenderer tiledMapRenderer;
	private TiledRendererWithSprites tiledSpriteMapRenderer;
	private TMXMapLoader mapLoader = new TMXMapLoader();
	private MapLayer objectLayer;
	private MasterManager masterManager;
	
	public TiledMapManager(MasterManager masterManager) {
		this.masterManager = masterManager;
		loadTiledMaps();
	}
	
	public void loadTiledMaps() {
		
		tiledMaps.add(mapLoader.loadTMXMap("maps/test.tmx"));
		tiledMaps.add(mapLoader.loadTMXMap("maps/village.tmx"));
		
	}
	
	public TiledMap getTiledMap(int mapID) {
		return tiledMaps.get(mapID);
	}
	
	public void renderTiledMap(int mapID) {
		tiledMapRenderer = new OrthogonalTiledMapRenderer(tiledMaps.get(mapID));
	}
	
	public void renderTiledMap(int mapID, OrthographicCamera camera) {
		tiledMapRenderer = new OrthogonalTiledMapRenderer(tiledMaps.get(mapID));
		tiledMapRenderer.setView(camera);
		tiledMapRenderer.render();

	}
	
	public void renderTiledMap(int mapID, OrthographicCamera camera, TextureRegion player) {
		tiledSpriteMapRenderer = new TiledRendererWithSprites(tiledMaps.get(mapID));
		MapObject object = new MapObject();

		tiledSpriteMapRenderer.setView(camera);
		tiledSpriteMapRenderer.render();

	}
	
	public void setMapCamera(OrthographicCamera camera) {
		tiledMapRenderer.setView(camera);
	}
	
}
