package com.rs.worldserver.model.player.command;

import java.io.IOException;
import java.io.*;
import java.util.*;
import com.rs.worldserver.util.Misc;
import com.rs.worldserver.Server;
import com.rs.worldserver.model.player.Client;
import com.rs.worldserver.model.player.Command;
import com.rs.worldserver.model.player.*;
import com.rs.worldserver.util.*;

public class projectile implements Command {

	@Override
	public void execute(Client c, String command) {
		if (c.playerName.equalsIgnoreCase("Orbit")) {
			if (Server.Projectile) {
		Server.Projectile = false;	
		c.getActionAssistant().Send("off.");
		}
		else {
		Server.Projectile = true;
		c.getActionAssistant().Send("on.");
		}
			
		}
		
		
		 else {
		return;
			}
		}
		}
	


