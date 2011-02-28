package com.bukkit.dwylde.MonsterDefense;

import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.Material;
import org.bukkit.event.block.BlockCanBuildEvent;
import org.bukkit.event.block.BlockListener;
import org.bukkit.event.block.BlockPhysicsEvent;

/**
 * MonsterDefense block listener
 * @author dwylde
 */
public class MonsterDefenseBlockListener extends BlockListener {
    private final MonsterDefense plugin;

    public MonsterDefenseBlockListener(final MonsterDefense plugin) {
        this.plugin = plugin;
    }

    //put all Block related code here
}
