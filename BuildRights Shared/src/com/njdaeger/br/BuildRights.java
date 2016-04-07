package com.njdaeger.br;

import org.bukkit.permissions.Permission;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.njdaeger.blocklistener.BlockListener;
import com.njdaeger.blocklistener.WorldeditListener;
import com.njdaeger.util.BlockListenerUtilBreak;
import com.njdaeger.util.BlockListenerUtilBreak1;
import com.njdaeger.util.BlockListenerUtilBuild;
import com.njdaeger.util.BlockListenerUtilBuild1;
import com.njdaeger.util.chatutil.ChatUtilBreak;
import com.njdaeger.util.chatutil.ChatUtilBreakRep;
import com.njdaeger.util.chatutil.ChatUtilBuild;
import com.njdaeger.util.chatutil.ChatUtilBuildRep;

public class BuildRights extends JavaPlugin {
	
		//core permissions
	public Permission brnotify = new Permission("buildrights.notify");
	public Permission placeall = new Permission("buildrights.place.*");
	public Permission breakall = new Permission("buildrights.break.*");
	public Permission brallperms = new Permission("buildrights.*");
		//worldedit permissions
	public Permission setair = new Permission("buildrights.worldedit.setair");
	public Permission worldeditall = new Permission("buildrights.worldedit.*");
		
		//place permissions
	public Permission place1 = new Permission("buildrights.place.stone");			//BlockListener
	public Permission place2 = new Permission("buildrights.place.grass");			//BlockListener
	public Permission place3 = new Permission("buildrights.place.dirt");			//BlockListener
	public Permission place4 = new Permission("buildrights.place.cobblestone");		//BlockListener
	public Permission place5 = new Permission("buildrights.place.planks");			//BlockListener
	public Permission place6 = new Permission("buildrights.place.sapling");			//BlockListener
	public Permission place7 = new Permission("buildrights.place.bedrock");			//BlockListener
	public Permission place8 = new Permission("buildrights.place.water");			//BlockListener
	//public Permission place9 = new Permission("buildrights.place.waterstatic");	//BlockListener (unneeded)
	public Permission place10 = new Permission("buildrights.place.lava");			//BlockListener
	//public Permission place11 = new Permission("buildirghts.place.lavastatic");	//BlockListener (unneeded)
	public Permission place12 = new Permission("buildrights.place.sand");			//BlockListener
	public Permission place13 = new Permission("buildrights.place.gravel");			//BlockListener
	public Permission place14 = new Permission("buildrights.place.goldore");		//BlockListener
	public Permission place15 = new Permission("buildrights.place.ironore");		//BlockListener
	public Permission place16 = new Permission("buildrights.place.coalore");		//BlockListener
	public Permission place17 = new Permission("buildrights.place.log");			//BlockListener
	public Permission place18 = new Permission("buildrights.place.leaves");			//BlockListener
	public Permission place19 = new Permission("buildrights.place.sponge");			//BlockListener
	public Permission place20 = new Permission("buildrights.place.glass");			//BlockListener
	public Permission place21 = new Permission("buildrights.place.lapisore");		//BlockListener
	public Permission place22 = new Permission("buildrights.place.lapisblock");		//BlockListener
	public Permission place23 = new Permission("buildrights.place.dispenser");		//BlockListener
	public Permission place24 = new Permission("buildirghts.place.sandstone");		//BlockListener
	public Permission place25 = new Permission("buildrights.place.noteblock");		//BlockListener
	public Permission place26 = new Permission("buildrights.place.bed");			//BlockListener
	public Permission place27 = new Permission("buildrights.place.poweredrail");	//BlockListener
	public Permission place28 = new Permission("buildrights.place.detectorrail");	//BlockListener
	public Permission place29 = new Permission("buildrights.place.stickypiston");	//BlockListener
	public Permission place30 = new Permission("buildrights.place.cobweb");			//BlockListener
	public Permission place31 = new Permission("buildrights.place.tallgrass");		//BlockListener
	public Permission place32 = new Permission("buildrights.place.deadbush");		//BlockListener
	public Permission place33 = new Permission("buildrights.place.piston");			//BlockListener
	public Permission place34 = new Permission("buildrights.place.pistonhead");		//BlockListener
	public Permission place35 = new Permission("buildrights.place.wool");			//BlockListener
	//public Permission place36 = new Permission("buildrights.place.pistonhead");	//BlockListener (unneeded)
	public Permission place37 = new Permission("buildrights.place.dandelion");		//BlockListener
	public Permission place38 = new Permission("buildrights.place.redflower");		//BlockListener
	public Permission place39 = new Permission("buildrights.place.brownmushroom");	//BlockListener
	public Permission place40 = new Permission("buildrights.place.redmushroom");	//BlockListener
	public Permission place41 = new Permission("buildrights.place.goldblock");		//BlockListener
	public Permission place42 = new Permission("buildrights.place.ironblock");		//BlockListener
	public Permission place43 = new Permission("buildrights.place.doublestep");		//BlockListener
	public Permission place44 = new Permission("buildrights.place.slab");			//BlockListener
	public Permission place45 = new Permission("buildrights.place.brick");			//BlockListener
	
