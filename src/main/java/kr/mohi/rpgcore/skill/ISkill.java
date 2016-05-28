package kr.mohi.rpgcore.skill;

import cn.nukkit.Player;
import cn.nukkit.Server;

public interface ISkill {
	
	/**
	 * Returns this skill name.
	 * 
	 * @return This skill name.
	 */
	String getName();
	
	/**
	 * 
	 * @return Instance of this skill.
	 */
	Skill getSkill();
	
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
	Player getPlayer();
	
	/**
	 * Returns server
	 * @return {@code Server}
	 */
	Server getServer();
	
}
