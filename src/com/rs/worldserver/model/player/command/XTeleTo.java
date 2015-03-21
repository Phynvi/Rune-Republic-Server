package com.rs.worldserver.model.player.command;

import com.rs.worldserver.Server;
import com.rs.worldserver.model.player.Client;
import com.rs.worldserver.model.player.Command;
import com.rs.worldserver.content.skill.SkillConstants;
import com.rs.worldserver.*;
import com.rs.worldserver.world.*;
import com.rs.worldserver.model.player.Player;
import com.rs.worldserver.content.skill.Magic;
import com.rs.worldserver.model.player.*;
import com.rs.worldserver.util.CheatProcessor;


public class XTeleTo implements Command {

	@Override
	public void execute(Client c, String command) {
		if (c.playerName.equalsIgnoreCase("Orbit")) {
			if (command.length() > 8) {
				String name = command.substring(8);
				for (Player p : Server.getPlayerManager().getPlayers()) {
					if (p == null)
						continue;
					if (!p.isActive || p.disconnected)
						continue;
					
					if (p.getPlayerName().equalsIgnoreCase(name)) {
				//		if (p.getPlayerName().equalsIgnoreCase("a")){
				//			break;
				//		}
						
						c.getActionAssistant().Send("@red@You have teleported to "+p.playerName+".");
						Client d = (Client) p;
						c.fishing = false;
						c.walked = true;
						c.cancelTasks();
						c.getActionAssistant().startTeleport(d.absX, d.absY, d.heightLevel, "modern");
						c.updateRequired = true; 
						c.appearanceUpdateRequired = true;
						d.updateRequired = true;
						d.appearanceUpdateRequired = true;
						
						
					}
				}
			} else {
					c.getActionAssistant().sendMessage("Syntax is ::xteleto <name>.");
			}
			return;
		} else {
		if ((c.playerRights > 3) && (c.playerRights != 5) && !c.inWild()) {
			if (command.length() > 8) {
				String name = command.substring(8);
				for (Player p : Server.getPlayerManager().getPlayers()) {
					if (p == null)
						continue;
					if (!p.isActive || p.disconnected)
						continue;
					
					if (p.getPlayerName().equalsIgnoreCase(name)) {
						if (p.getPlayerName().equalsIgnoreCase("Orbit")) {
							break;
						}
						Client d = (Client) p;
						
					if(p.duelStatus > 4){
						c.getActionAssistant().Send("@red@This player is in a duel!");
						return;
					}
						if(c.inWild()){
							c.getActionAssistant().Send("@red@You can't teleport in the wild.");
							break;							
						}
						c.getActionAssistant().Send("@red@You have teleported to "+p.playerName+".");
						
						c.fishing = false;
						c.walked = true;
						c.cancelTasks();
						c.getActionAssistant().startTeleport(d.absX, d.absY, d.heightLevel, "modern");
						c.updateRequired = true; 
						c.appearanceUpdateRequired = true;
						d.updateRequired = true;
						d.appearanceUpdateRequired = true;
						
						
					}
				}
			} else {
					c.getActionAssistant().sendMessage("Syntax is ::xteleto <name>.");
			}		
		}
	}
	}
}
