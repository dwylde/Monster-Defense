package com.bukkit.dwylde.MonsterDefense;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerMoveEvent;

/**
 * Handle events for all Player related events
 * @author dwylde
 */
public class MonsterDefensePlayerListener extends PlayerListener {
    private final MonsterDefense plugin;

    public MonsterDefensePlayerListener(MonsterDefense instance) {
        plugin = instance;
    }

    //Insert Player related code here
}

