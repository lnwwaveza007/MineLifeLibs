package lnwwaveza008.minelifelibs;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class MineLifeLibs extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getConsoleSender().sendMessage("MineLifeLibs is now enabled");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getConsoleSender().sendMessage("MineLifeLibs is now disabled");
    }
}
