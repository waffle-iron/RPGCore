package kr.mohi.rpgcore;

import cn.nukkit.plugin.PluginBase;
import kr.mohi.rpgcore.listener.EventListener;

public class RPGCorePlugin extends PluginBase {

	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(new EventListener(this), this);
	}
}
