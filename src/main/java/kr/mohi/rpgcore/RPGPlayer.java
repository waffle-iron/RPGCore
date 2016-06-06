package kr.mohi.rpgcore;

import java.util.Map;

import cn.nukkit.Player;
import cn.nukkit.entity.Attribute;
import cn.nukkit.network.protocol.UpdateAttributesPacket;
import hmhmmhm.ParfaitAuth.Account;
import kr.mohi.rpgcore.skill.Skill;
import kr.mohi.rpgcore.stat.PlayerStat;

public class RPGPlayer {
	private Player player;
	Map<String, Skill> skills;
	private int health;
	private PlayerStat stat;
	private Account account;

	public RPGPlayer(Player player, PlayerStat stat) {
		this.player = player;
		this.stat = stat;
	}

	public PlayerStat getStat() {
		return this.stat;
	}

	public Account getData() {
		return this.account;
	}

	public int getHealth() {
		return this.health;
	}

	public void setHealth(int n) {
		if (n > stat.getMaxHP()) {
			n = stat.getMaxHP();
		}
		this.player.setHealth(n);
	}

	public void setMaxHP(int n) {
		this.stat.setMaxHP(n);
		this.player.setMaxHealth(n);
	}

	public Player getPlayer() {
		return this.player;
	}

	public String getName() {
		return this.getPlayer().getName();
	}

	public Map<String, Skill> getSkills() {
		return this.skills;
	}

	public void updateAttribute(Attribute ...attributes) {
		UpdateAttributesPacket pk = new UpdateAttributesPacket();
		pk.entityId = 0;
		pk.entries = attributes;
		this.player.dataPacket(pk);
	}
	
	public Attribute expAttribute() {
		Attribute exp = Attribute.getAttributeByName("player.experience");
		exp.setValue(this.stat.getExpBarPercent());
		return exp;
	}
	
	public Attribute levelAttribute() {
		Attribute level = Attribute.getAttributeByName("player.level");
		level.setValue(this.stat.getLevel());
		return level;
	}

	public void setExpBarPercent(float expBarPercent) {
		this.stat.setExpBarPercent(expBarPercent);
	}
}
