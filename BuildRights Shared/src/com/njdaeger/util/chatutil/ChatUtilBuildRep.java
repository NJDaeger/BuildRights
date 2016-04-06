package com.njdaeger.util.chatutil;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockPlaceEvent;

public class ChatUtilBuildRep {
	public static void sendMessage(CommandSender player, Player builder, BlockPlaceEvent event) {
		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
	}
}
