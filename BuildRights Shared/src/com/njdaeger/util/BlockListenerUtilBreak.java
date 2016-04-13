package com.njdaeger.util;

import org.bukkit.entity.Player;

public class BlockListenerUtilBreak {
	public static boolean hasPermission(Player breaker, String permission, String permission1, String permission2) {
		if (breaker.hasPermission(permission) || breaker.hasPermission(permission1) || breaker.isOp() || breaker.hasPermission(permission2));
		return false;
	}
}
