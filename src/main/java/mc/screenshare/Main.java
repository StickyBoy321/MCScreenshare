package mc.screenshare;

import mc.screenshare.commands.DrawCommand;
import mc.screenshare.commands.PressCommand;
import mc.screenshare.commands.TypeCommand;
import mc.screenshare.tabcomplete.PressTabComplete;
import org.bukkit.Bukkit;
import org.bukkit.configuration.Configuration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("[MCScreenshare] Initialized");

        PluginManager pm = Bukkit.getServer().getPluginManager();
        pm.registerEvents(new DrawCommand(), this);
        this.getCommand("draw").setExecutor(new DrawCommand());
        this.getCommand("type").setExecutor(new TypeCommand());
        this.getCommand("press").setExecutor(new PressCommand());
        this.getCommand("press").setTabCompleter(new PressTabComplete());
        getConfig().options().copyDefaults();
        saveDefaultConfig();
    }

    public static Configuration getConfigFile() {
        return Bukkit.getPluginManager().getPlugin("MCScreenshare").getConfig();
    }


}
