package com.echodrive.game;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		System.out.println("AY YO");
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setTitle("echo-drive");
		config.setWindowedMode(1920, 1080);
		config.useVsync(true);
		config.setForegroundFPS(60);
		new Lwjgl3Application(new EchoDrive(), config);

	}
}
