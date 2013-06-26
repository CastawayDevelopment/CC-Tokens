package org.castawaydev.Tokens;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

import lib.PatPeter.SQLibrary.MySQL;

public class VoteManager {
	private MySQL sql;
           
    public VoteManager(){
    	
    	sql = new MySQL(Logger.getLogger("Minecraft"), "Tokens", "localhost", "3306", "tokens", "root", "password");
    	sql.open();
    	if (checkConnection()){
        	Tokens.log("SQL Datatbase connected");
    	}
    	if (!sql.checkTable("Tokens"))
    		sql.createTable("Tokens");
    	
    	
    }
    
    /**
     * Checks SQL connection.
     * @return
     */
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
     * @throws SQLException 
     */
    public boolean setPlayerTokens(){
    	try {
			sql.query("");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return true;
    }
    
    public int getPlayerTokens(){
		int tokens = 0;
		
    	
    	return tokens;
    	
    }
}
