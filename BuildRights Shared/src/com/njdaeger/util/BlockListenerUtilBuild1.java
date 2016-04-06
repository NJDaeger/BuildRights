package com.njdaeger.util;

import org.bukkit.entity.Player;

public class BlockListenerUtilBuild1 {
	public static boolean hasPermission(Player builder, String permission, String permission1, String permission2) {
		if (!builder.hasPermission(permission) || !builder.hasPermission(permission1) || !builder.isOp() || !builder.hasPermission(permission2));
		return true;
	}
}
