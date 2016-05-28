package kr.mohi.rpgcore.skill;

import cn.nukkit.Player;
import kr.mohi.rpgcore.jobs.Job;

public abstract class SkillHeal extends Skill {
	/**
	 * Healing skills extends this.
	 */
	public final Integer affiliation = Skill.HEAL;

	public SkillHeal(Player player, Job job) {
		super(player, job);
	}

	@Override
	public Integer getAffiliation() {
		return this.affiliation;
	}

	public abstract Integer getIntensity();
}
