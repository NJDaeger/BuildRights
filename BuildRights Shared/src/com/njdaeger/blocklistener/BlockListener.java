package com.njdaeger.blocklistener;
import net.md_5.bungee.api.chat.ClickEvent.Action;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import com.njdaeger.util.*;
import com.njdaeger.util.chatutil.ChatUtilBreak;
import com.njdaeger.util.chatutil.ChatUtilBreakRep;
import com.njdaeger.util.chatutil.ChatUtilBuild;
import com.njdaeger.util.chatutil.ChatUtilBuildRep;
import com.njdaeger.br.BuildRights;



public class BlockListener implements Listener {
	public BlockListener(BuildRights plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

	
	
	////////STONE//////// 1
	@EventHandler
	public void stonep(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.stone") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.STONE) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.stone") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.STONE) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void stoneb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.stone") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.STONE) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.stone") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.STONE) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////GRASS//////// 2
	@EventHandler
	public void grassp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.grass") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.GRASS) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.grass") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.GRASS) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void grassb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.grass") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.GRASS) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.grass") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.GRASS) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////DIRT//////// 3
	@EventHandler
	public void dirtp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.dirt") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.DIRT) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.dirt") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.DIRT) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void dirtb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.dirt") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.DIRT) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.dirt") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.DIRT) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////COBBLESTONE//////// 4
	@EventHandler
	public void cobblep(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.cobblestone") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.COBBLESTONE) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.cobblestone") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.COBBLESTONE) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void cobbleb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.cobblestone") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.COBBLESTONE) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.cobblestone") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.COBBLESTONE) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////PLANKS//////// 5
	@EventHandler
	public void planksp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.wood") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.WOOD) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.wood") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.WOOD) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void planksb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.wood") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.WOOD) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.wood") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.WOOD) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////SAPLINGS//////// 6
	@EventHandler
	public void saplingp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.sapling") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.SAPLING) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.sapling") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.SAPLING) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void saplingb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.sapling") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.SAPLING) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.sapling") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.SAPLING) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////BEDROCK//////// 7
	@EventHandler
	public void bedrockp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.bedrock") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.BEDROCK) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.bedrock") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.BEDROCK) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void bedrockb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.bedrock") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.BEDROCK) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.bedrock") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.BEDROCK) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////WATER////////	(unneeded) 8
	@EventHandler
	public void waterp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.water") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.WATER) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.water") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.WATER) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void waterb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.water") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.WATER) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.water") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.WATER) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////WATERBUCKET//////// 9
	@EventHandler
	public void waterbucketp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.water") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.WATER_BUCKET) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.water") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.WATER_BUCKET) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void waterbucketb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.water") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.WATER_BUCKET) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.water") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.WATER_BUCKET) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////LAVA//////// 10
	@EventHandler
	public void lavap(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.lava") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.LAVA) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.lava") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.LAVA) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void lavab(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.lava") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.LAVA) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.lava") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.LAVA) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////LAVABUCKET//////// 11
	@EventHandler
	public void lavabucketp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.lava") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.LAVA_BUCKET) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.lava") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.LAVA_BUCKET) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void lavabucketb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.lava") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.LAVA_BUCKET) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.lava") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.LAVA_BUCKET) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////SAND//////// 12
	@EventHandler
	public void sandp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.sand") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.SAND) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.sand") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.SAND) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void sandb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.sand") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.SAND) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.sand") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.SAND) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////GRAVEL//////// 13
	@EventHandler
	public void gravelp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.gravel") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.GRAVEL) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.gravel") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.GRAVEL) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void gravelb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.gravel") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.GRAVEL) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.gravel") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.GRAVEL) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////GOLDORE//////// 14
	@EventHandler
	public void goldorep(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.goldore") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.GOLD_ORE) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.goldore") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.GOLD_ORE) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void goldoreb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.goldore") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.GOLD_ORE) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.goldore") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.GOLD_ORE) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////IRONORE//////// 15
	@EventHandler
	public void ironorep(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.ironore") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.IRON_ORE) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.ironore") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.IRON_ORE) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void ironoreb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.ironore") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.IRON_ORE) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.ironore") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.IRON_ORE) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////COALORE//////// 16
	@EventHandler
	public void coalorep(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.coalore") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.COAL_ORE) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.coalore") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.COAL_ORE) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void coaloreb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.coalore") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.COAL_ORE) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.coalore") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.COAL_ORE) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////LOG//////// 17
	@EventHandler
	public void logp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.log") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.LOG) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.log") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.LOG) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void logb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.log") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.LOG) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.log") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.LOG) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////LEAVES//////// 18
	@EventHandler
	public void leavesp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.leaves") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.LEAVES) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.leaves") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.LEAVES) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void leavesb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.leaves") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.LEAVES) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.leaves") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.LEAVES) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////SPONGE//////// 19
	@EventHandler
	public void spongep(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.sponge") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.SPONGE) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.sponge") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.SPONGE) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void spongeb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.sponge") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.SPONGE) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.sponge") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.SPONGE) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////GLASS//////// 20
	@EventHandler
	public void glassp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.glass") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.GLASS) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.glass") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.GLASS) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void glassb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.glass") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.GLASS) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.glass") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.GLASS) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}

	
	
	////////LAPISORE//////// 21
	@EventHandler
	public void lapisorep(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.lapisore") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.LAPIS_ORE) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.lapisore") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.LAPIS_ORE) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void lapisoreb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.lapisore") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.LAPIS_ORE) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.lapisore") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.LAPIS_ORE) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////LAPISBLOCK//////// 22
	@EventHandler
	public void lapisblockp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.lapisblock") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.LAPIS_BLOCK) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.lapisblock") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.LAPIS_BLOCK) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void lapisblockb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.lapisblock") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.LAPIS_BLOCK) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.lapisblock") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.LAPIS_BLOCK) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////DISPENSER//////// 23
	@EventHandler
	public void dispenserp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.dispenser") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.DISPENSER) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.dispenser") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.DISPENSER) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void dispenserb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.dispenser") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.DISPENSER) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.dispenser") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.DISPENSER) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////SANDSTONE//////// 24
	@EventHandler
	public void sandstonep(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.sandstone") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.SANDSTONE) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.sandstone") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.SANDSTONE) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void sandstoneb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.sandstone") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.SANDSTONE) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.sandstone") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.SANDSTONE) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////NOTEBLOCK//////// 25
	@EventHandler
	public void noteblockp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.noteblock") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.NOTE_BLOCK) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.noteblock") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.NOTE_BLOCK) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void noteblockb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.noteblock") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.NOTE_BLOCK) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.noteblock") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.NOTE_BLOCK) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////BED//////// 26
	@EventHandler
	public void bedp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.bed") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.BED) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.bed") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.BED) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void bedb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.bed") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.BED) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.bed") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.BED) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////BED//////// 26
	@EventHandler
	public void bedblockp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.bed") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.BED_BLOCK) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.bed") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.BED_BLOCK) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void bedblockb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.bed") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.BED_BLOCK) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.bed") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.BED_BLOCK) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////POWEREDRAIL//////// 27
	@EventHandler
	public void poweredrailp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.poweredrail") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.POWERED_RAIL) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.poweredrail") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.POWERED_RAIL) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void poweredrailb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.poweredrail") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.POWERED_RAIL) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.poweredrail") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.POWERED_RAIL) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////DETECTORRAIL//////// 28
	@EventHandler
	public void detectorrailp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.detectorrail") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.DETECTOR_RAIL) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.detectorrail") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.DETECTOR_RAIL) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void detectorrailb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.detectorrail") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.DETECTOR_RAIL) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.detectorrail") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.DETECTOR_RAIL) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////STICKYPISTON//////// 29
	@EventHandler
	public void stickypistonp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.stickypiston") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.PISTON_STICKY_BASE) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.stickypiston") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.PISTON_STICKY_BASE) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void stickypistonb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.stickypiston") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.PISTON_STICKY_BASE) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.stickypiston") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.PISTON_STICKY_BASE) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////COBWEB//////// 30
	@EventHandler
	public void cobwebp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.cobweb") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.WEB) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.cobweb") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.WEB) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void cobwebb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.cobweb") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.WEB) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.cobweb") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.WEB) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////GRASS-FERN//////// 31
	@EventHandler
	public void tgrassp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.tallgrass") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.LONG_GRASS) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.tallgrass") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.LONG_GRASS) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void tgrassb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.tallgrass") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.LONG_GRASS) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.tallgrass") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.LONG_GRASS) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////DEADBUSH//////// 32
	@EventHandler
	public void deadbushp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.deadbush") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.DEAD_BUSH) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.deadbush") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.DEAD_BUSH) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void deadbushb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.deadbush") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.DEAD_BUSH) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.deadbush") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.DEAD_BUSH) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////PISTON//////// 33
	@EventHandler
	public void pistonp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.piston") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.PISTON_BASE) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.piston") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.PISTON_BASE) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void pistonb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.piston") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.PISTON_BASE) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.piston") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.PISTON_BASE) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////PISTONHEAD//////// 34
	@EventHandler
	public void pistonheadp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.pistonhead") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.PISTON_MOVING_PIECE) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.pistonhead") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.PISTON_MOVING_PIECE) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void pistonheadb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.pistonhead") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.PISTON_MOVING_PIECE) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.pistonhead") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.PISTON_MOVING_PIECE) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////WOOL//////// 35
	@EventHandler
	public void woolp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.wool") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.WOOL) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.wool") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.WOOL) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void woolb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.wool") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.WOOL) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.wool") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.WOOL) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////PISTONEXTENSION//////// 36
	@EventHandler
	public void pistonhead1p(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.pistonhead") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.PISTON_EXTENSION) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.pistonhead") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.PISTON_EXTENSION) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void pistonhead1b(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.pistonhead") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.PISTON_EXTENSION) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.pistonhead") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.PISTON_EXTENSION) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////DANDELION//////// 37
	@EventHandler
	public void yellowflowerp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.dandelion") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.YELLOW_FLOWER) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.dandelion") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.YELLOW_FLOWER) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void yellowflowerb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.dandelion") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.YELLOW_FLOWER) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.dandelion") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.YELLOW_FLOWER) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////POPPY(and other flowers)//////// 38
	@EventHandler
	public void poppyp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.redflower") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.RED_ROSE) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.redflower") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.RED_ROSE) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void poppyb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.redflower") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.RED_ROSE) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.redflower") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.RED_ROSE) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////BROWNMUSHROOM//////// 39
	@EventHandler
	public void brownmushroomp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.brownmushroom") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.BROWN_MUSHROOM) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.brownmushroom") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.BROWN_MUSHROOM) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void brownmushroomb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.brownmushroom") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.BROWN_MUSHROOM) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.brownmushroom") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.BROWN_MUSHROOM) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////REDMUSHROOM//////// 40
	@EventHandler
	public void redmushroomp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (builder.hasPermission("buildrights.place.*") || builder.hasPermission("buildrights.place.redmushroom") || builder.isOp() || builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.RED_MUSHROOM) {
				event.setCancelled(false);
			}
		}else if(!builder.hasPermission("buildrights.place.*") || !builder.hasPermission("buildrights.place.redmushroom") || !builder.isOp() || !builder.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.RED_MUSHROOM) {
				builder.sendMessage(ChatColor.DARK_RED + "You cannot place " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase());
			    	}
				}
			}
		}
	}
	@EventHandler
	public void redmushroomb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (breaker.hasPermission("buildrights.break.*") || breaker.hasPermission("buildrights.break.redmushroom") || breaker.isOp() || breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.RED_MUSHROOM) {
				event.setCancelled(false);
			}
		}else if(!breaker.hasPermission("buildrights.break.*") || !breaker.hasPermission("buildrights.break.redmushroom") || !breaker.isOp() || !breaker.hasPermission("buildrights.*")) {
			if(event.getBlock().getType() == Material.RED_MUSHROOM) {
				breaker.sendMessage(ChatColor.DARK_RED + "You cannot break " + event.getBlock().getType().toString().toLowerCase() + "!");
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						player.sendMessage(ChatColor.RED + breaker.getName() + " has tried to break " + event.getBlock().getType().toString().toLowerCase());
					}
				}
			}
		}
	}
	
	
	
	////////GOLDBLOCK//////// 41
	@EventHandler
	public void goldblockp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (BlockListenerUtilBuild.hasPermission(builder, "buildrights.place.*", "buildrights.place.goldblock", "buildrights.*")) {
			if(event.getBlock().getType() == Material.GOLD_BLOCK) {
				event.setCancelled(false);
			}
		}else if(BlockListenerUtilBuild1.hasPermission(builder, "buildrights.place.*", "buildrights.place.goldblock", "buildrights.*")) {
			if(event.getBlock().getType() == Material.GOLD_BLOCK) {
				ChatUtilBuild.sendMessage(builder, event);
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
			    	if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
			    		ChatUtilBuildRep.sendMessage(player, builder, event);
			    	}
				}
			}
		}
	}
	@EventHandler
	public void goldblockb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if(BlockListenerUtilBreak.hasPermission(breaker, "buildrights.break.*", "buildrights.break.goldblock", "buildrights.*")) {
			if(event.getBlock().getType() == Material.GOLD_BLOCK) {
				event.setCancelled(false);
			}
		}else if(BlockListenerUtilBreak1.hasPermission(breaker, "buildrights.break.*", "buildrights.break.goldblock", "buildrights.*")) {
			if(event.getBlock().getType() == Material.GOLD_BLOCK) {
				ChatUtilBreak.sendMessage(breaker, event);
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()){
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")){
						ChatUtilBreakRep.sendMessage(player, breaker, event);
					}
				}
			}
		}
	}
	
	
	
	////////IRONBLOCK//////// 42
	@EventHandler
	public void ironblockp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if(BlockListenerUtilBuild.hasPermission(builder, "buildrights.place.*", "buildrights.place.ironblock", "buildrights.*")) {
			if(event.getBlock().getType() == Material.IRON_BLOCK) {
				event.setCancelled(false);
			}
		}else if (BlockListenerUtilBuild1.hasPermission(builder, "buildrights.place.*", "buildrights.place.ironblock", "buildrights.*")) {
			if(event.getBlock().getType() == Material.IRON_BLOCK) {
				ChatUtilBuild.sendMessage(builder, event);
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()) {
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")) {
						ChatUtilBuildRep.sendMessage(player, builder, event);
					}
				}
			}
		}
	}
	@EventHandler
	public void ironblockb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if(BlockListenerUtilBreak.hasPermission(breaker, "buildrights.break.*", "buildrights.break.ironblock", "buildrights.*")) {
			if(event.getBlock().getType() == Material.IRON_BLOCK) {
				event.setCancelled(false);
			}
		}else if (BlockListenerUtilBreak1.hasPermission(breaker, "buildrights.break.*", "buildrights.break.ironblock", "buildrights.*")) {
			if(event.getBlock().getType() == Material.IRON_BLOCK) {
				ChatUtilBreak.sendMessage(breaker, event);
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()) {
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")) {
						ChatUtilBreakRep.sendMessage(player, breaker, event);
					}
				}
			}
		}
	}
	
	
	
	////////Doublestep//////// 43
	@EventHandler
	public void doublestepp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (BlockListenerUtilBuild.hasPermission(builder, "buildrights.place.*", "buildrights.place.doublestep", "buildrights.*")) {
			if(event.getBlock().getType() == Material.DOUBLE_STEP) {
				event.setCancelled(false);
			}
		}else if(BlockListenerUtilBuild1.hasPermission(builder, "buildrights.place.*", "buildrights.place.doublestep", "buildrights.*")) {
			if (event.getBlock().getType() == Material.DOUBLE_STEP) {
				ChatUtilBuild.sendMessage(builder, event);
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()) {
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")) {
						ChatUtilBuildRep.sendMessage(player, builder, event);
					}
				}
			}
		}
	}
	@EventHandler
	public void doublestepb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (BlockListenerUtilBreak.hasPermission(breaker, "buildrights.break.*", "buildrights.break.doublestep", "buildrights.*")) {
			if (event.getBlock().getType() == Material.DOUBLE_STEP) {
				event.setCancelled(false);
			}
		}else if(BlockListenerUtilBreak1.hasPermission(breaker, "buildrights.break.*", "buildrights.break.doublestep", "buildrights.*")) {
			if (event.getBlock().getType() == Material.DOUBLE_STEP) {
				ChatUtilBreak.sendMessage(breaker, event);
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()) {
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")) {
						ChatUtilBreakRep.sendMessage(player, breaker, event);
					}
				}
			}
		}
	}
	
	
	
	////////SLAB//////// 44
	@EventHandler
	public void slabp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (BlockListenerUtilBuild.hasPermission(builder, "buildrights.place.*", "buildrights.place.slab", "buildrights.*")) {
			if (event.getBlock().getType() == Material.STONE_SLAB2) {
				event.setCancelled(false);
			}
		}else if(BlockListenerUtilBuild1.hasPermission(builder, "buildrights.place.*", "buildrights.place.slab", "buildrights.*")) {
			if (event.getBlock().getType() == Material.STONE_SLAB2) {
				ChatUtilBuild.sendMessage(builder, event);
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()) {
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")) {
						ChatUtilBuildRep.sendMessage(player, builder, event);
					}
				}
			}
		}
	}
	@EventHandler
	public void slabb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (BlockListenerUtilBreak.hasPermission(breaker, "buildrights.break.*", "buildrights.break.slab", "buildrights.*")) {
			if (event.getBlock().getType() == Material.STONE_SLAB2) {
				event.setCancelled(false);
			}
		}else if(BlockListenerUtilBreak1.hasPermission(breaker, "buildrights.break.*", "buildrights.break.slab", "buildrights.*")) {
			if (event.getBlock().getType() == Material.STONE_SLAB2) {
				ChatUtilBreak.sendMessage(breaker, event);
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()) {
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")) {
						ChatUtilBreakRep.sendMessage(player, breaker, event);
					}
				}
			}
		}
	}
	
	
	
	////////BRICK//////// 45
	@EventHandler
	public void brickp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (BlockListenerUtilBuild.hasPermission(builder, "buildrights.place.*", "buildrights.place.brick", "buildrights.*")) {
			if (event.getBlock().getType() == Material.BRICK) {
				event.setCancelled(false);
			}
		}else if (BlockListenerUtilBuild1.hasPermission(builder, "buildrights.place.*", "buildrights.place.brick", "buildrights.*")) {
			if (event.getBlock().getType() == Material.BRICK) {
				ChatUtilBuild.sendMessage(builder, event);
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()) {
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")) {
						ChatUtilBuildRep.sendMessage(player, builder, event);
					}
				}
			}
		}
	}@EventHandler
	public void brickb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (BlockListenerUtilBreak.hasPermission(breaker, "buildrights.break.*", "buildrights.break.brick", "buildrights.*")) {
			if (event.getBlock().getType() == Material.BRICK) {
				event.setCancelled(false);
			}
		}else if(BlockListenerUtilBreak1.hasPermission(breaker, "buildrights.break.*", "buildrights.break.brick", "buildrights.*")) {
			if (event.getBlock().getType() == Material.BRICK) {
				ChatUtilBreak.sendMessage(breaker, event);
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()) {
					if (player.hasPermission("buildrights.notify") || player.isOp() | player.hasPermission("buildrights.*")) {
						ChatUtilBreakRep.sendMessage(player, breaker, event);
					}
				}
			}
		}
	}
	
	
	
	////////TNT////////
	@EventHandler
	public void tntp(BlockPlaceEvent event) {
		Player builder = event.getPlayer();
		if (BlockListenerUtilBuild.hasPermission(builder, "buildrights.place.*", "buildrights.place.tnt", "buildrights.*")) {
			if (event.getBlock().getType() == Material.TNT) {
				event.setCancelled(false);
			}
		}else if (BlockListenerUtilBuild1.hasPermission(builder, "buildrights.place.*", "buildrights.place.tnt", "buildrights.*")) {
			if (event.getBlock().getType() == Material.TNT) {
				ChatUtilBuild.sendMessage(builder, event);
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()) {
					if (player.hasPermission("buildrights.notify") || player.isOp() || player.hasPermission("buildrights.*")) {
						player.sendMessage(ChatColor.RED + builder.getName() + " has tried to place " + event.getBlock().getType().toString().toLowerCase() + 
								" Kick:" + ChatColor.DARK_GREEN + "yes" + Action.RUN_COMMAND + "/kick" + builder.getName() + ChatColor.DARK_GRAY + ChatColor.BOLD + 
								"/" + ChatColor.DARK_RED + "no" + ChatColor.RED + "?");
					}
				}
			}
		}
	}@EventHandler
	public void tntb(BlockBreakEvent event) {
		Player breaker = event.getPlayer();
		if (BlockListenerUtilBreak.hasPermission(breaker, "buildrights.break.*", "buildrights.break.tnt", "buildrights.*")) {
			if (event.getBlock().getType() == Material.TNT) {
				event.setCancelled(false);
			}
		}else if(BlockListenerUtilBreak1.hasPermission(breaker, "buildrights.break.*", "buildrights.break.tnt", "buildrights.*")) {
			if (event.getBlock().getType() == Material.TNT) {
				ChatUtilBreak.sendMessage(breaker, event);
				event.setCancelled(true);
				for (Player player : Bukkit.getServer().getOnlinePlayers()) {
					if (player.hasPermission("buildrights.notify") || player.isOp() | player.hasPermission("buildrights.*")) {
						ChatUtilBreakRep.sendMessage(player, breaker, event);
					}
				}
			}
		}
	}
}
		
