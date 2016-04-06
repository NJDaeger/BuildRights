package com.njdaeger.blocklistener;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import com.njdaeger.br.BuildRights;

public class WorldeditListener implements Listener {
	public WorldeditListener(BuildRights plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void setair(PlayerCommandPreprocessEvent event) {
		Player exe = event.getPlayer();
		String command = event.getMessage();
		if (exe.hasPermission("buildrights.worldedit.setair") || exe.isOp() || exe.hasPermission("buildrights.worldedit.*") || exe.hasPermission("buildrights.*")) {
			if(command.startsWith("//set air") || command.startsWith("//set 0") || command.startsWith("//set ai") || command.startsWith("//set ar")) {
				event.setCancelled(false);
			}
		}
		else if (!exe.hasPermission("buildrights.worldedit.setair") || !exe.isOp() || !exe.hasPermission("buildrights.worldedit.*") || !exe.hasPermission("buildrights.*")) {
			if(command.startsWith("//set air") || command.startsWith("//set 0") || command.startsWith("//set ai") || command.startsWith("//set ar")) {
				exe.sendMessage(ChatColor.DARK_RED + "You cannot set air!");
				event.setCancelled(true);
			}
		}
	}
}
