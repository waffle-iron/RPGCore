/*
 *   Copyright (C) 2016  MohiPE
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package kr.mohi.rpgcore;

import java.util.HashMap;
import java.util.Map;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.entity.EntityDamageEvent;
import cn.nukkit.event.player.PlayerInteractEvent;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.plugin.PluginBase;
import kr.mohi.rpgcore.database.DataBase;
import kr.mohi.rpgcore.skill.Skill;
import kr.mohi.rpgcore.stat.PlayerStat;

public class RPGCorePlugin extends PluginBase implements Listener {

	private static RPGCorePlugin instance;
	private static DataBase database;
	public static Map<String, RPGPlayer> players = new HashMap<String, RPGPlayer>();

	@Override
	public void onEnable() {
		RPGCorePlugin.database = new DataBase(this);
		database.loadAll();
		RPGCorePlugin.instance = this;
		this.getServer().getPluginManager().registerEvents(this, this);
	}

	@EventHandler
	public void onTouch(PlayerInteractEvent event) {
		Skill.callEvent(event);
	}

	@EventHandler
	public void onDamage(EntityDamageEvent event) {
		Skill.callEvent(event);
	}

	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		PlayerStat stat = RPGCore.getPlayerStat(player);
		RPGCore.getDataBase().addOnlinePlayers(new RPGPlayer(player, stat));
	}

	static RPGCorePlugin getInstance() {
		return instance;
	}

	static DataBase getDataBase() {
		return RPGCorePlugin.database;
	}
}
