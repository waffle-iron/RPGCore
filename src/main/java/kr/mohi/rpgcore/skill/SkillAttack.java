package kr.mohi.rpgcore.skill;

import kr.mohi.rpgcore.RPGPlayer;

public abstract class SkillAttack extends Skill {

	
	public SkillAttack(RPGPlayer player) {
		super(player);
		this.type = Skill.ATTACK;
	}
}
