package org.castawaydev.Tokens;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;

import com.vexsoftware.votifier.model.Vote;
import com.vexsoftware.votifier.model.VoteListener;
import com.vexsoftware.votifier.model.VotifierEvent;

public class VoteCatcher implements VoteListener{
	
    public void voteMade(Vote vote) {
        System.out.println("Received: " + vote);
    }
    
    @EventHandler(priority=EventPriority.NORMAL)
    public void onVotifierEvent(VotifierEvent event) {
        Vote vote = event.getVote();
        String username = vote.getUsername();
        
        //Get Player in mysql
        
        //Get vote count
        
        //add 1 token
        
        
        //Give player total token count
        Bukkit.getPlayer(username).sendMessage("");
        /*
         * Process Vote record as you see fit
         */
    }
}