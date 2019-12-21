/* @author Hunter Barnard
 * @version 0.1a
 * @since 2019-08-11
 * 
 * This main point of this class is to create and load in fonts. This class uses the font loader
 * class to load in the fonts and a ArrayList to store the loaded fonts to make a makeshift ID system for the fonts
 * This class also gives ways to modify the attributes of the fonts such as the size and color.
 * 
 */

package com.hunter.barnard.managers;

import java.util.ArrayList;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.hunter.barnard.util.FontLoader;

public class FontManager {
	// Create an Array List of bitmap fonts for storing all the fonts
	private ArrayList<BitmapFont> fonts = new ArrayList<BitmapFont>();
	// Declare and initialize the Font Loader
	private FontLoader fontLoader = new FontLoader();

	// Declare the FontManager Constructor
	public FontManager() {
		System.out.println("Loading Fonts...");
		loadFonts();
		System.out.println("Fonts Loaded...");
	}

	// This is where all the fonts will be loaded, we add the fonts to the fontlist
	// and pass in the fontloader
	// to actually load in the font
	public void loadFonts() {
		// Add the font and use the font loader to actually load the font

		fonts.add(fontLoader.loadFont("fonts/TestFont.fnt"));
		fonts.add(fontLoader.loadFont("fonts/Arial_Black.fnt"));
	}

	// This function is a shorthand for setting the color of the fonts, passing in
	// the font id of the font the color should be set
	// and then the color that the font should be
	public void setFontColor(int fontID, Color color) {
		// get the font index/id and set the color to the passed in color
		fonts.get(fontID).setColor(color);
	}

	// This function is a shorthand for setting the size of the font. This takes in
	// the font ID and the size in float that
	// the font should be set to
	public void setFontScale(int fontID, float scale) {
		// This gets the font ID/index and sets the font size by the passed in size.
		fonts.get(fontID).getData().setScale(scale);
	}

	// This function is a shorthand for setting the size of the font but at as width
	// and height as well as taking in the font ID that should be scaled
	public void setFontScale(int fontID, float scaleX, float scaleY) {
		// This function gets the font ID from the array list and sets the scale
		fonts.get(fontID).getData().setScale(scaleX, scaleY);
	}

	// This function returns the font by taking in the font ID and returning it from
	// the array list
	public BitmapFont getFont(int fontID) {
		// Return the font from the array list
		return fonts.get(fontID);
	}

	// This function adds the font
	public void addFont() {
		fontLoader.loadFont();
	}

	// This function adds a font by passing in a path
	public void addFont(String path) {
		fontLoader.loadFont(path);
	}

	// Disposes all the fonts so that memory doesn't leak
	public void disposeFonts() {
		System.out.println("Disposing Fonts...");
		for (int i = 0; i < fonts.size(); i++) {
			fonts.get(i).dispose();
		}
		System.out.println("Fonts Disposed...");

	}
}
