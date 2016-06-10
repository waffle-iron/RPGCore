package kr.mohi.rpgcore.skill;

import kr.mohi.rpgcore.RPGPlayer;

public abstract class SkillHeal extends Skill {

	public SkillHeal(RPGPlayer player, String name, Integer level, Integer limitLevel) {
		super(player);
		this.name = name;
		this.level = level;
		this.limitLevel = limitLevel;
		this.type = Skill.HEAL;
	}
}