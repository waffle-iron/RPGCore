package kr.mohi.rpgcore.skill;

import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.event.player.PlayerInteractEvent;
import kr.mohi.rpgcore.database.DataBase;
import kr.mohi.rpgcore.jobs.Job;

public abstract class Skill implements ISkill {
	/**
	 * Every skill extends this.
	 */
	public Integer level = new Integer(0);
	public Integer limitLevel = new Integer(1);
	public final String name = null;
	public final Integer affiliation = Skill.DEFAULT;
	public Player player;
	public Job job;

	public static final int ATTACK = 0;
	public static final int HEAL = 1;
	public static final int UTIL = 2;
	public static final int ENHANCE = 3;
	public static final int DEFAULT = 4;

	public Skill(Player player, Job job) {
		this.player = player;
		this.job = job;
	}

	public String getName() {
		return this.name;
	}
	
	public Server getServer() {
		return Server.getInstance();
	}

	public Player getPlayer() {
		return this.player;
	}

	public Skill getSkill() {
		return this;
	}

	public Integer getLevelLimit() {
		return this.limitLevel;
	}

	public Integer getLevel() {
		return this.level;
	}

	public Integer getAffiliation() {
		return this.affiliation;
	}
	
	/**
	 * USE SKILL!!
	 */
	public abstract void execute(); //TODO SkillResponse
	
	/**
	 * Handles PlayerInteractEvent
	 * @param {{@code PlayerInteractEvent} event
	 */
	public abstract void onTouch(PlayerInteractEvent event);
	
	public abstract Integer getIntensity();

	public void addLevel() {
		if (this.limitLevel < this.level) {
			this.level++;
			DataBase.message(this.player, "");
		} else {
			DataBase.message(this.player, "");
		}
	}
}
