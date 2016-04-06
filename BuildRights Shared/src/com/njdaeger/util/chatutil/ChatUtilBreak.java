package com.njdaeger.util.chatutil;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.block.BlockBreakEvent;

public class ChatUtilBreak {
	public static void sendMessage(CommandSender breaker, BlockBreakEvent event) {
		breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
	}
}
