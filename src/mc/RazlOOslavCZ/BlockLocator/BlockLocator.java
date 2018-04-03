package mc.RazlOOslavCZ.BlockLocator;

import java.util.logging.Logger;
import org.bukkit.Server;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class BlockLocator
  extends JavaPlugin
{
  Logger logger = Logger.getLogger("Minecraft");
  
  public void onEnable()
  {
	getCommand("blocklocator").setExecutor(new CMD());
    saveDefaultConfig();
    this.getLogger().info("BlockLocator activated!");
    this.getLogger().info("Thanks for download! :)");
    PluginManager pm = getServer().getPluginManager();
    pm.registerEvents(new BlockLocatorListener(this), this);
  }
  
  public void onDisable()
  { 
    this.getLogger().info("BlockLocator deactived!");
    this.getLogger().info("Thanks for download! :)");
  }
}
