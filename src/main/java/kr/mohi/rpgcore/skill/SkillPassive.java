package kr.mohi.rpgcore.skill;

import kr.mohi.rpgcore.RPGPlayer;

public abstract class SkillPassive extends Skill {

	public SkillPassive(RPGPlayer player) {
		super(player);
		this.type = Skill.PASSIVE;
	}
}
