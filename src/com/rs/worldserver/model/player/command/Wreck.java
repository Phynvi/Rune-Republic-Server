package com.rs.worldserver.model.player.command;

import com.rs.worldserver.Server;
import com.rs.worldserver.model.player.Client;
import com.rs.worldserver.model.player.Command;
import com.rs.worldserver.content.skill.SkillConstants;
import com.rs.worldserver.content.skill.Magic;
import com.rs.worldserver.events.Event;
import com.rs.worldserver.world.PublicEvent;
import com.rs.worldserver.events.EventContainer;
import com.rs.worldserver.events.EventManager;
import com.rs.worldserver.Config;

public class Wreck implements Command {

	@Override
	public void execute(Client c, String command) {
	if (c.playerRights >= 3) {
	String playerCommand = c.getInStream().readString();
	//Server.PublicEvent().execute(c, command);
}
}
}