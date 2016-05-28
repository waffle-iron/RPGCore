package kr.mohi.rpgcore.event;

import cn.nukkit.Player;
import cn.nukkit.event.Cancellable;
import cn.nukkit.event.Event;
import kr.mohi.rpgcore.skill.Skill;

public class SkillEvent extends Event implements Cancellable {
	public SkillEvent(Skill skill, Player player) {
		
	}
}
