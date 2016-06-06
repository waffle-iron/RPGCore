package kr.mohi.rpgcore;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import cn.nukkit.Player;
import hmhmmhm.ParfaitAuth.Account;
import kr.mohi.rpgcore.database.DataBase;
import kr.mohi.rpgcore.skill.Skill;
import kr.mohi.rpgcore.stat.PlayerStat;

public class RPGCore {
	public static DataBase getDataBase() {
		return RPGCorePlugin.getDataBase();
	}

	public static void addSkill(Skill skill) {

	}

	public static Map<String, Skill> getSkills(RPGPlayer player) {
		return player.getSkills();
	}

	public static Set<RPGPlayer> getOnlinePlayers() {
		return RPGCore.getDataBase().getOnlinePlayers();
	}

	@SuppressWarnings("unchecked")
	public static PlayerStat getPlayerStat(Player player) {
		Account data = DataBase.getPlayerData(player);
		LinkedHashMap<String, Object> additionalData = data.getAdditionalData();
		PlayerStat stat = new PlayerStat();
		if (!data.getAdditionalData().containsKey("RPGPlayer")) {
			stat.setAP(0);
			stat.setDEX(0);
			stat.setINT(0);
			stat.setLUK(0);
			stat.setMaxHP(20);
			stat.setMaxMP(100);
			stat.setMP(100);
			stat.setSP(0);
			stat.setSTR(0);
			stat.setExp(0);
			data.getAdditionalData().put("RPGPlayer", new LinkedHashMap<Integer, Object>());
			((LinkedHashMap<Integer, Object>) additionalData.get("RPGPlayer")).put(PlayerStat.AP, stat.getAP());
			((LinkedHashMap<Integer, Object>) additionalData.get("RPGPlayer")).put(PlayerStat.DEX, stat.getDEX());
			((LinkedHashMap<Integer, Object>) additionalData.get("RPGPlayer")).put(PlayerStat.EXP, stat.getExp());
			((LinkedHashMap<Integer, Object>) additionalData.get("RPGPlayer")).put(PlayerStat.INT, stat.getINT());
			((LinkedHashMap<Integer, Object>) additionalData.get("RPGPlayer")).put(PlayerStat.LUK, stat.getLUK());
			((LinkedHashMap<Integer, Object>) additionalData.get("RPGPlayer")).put(PlayerStat.MAX_HP, stat.getMaxHP());
			((LinkedHashMap<Integer, Object>) additionalData.get("RPGPlayer")).put(PlayerStat.MAX_MP, stat.getMaxMP());
			((LinkedHashMap<Integer, Object>) additionalData.get("RPGPlayer")).put(PlayerStat.STR, stat.getSTR());
			((LinkedHashMap<Integer, Object>) additionalData.get("RPGPlayer")).put(PlayerStat.MP, stat.getMP());
			((LinkedHashMap<Integer, Object>) additionalData.get("RPGPlayer")).put(PlayerStat.HP, 20);
			data.setModified();
		} else {
			stat.setAP((Integer) additionalData.get(PlayerStat.AP));
			stat.setDEX((Integer) additionalData.get(PlayerStat.DEX));
			stat.setExp((Integer) additionalData.get(PlayerStat.EXP));
			stat.setINT((Integer) additionalData.get(PlayerStat.INT));
			stat.setLUK((Integer) additionalData.get(PlayerStat.LUK));
			stat.setMaxHP((Integer) additionalData.get(PlayerStat.MAX_HP));
			stat.setMaxMP((Integer) additionalData.get(PlayerStat.MAX_MP));
			stat.setMP((Integer) additionalData.get(PlayerStat.MP));
			stat.setSP((Integer) additionalData.get(PlayerStat.SP));
			stat.setSTR((Integer) additionalData.get(PlayerStat.STR));
		}
		return stat;
	}
}
