package kr.mohi.rpgcore;

import java.util.ArrayList;

import cn.nukkit.Player;
import kr.mohi.rpgcore.jobs.Job;
import kr.mohi.rpgcore.skill.Skill;

public class RPGPlayer {
	private Player player;
	private Job job;
	ArrayList<Skill> skills;
	
	public RPGPlayer(Player player, Job job) {
		this.player = player;
		this.job = job;
	}
}
