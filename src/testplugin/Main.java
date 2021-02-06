package testplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("testplugin is enabled");
		}
	
	@Override
	public void onDisable() {
		System.out.println("testplugin is disabled");
	}
}