		//break permissions
	public Permission break1 = new Permission("buildrights.break.stone");			//BlockListener
	public Permission break2 = new Permission("buildrights.break.grass");			//BlockListener
	public Permission break3 = new Permission("buildrights.break.dirt");			//BlockListener
	public Permission break4 = new Permission("buildrights.break.cobblestone");		//BlockListener
	public Permission break5 = new Permission("buildrights.break.planks");			//BlockListener
	public Permission break6 = new Permission("buildrights.break.sapling");			//BlockListener
	public Permission break7 = new Permission("buildrights.break.bedrock");			//BlockListener
	public Permission break8 = new Permission("buildrights.break.water");			//BlockListener
	//public Permission break9 = new Permission("buildrights.break.waterstatic");	//BlockListener (unneeded)
	public Permission break10 = new Permission("buildrights.break.lava");			//BlockListener
	//public Permission break11 = new Permission("buildrights.break.lavastatic");	//BlockListener (unneeded)
	public Permission break12 = new Permission("buildrights.break.sand");			//BlockListener
	public Permission break13 = new Permission("buildrights.break.gravel");			//BlockListener
	public Permission break14 = new Permission("buildrights.break.goldore");		//BlockListener
	public Permission break15 = new Permission("buildrights.break.ironore");		//BlockListener
	public Permission break16 = new Permission("buildrights.break.coalore");		//BlockListener
	public Permission break17 = new Permission("buildrights.break.log");			//BlockListener
	public Permission break18 = new Permission("buildrights.break.leaves");			//BlockListener
	public Permission break19 = new Permission("buildrights.break.sponge");			//BlockListener
	public Permission break20 = new Permission("buildrights.break.glass");			//BlockListener
	public Permission break21 = new Permission("buildrights.break.lapisore");		//BlockListener
	public Permission break22 = new Permission("buildrights.break.lapisblock");		//BlockListener
	public Permission break23 = new Permission("buildrights.break.dispenser");		//BlockListener
	public Permission break24 = new Permission("buildrights.break.sandstone");		//BlockListener
	public Permission break25 = new Permission("buildrights.break.noteblock");		//BlockListener
	public Permission break26 = new Permission("buildrights.break.bed");			//BlockListener
	public Permission break27 = new Permission("buildrights.break.poweredrail");	//BlockListener
	public Permission break28 = new Permission("buildrights.break.detectorrail");	//BlockListener
	public Permission break29 = new Permission("buildrights.break.stickypiston");	//BlockListener
	public Permission break30 = new Permission("buildrights.break.cobweb");			//BlockListener
	public Permission break31 = new Permission("buildrights.break.tallgrass");		//BlockListener
	public Permission break32 = new Permission("buildrights.break.deadbush");		//BlockListener
	public Permission break33 = new Permission("buildrights.break.piston");			//BlockListener
	public Permission break34 = new Permission("buildrights.break.pistonhead");		//BlockListener
	public Permission break35 = new Permission("buildrights.break.wool");			//BlockListener
	//public Permission break36 = new Permission("buildrights.break.pistonext");    //is with pistonhead permission
	public Permission break37 = new Permission("buildrights.break.dandelion");		//BlockListener
	public Permission break38 = new Permission("buildrights.break.redflower");		//BlockListener
	public Permission break39 = new Permission("buildrights.break.brownmushroom");	//BlockListener
	public Permission break40 = new Permission("buildrights.break.redmushroom");	//BlockListener
	public Permission break41 = new Permission("buildrights.break.goldblock");		//BlockListener
	public Permission break42 = new Permission("buildrights.break.ironblock");		//BlockListener
	public Permission break43 = new Permission("buildrights.break.doublestep");		//BlockListener
	public Permission break44 = new Permission("buildrights.break.slab");			//BlockListener
	public Permission break45 = new Permission("buildrights.break.brick"); 			//BlockListener
	
