package kr.mohi.rpgcore.skill;

import kr.mohi.rpgcore.RPGPlayer;

public abstract class SkillEnhance extends Skill {

	
	public SkillEnhance(RPGPlayer player) {
		super(player);
		this.type = Skill.ATTACK;
	}
}
