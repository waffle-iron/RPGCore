package kr.mohi.rpgcore.skill;

import cn.nukkit.Server;
import kr.mohi.rpgcore.RPGPlayer;

public interface ISkill {
	
	/**
	 * Returns this skill name.
	 * 
	 * @return This skill name.
	 */
	String getName();
	
	/**
	 * Returns level limit of this skill.
	 * 
	 * @return Level limit of this skill.
	 */
	Integer getLevelLimit();
	
	/**
	 * Returns enhancement of this skill.
	 * 
	 * @return Enhancement of this skill.
	 */
	Integer getLevel();
	
	/**
	 * Returns user of this skill.
	 * 
	 * @return {@code Player} who has this skill.
	 */
	RPGPlayer getPlayer();
	
	/**
	 * Returns server
	 * @return {@code Server}
	 */
	Server getServer();
	
}
