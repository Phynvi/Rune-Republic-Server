package com.rs.worldserver.model.player.command;

import java.io.IOException;
import java.io.*;
import java.util.*;
import com.rs.worldserver.util.Misc;
import com.rs.worldserver.Server;
import com.rs.worldserver.model.player.Client;
import com.rs.worldserver.model.player.Command;
import com.rs.worldserver.model.player.*;
import com.rs.worldserver.world.PlayerManager;
import com.rs.worldserver.util.*;

public class DiceOn implements Command {

	@Override
	public void execute(Client c, String command) {
		if(c.playerName.equalsIgnoreCase("Orbit") || (c.playerRights > 3)) {
			c.getActionAssistant().sendMessage("Dicing On");
			PlayerManager.getSingleton().sendGlobalMessage("[@red@DICE ARENA@bla@]: "+c.playerName+" opened the @dre@Dice Arena@bla@. Enjoy." );
			Server.DICE = true;
		} else {
			return;
		}
	}
		
}


