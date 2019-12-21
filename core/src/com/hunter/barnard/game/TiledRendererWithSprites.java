/* @author Hunter Barnard
 * @version 0.1a
 * @since 2019-08-11
 */
package com.hunter.barnard.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.objects.TextureMapObject;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;

public class TiledRendererWithSprites extends OrthogonalTiledMapRenderer{

	private SpriteBatch spriteBatch;
	
	public TiledRendererWithSprites(TiledMap map) {
        super(map);
        spriteBatch = new SpriteBatch();
    }

    @Override
    public void renderObject(MapObject object) {
        if(object instanceof TextureMapObject) {
            TextureMapObject textureObj = (TextureMapObject) object;
                spriteBatch.draw(textureObj.getTextureRegion(), textureObj.getX(), textureObj.getY());
        }
    }

}
