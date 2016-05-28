package kr.mohi.rpgcore.skill;

import cn.nukkit.Player;
import kr.mohi.rpgcore.jobs.Job;

public abstract class SkillPasive extends Skill {

	public SkillPasive(Player player, Job job) {
		super(player, job);
	}
}
