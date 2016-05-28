package kr.mohi.rpgcore.skill;

import cn.nukkit.Player;
import kr.mohi.rpgcore.jobs.Job;

public abstract class SkillAttack extends Skill {
	private Integer intensity;
	
	public SkillAttack(Player player, Job job, Integer intensity) {
		super(player, job);
		this.intensity = intensity;
	}

	@Override
	public Integer getIntensity() {
		return this.intensity;
	}

}
