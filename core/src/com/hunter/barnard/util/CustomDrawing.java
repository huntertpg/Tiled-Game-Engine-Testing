/* @author Hunter Barnard
 * @version 0.1a
 * @since 2019-08-11
 */
package com.hunter.barnard.util;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Pixmap;

public class CustomDrawing {
	
	private ArrayList<Pixmap> pixmaps = new ArrayList<Pixmap>();
	private TextureLoader textureLoader = new TextureLoader();
	
	public CustomDrawing() {
		
	}
	
	public Pixmap createPixmap() {
		return new Pixmap(256, 128, Pixmap.Format.RGBA8888);
	}
	
	
	
	
	
	
	
}
