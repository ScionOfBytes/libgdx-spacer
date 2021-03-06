package me.scionofbytes.libgdx.spacer.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import me.scionofbytes.libgdx.spacer.Main;

public class DesktopLauncher {

  public static void main(String[] arg) {

    LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

    config.title = "Spacer";
    config.height = 800;
    config.width = 480;

    new LwjglApplication(new Main(), config);
  }
}
