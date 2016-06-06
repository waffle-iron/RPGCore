package kr.mohi.rpgcore;

import cn.nukkit.plugin.PluginBase;
import kr.mohi.rpgcore.database.DataBase;
import kr.mohi.rpgcore.listener.EventListener;

public class RPGCorePlugin extends PluginBase {
	
	private static RPGCorePlugin instance;
	private static DataBase database;
	
	@Override
	public void onEnable() {
		RPGCorePlugin.database = new DataBase(this);
		database.loadAll();
		RPGCorePlugin.instance = this;
		this.getServer().getPluginManager().registerEvents(new EventListener(this), this);
	}
	
	static RPGCorePlugin getInstance() {
		return instance;
	}
	
	static DataBase getDataBase() {
		return RPGCorePlugin.database;
	}
}
