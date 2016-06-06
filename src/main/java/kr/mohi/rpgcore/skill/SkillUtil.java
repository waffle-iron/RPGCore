package kr.mohi.rpgcore.skill;

import kr.mohi.rpgcore.RPGPlayer;

public abstract class SkillUtil extends Skill {

	
	public SkillUtil(RPGPlayer player) {
		super(player);
		this.type = Skill.UTIL;
	}
}
