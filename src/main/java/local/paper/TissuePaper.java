package local.paper;

import org.bukkit.plugin.java.JavaPlugin;

public class TissuePaper extends JavaPlugin {
    @Override
    public void onLoad() {
        getLogger().severe("Plugin loaded");
    }

    @Override
    public void onEnable() {
        getLogger().severe("Plugin enabled");
    }
    @Override
    public void onDisable() {
        getLogger().severe("Plugin disabled");
    }
}
