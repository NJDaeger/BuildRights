package com.njdaeger.util.chatutil;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;

public class ChatUtilBreakRep {
	public static void sendMessage(CommandSender player, Player breaker, BlockBreakEvent event) {
		player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
	}
}