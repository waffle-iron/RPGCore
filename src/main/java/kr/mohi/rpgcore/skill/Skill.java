package kr.mohi.rpgcore.skill;

import java.util.Map;

import cn.nukkit.Server;
import cn.nukkit.event.Event;
import kr.mohi.rpgcore.RPGCore;
import kr.mohi.rpgcore.RPGPlayer;
import kr.mohi.rpgcore.database.DataBase;

public class Skill implements ISkill {
	/**
	 * Every skill extends this.
	 */
	private Integer level = new Integer(0); // Skill level 0 means
											// disabled-skill. You can't use
											// this skill if the level is 0.
	@SuppressWarnings("rawtypes")
	public static Map<String, Class> skills;
	protected Integer limitLevel = new Integer(5);
	protected String name = null;
	protected Integer type = Skill.DEFUALT;
	protected RPGPlayer player;

	public static final int DEFUALT = -1; // This isn't a skill.
											// You can use this type for sub
											// plugin.
	public static final int ATTACK = 0; // Gives someone damage
	public static final int HEAL = 1; // Heal someone
	public static final int UTIL = 2; // Skill about utility
	public static final int ENHANCE = 3; // Enhances someone's ability
	public static final int PASSIVE = 4; // Passive skill

	public Skill(RPGPlayer player) {
		this.player = player;
	}

	public String getName() {
		return this.name;
	}

	public Server getServer() {
		return Server.getInstance();
	}

	public RPGPlayer getPlayer() {
		return this.player;
	}

	public Integer getLevelLimit() {
		return this.limitLevel;
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(int n) {
		if (n > this.limitLevel)
			return;
		this.level = n;
	}

	public void addLevel() {
		if (this.limitLevel < this.level) {
			this.level++;
			DataBase.message(this.player.getPlayer(), "");
		} else {
			DataBase.message(this.player.getPlayer(), "");
		}
	}

	public Integer getType() {
		return this.type;
	}

	public static void registerSkill(Skill skill) {
		RPGCore.addSkill(skill);
		Skill.skills.put(skill.getName(), skill.getClass());
	}

	public static void callEvent(Event e) {

	}

	/**
	 * Handles Events
	 * 
	 * @param {@code Event} event
	 */
	public void onEvent(Event event) {
	}
}
