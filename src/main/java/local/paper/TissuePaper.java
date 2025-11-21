package local.paper;

import com.google.common.util.concurrent.ServiceManager.Listener;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.plugin.java.JavaPlugin;
import local.paper.SneakListener;

public class TissuePaper extends JavaPlugin {
    @Override
    public void onLoad() {
        getLogger().severe("Plugin loaded");
    }

    @Override
    public void onEnable() {
        getLogger().severe("Plugin enabled");
        getServer().getPluginManager().registerEvents(new SneakListener(), this);
    }



    @Override
    public void onDisable() {
        getLogger().severe("Plugin disabled");
    }
}
