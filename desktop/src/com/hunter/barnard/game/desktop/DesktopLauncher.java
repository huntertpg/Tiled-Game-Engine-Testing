package com.hunter.barnard.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.hunter.barnard.game.Land_of_Gongoria;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Land Of Gongoria";
		config.width = 1280;
		config.height = 720;
		new LwjglApplication(new Land_of_Gongoria(), config);
	}
}
