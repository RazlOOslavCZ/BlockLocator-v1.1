package mc.RazlOOslavCZ.BlockLocator;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMD
	implements CommandExecutor{

public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	
	if (cmd.getName().equalsIgnoreCase("blocklocator")){
		if (sender instanceof Player) {
			Player p = (Player) sender;
			    p.sendMessage("");
				p.sendMessage(ChatColor.BOLD + "" + ChatColor.AQUA + " BlockLocator");
				p.sendMessage("");
				p.sendMessage(ChatColor.BOLD + "" + ChatColor.GREEN + " Author: " + ChatColor.GRAY + "RazlOOslavCZ");
				p.sendMessage(ChatColor.BOLD + "" + ChatColor.GREEN + " Version: " + ChatColor.GRAY + "v1.1");
				p.sendMessage(ChatColor.BOLD + "" + ChatColor.GREEN + " Spigot site: " + ChatColor.GRAY + "https://www.spigotmc.org/resources/blocklocator.16517/" );
				p.sendMessage("");
				p.sendMessage(ChatColor.BOLD + "" + ChatColor.YELLOW + " Thanks for download! :)");
				p.sendMessage("");
				
				if (cmd.getName().equalsIgnoreCase("bl")){
					if (sender instanceof Player) {
							p.sendMessage("");
							p.sendMessage(ChatColor.BOLD + "" + ChatColor.AQUA + " BlockLocator");
							p.sendMessage("");
							p.sendMessage(ChatColor.BOLD + "" + ChatColor.GREEN + " Author: " + ChatColor.GRAY + "RazlOOslavCZ");
							p.sendMessage(ChatColor.BOLD + "" + ChatColor.GREEN + " Version: " + ChatColor.GRAY + "v1.1");
							p.sendMessage(ChatColor.BOLD + "" + ChatColor.GREEN + " Spigot site: " + ChatColor.GRAY + "https://www.spigotmc.org/resources/blocklocator.16517/" );
							p.sendMessage("");
							p.sendMessage(ChatColor.BOLD + "" + ChatColor.YELLOW + " Thanks for download! :)");
							p.sendMessage("");
		}
	}
	{
}

	return false;
}
}
	return false;
}
}
