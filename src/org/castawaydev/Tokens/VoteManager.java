package org.castawaydev.Tokens;

import java.util.logging.Logger;

import lib.PatPeter.SQLibrary.MySQL;

public class VoteManager {
	private MySQL sql;
           
    public VoteManager(){
    	
    	sql = new MySQL(Logger.getLogger("Minecraft"), "[MyPlugin] ", "localhost", "3306", "myplugin", "minecraft", "password1");
    	sql.open();
    	if (checkConnection()){
        	Tokens.log("SQL Datatbase connected");
    	}
    }
    
    public boolean checkConnection(){
    	if (sql.checkConnection()){
    		return true;
    	}
    	else{
    		return false;
    	}   
    }
    
    /**
     * Set the value of tokens for a selected player name.
     * 
     * @return
     */
    public boolean setPlayerTokens(){
    	
    	return true;
    }
    
    public int getPlayerTokens(){
		int tokens = 0;
		
    	
    	return tokens;
    	
    }
}
