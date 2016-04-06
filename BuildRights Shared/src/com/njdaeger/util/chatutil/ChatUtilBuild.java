package com.njdaeger.util.chatutil;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.block.BlockPlaceEvent;

public class ChatUtilBuild {
	public static void sendMessage(CommandSender builder, BlockPlaceEvent event) {
		builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
	}
}