	@Override
	public void onEnable() {
		PluginManager pm = getServer().getPluginManager();
		
		//core
		pm.addPermission(brnotify);
		pm.addPermission(brallperms);
		pm.addPermission(breakall);
		pm.addPermission(placeall);
		//place
		pm.addPermission(place1);
		pm.addPermission(place2);
		pm.addPermission(place3);
		pm.addPermission(place4);
		pm.addPermission(place5);
		pm.addPermission(place6);
		pm.addPermission(place7);
		pm.addPermission(place8);
		//pm.addPermission(place9);
		pm.addPermission(place10);
		//pm.addPermission(place11);
		pm.addPermission(place12);
		pm.addPermission(place13);
		pm.addPermission(place14);
		pm.addPermission(place15);
		pm.addPermission(place16);
		pm.addPermission(place17);
		pm.addPermission(place18);
		pm.addPermission(place19);
		pm.addPermission(place20);
		pm.addPermission(place21);
		pm.addPermission(place22);
		pm.addPermission(place23);
		pm.addPermission(place24);
		pm.addPermission(place25);
		pm.addPermission(place26);
		pm.addPermission(place27);
		pm.addPermission(place28);
		pm.addPermission(place29);
		pm.addPermission(place30);
		pm.addPermission(place31);
		pm.addPermission(place32);
		pm.addPermission(place33);
		pm.addPermission(place34);
		pm.addPermission(place35);
		//pm.addPermission(place36);
		pm.addPermission(place37);
		pm.addPermission(place38);
		pm.addPermission(place39);
		pm.addPermission(place40);
		pm.addPermission(place41);
		pm.addPermission(place42);
		pm.addPermission(place43);
		pm.addPermission(place44);
		pm.addPermission(place45);
		//pm.addPermission(place46);
		//pm.addPermission(place47);
		//pm.addPermission(place48);
		//pm.addPermission(place49);
		//pm.addPermission(place50);
		
		//break
		pm.addPermission(break1);
		pm.addPermission(break2);
		pm.addPermission(break3);
		pm.addPermission(break4);
		pm.addPermission(break5);
		pm.addPermission(break6);
		pm.addPermission(break7);
		pm.addPermission(break8);
		//pm.addPermission(break9);
		pm.addPermission(break10);
		//pm.addPermission(break11);
		pm.addPermission(break12);
		pm.addPermission(break13);
		pm.addPermission(break14);
		pm.addPermission(break15);
		pm.addPermission(break16);
		pm.addPermission(break17);
		pm.addPermission(break18);
		pm.addPermission(break19);
		pm.addPermission(break20);
		pm.addPermission(break21);
		pm.addPermission(break22);
		pm.addPermission(break23);
		pm.addPermission(break24);
		pm.addPermission(break25);
		pm.addPermission(break26);
		pm.addPermission(break27);
		pm.addPermission(break28);
		pm.addPermission(break29);
		pm.addPermission(break30);
		pm.addPermission(break31);
		pm.addPermission(break32);
		pm.addPermission(break33);
		pm.addPermission(break34);
		pm.addPermission(break35);
		//pm.addPermission(break36);
		pm.addPermission(break37);
		pm.addPermission(break38);
		pm.addPermission(break39);
		pm.addPermission(break40);
		pm.addPermission(break41);
		pm.addPermission(break42);
		pm.addPermission(break43);
		pm.addPermission(break44);
		pm.addPermission(break45);
		//pm.addPermission(break46);
		//pm.addPermission(break47);
		//pm.addPermission(break48);
		//pm.addPermission(break49);
		//pm.addPermission(break50);
		//Worldedit
		pm.addPermission(setair);
		pm.addPermission(worldeditall);
		
		new BlockListener(this);
		new WorldeditListener(this);
		new BlockListenerUtilBuild();
		new BlockListenerUtilBreak();
		new BlockListenerUtilBreak1();
		new BlockListenerUtilBuild1();
		new ChatUtilBreak();
		new ChatUtilBuild();
		new ChatUtilBreakRep();
		new ChatUtilBuildRep();
	}
	@Override
	public void onDisable() {
		
	}

}
