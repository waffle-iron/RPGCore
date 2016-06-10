package kr.mohi.rpgcore.skill;

import kr.mohi.rpgcore.RPGPlayer;

public abstract class SkillEnhance extends Skill {
	
	public SkillEnhance(RPGPlayer player, String name, Integer level, Integer limitLevel) {
		super(player);
		this.name = name;
		this.level = level;
		this.limitLevel = limitLevel;
		this.type = Skill.ATTACK;
	}
}
