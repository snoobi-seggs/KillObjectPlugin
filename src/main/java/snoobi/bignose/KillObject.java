package snoobi.bignose;

import emu.grasscutter.plugin.Plugin;
import snoobi.bignose.commands.KillObjectCommand;

public final class KillObject extends Plugin {
    /* Turn the plugin into a singleton. */
    private static KillObject instance;

    public static KillObject getInstance() {
        return instance;
    }
    
    @Override public void onLoad() {
        // Set the plugin instance.
        instance = this;
    }

    @Override public void onEnable() {
        // Register commands.
        this.getHandle().registerCommand(new KillObjectCommand());

        // Log a plugin status message.
        this.getLogger().info("The testSpawn has been loaded");
    }

    @Override public void onDisable() {
        // Log a plugin status message.
        this.getLogger().info("The TestSpawn plugin died lol");
    }

  
}
