package kr.mohi.rpgcore.database;

import cn.nukkit.command.CommandSender;
import cn.nukkit.utils.TextFormat;
import kr.mohi.rpgcore.RPGCorePlugin;

public class DataBase {
	RPGCorePlugin plugin;

	public DataBase(RPGCorePlugin plugin) {
		this.plugin = plugin;
	}

	public static void alert(CommandSender player, String message) {
		player.sendMessage(TextFormat.RED + "[MohiMine]" + " " + message);
	}

	/**
	 *
	 * @param player
	 * @param message
	 */
	public static void message(CommandSender player, String message) {
		player.sendMessage(TextFormat.BLUE + "[MohiMine]" + " " + message);
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
