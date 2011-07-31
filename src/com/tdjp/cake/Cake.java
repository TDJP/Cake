package com.tdjp.cake;

import java.io.File;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class Cake extends JavaPlugin{

	public static File data;
	
	@Override
	public void onDisable() {
		send("Fuck me", 15);
		return;
	}

	@Override
	public void onEnable() {
		send("Enabled", 7);
		data = getDataFolder();
		return;		
	}
	@SuppressWarnings("unused")
	private void send(String message){
		System.out.println("[Cake] " + message);
		return;
	}
	private void send(String message, int times){
		for (int i = times; i > 0; i--){
			System.out.println("[Cake] " + message);
		}
		return;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args){
		
		if (!(sender instanceof Player)){
			sender.sendMessage("You are a fucking dumbass u must be player to gets stuff");
			return true;
		}else{
			if (command.getName().equalsIgnoreCase("cake")){
				Player player = (Player) sender;
				Inventory i = player.getInventory();
				i.addItem(new ItemStack(Material.CAKE, Config.getCakeTimes()));
				player.sendMessage(ChatColor.GOLD+"b"+ChatColor.BLUE+"l"+ChatColor.DARK_PURPLE+"a"+ChatColor.DARK_RED+"h");
				return true;
			}
		}		
		return true;
	}
}
