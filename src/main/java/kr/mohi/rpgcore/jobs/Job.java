package kr.mohi.rpgcore.jobs;

import java.util.Set;

import cn.nukkit.Player;
import kr.mohi.rpgcore.skill.Skill;

public interface Job {
	
	/**
	 * Returns name of the Job
	 * @return 
	 */
	String getName();
	
	Player getPlayer();
	
	Set<Skill> getSkill();
}
