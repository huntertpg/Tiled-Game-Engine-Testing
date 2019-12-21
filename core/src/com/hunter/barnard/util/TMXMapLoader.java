/* @author Hunter Barnard
 * @version 0.1a
 * @since 2019-08-11
 */
package com.hunter.barnard.util;

import com.badlogic.gdx.assets.loaders.resolvers.ExternalFileHandleResolver;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;

public class TMXMapLoader {
	
    final String dir = System.getProperty("user.dir");
    final String username = System.getProperty("user.name");
	public TiledMap loadTMXMap(String path) {
		return new TmxMapLoader(new ExternalFileHandleResolver()).load("\\OneDrive\\Desktop\\GameTesting\\desktop\\assets\\" + path);
		
	}

}
