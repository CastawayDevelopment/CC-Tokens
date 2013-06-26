package org.castawaydev.Tokens;

import java.util.logging.Level;
import java.util.logging.Logger;

import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.permission.Permission;

import org.bukkit.Server;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Tokens extends JavaPlugin{
	
	/**
	 * Access Permissions via Vault
	 */
	public static Permission permission = null;

	/**
	 * Access Economy via Vault
	 */
	public static Economy economy = null;
	
	/**
	 * Active plugin 
	 */
	public static Tokens active = null;
	
	/**
	 * Loggers
	 * 
	 * @param msg
	 */
	public static void log(String msg) {
		log(Level.INFO, msg);
	}
	public static void log(Level level, String msg) {
		Logger.getLogger("Tokens").log(level, "[Tokens] " + msg);
	}
	
	public void onEnable()
	{
		Config config = new Config();
		
		if (!getDataFolder().exists()){
			log("Made config folder please modify mysql");
			getDataFolder().mkdirs();
		}
		else{
			Tokens.active = this;
			
			//Get mysql file
			
			//Start listener
			VoteCatcher vc = new VoteCatcher();
			
		}
	}
 
	public void onDisable()
	{
	   
	}
}
