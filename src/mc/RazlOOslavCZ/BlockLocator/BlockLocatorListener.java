package mc.RazlOOslavCZ.BlockLocator;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;


public class BlockLocatorListener
  implements Listener
  {

  public BlockLocator plugin;
  
  public BlockLocatorListener(BlockLocator instance)
  {
    this.plugin = instance;
  }
  
  @EventHandler
  public void onPlayerInteract(PlayerInteractEvent event)
  {
    if ((event.getPlayer().getItemInHand().getTypeId() == Material.DIAMOND.getId()) && (event.getAction() == Action.RIGHT_CLICK_BLOCK) && (event.getPlayer().isOp()))
    {
      int x = event.getClickedBlock().getX();
      int y = event.getClickedBlock().getY();
      int z = event.getClickedBlock().getZ();
      String prefix = this.plugin.getConfig().getString("prefix").replace("&", "§");
      String message = this.plugin.getConfig().getString("message").replace("&", "§");
      event.getPlayer().sendMessage(prefix + message + " X: " + x + ", Y: " + y + ", Z: " + z);
      if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK))
      {
        Block block = event.getClickedBlock();
        String blockmessage = this.plugin.getConfig().getString("blockmessage").replace("&", "§");
        event.getPlayer().sendMessage(prefix + blockmessage + block.getType());
      }
    }
        }


}

  
  

