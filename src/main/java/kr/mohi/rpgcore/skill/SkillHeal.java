package kr.mohi.rpgcore.skill;

import kr.mohi.rpgcore.RPGPlayer;

public abstract class SkillHeal extends Skill {
	/**
	 * Healing skills extends this.
	 */

	public SkillHeal(RPGPlayer player) {
		super(player);
		this.type = Skill.HEAL;
	}
}