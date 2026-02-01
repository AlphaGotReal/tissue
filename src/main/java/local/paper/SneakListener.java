package local.paper;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.inventory.ItemStack;

public class SneakListener implements Listener {
//    @EventHandler
//    public void onPlayerToggleSneak(PlayerToggleSneakEvent event) {
//        Player player = event.getPlayer();
//        if (player.isSneaking()) {
//            player.setHealth(20);
//        }
//    }

//    @EventHandler
//    public void onPlayerSneak(PlayerToggleSneakEvent event) {
//        Player player = event.getPlayer();
//        World world = player.getWorld();
//        Location location = player.getLocation();
//        Block block = world.getBlockAt(new Location(world, location.x(), location.y()-1, location.z()));
//        player.getInventory().addItem(new ItemStack(block.getType()));
//    }

    @EventHandler
    public void onPlayerSneak(PlayerToggleSneakEvent event) {
        Player player = event.getPlayer();
        player.setMaxHealth(22);
    }

}
