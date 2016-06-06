package kr.mohi.rpgcore.database;

import java.util.HashSet;
import java.util.Set;

import cn.nukkit.Player;
import cn.nukkit.command.CommandSender;
import cn.nukkit.utils.TextFormat;
import hmhmmhm.ParfaitAuth.Account;
import hmhmmhm.ParfaitAuth.ParfaitAuth;
import kr.mohi.rpgcore.RPGCorePlugin;
import kr.mohi.rpgcore.RPGPlayer;
import kr.mohi.rpgcore.skill.Skill;

public class DataBase {
	RPGCorePlugin plugin;
	Set<RPGPlayer> players = new HashSet<RPGPlayer>();
	Set<Class<Skill>> skills = new HashSet<Class<Skill>>();

	public DataBase(RPGCorePlugin plugin) {
		this.plugin = plugin;
	}
	public void loadAll() {
		
	}
	
	public static Account getPlayerData(Player player) {
		return DataBase.getPlayerData(player.getName());
	}
	
	public static Account getPlayerData(String player) {
		return ParfaitAuth.getAccountByNickName(player);
	}
	
	public Set<RPGPlayer> getOnlinePlayers() {
		return this.players;
	}
	
	public void addOnlinePlayers(RPGPlayer player) {
		this.players.add(player);
	}

	/**
	 * 서버의 스킬 반환
	 * @return
	 */
	public Set<Class<Skill>> getEverySkills() {
		return this.skills;
	}
	
	public void addSkill(Class<Skill> skill) {
		this.skills.add(skill);
	}
	
	public static void alert(CommandSender player, String message) {
		player.sendMessage(TextFormat.RED + "[RPG]" + " " + message);
	}

	/**
	 *
	 * @param player
	 * @param message
	 */
	public static void message(CommandSender player, String message) {
		player.sendMessage(TextFormat.BLUE + "[RPG]" + " " + message);
	}

	/**
	 * 
	 * @param player
	 * @param message
	 */
	public static void plainMessage(CommandSender player, String message) {
		player.sendMessage(message);
	}
}
