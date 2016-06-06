package kr.mohi.rpgcore.listener;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.entity.EntityDamageEvent;
import cn.nukkit.event.player.PlayerInteractEvent;
import cn.nukkit.event.player.PlayerJoinEvent;
import kr.mohi.rpgcore.RPGCore;
import kr.mohi.rpgcore.RPGCorePlugin;
import kr.mohi.rpgcore.RPGPlayer;
import kr.mohi.rpgcore.skill.Skill;
import kr.mohi.rpgcore.stat.PlayerStat;

public class EventListener implements Listener {
	RPGCorePlugin plugin;

	public EventListener(RPGCorePlugin plugin) {
		this.plugin = plugin;
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
}
