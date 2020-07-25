package mc.screenshare;

import mc.screenshare.commands.DrawCommand;
import mc.screenshare.commands.TestCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("[MCScreenshare] Initialized");
        /* //command listerners etc skidded from util
        PluginManager pm = Bukkit.getServer().getPluginManager();
        pm.registerEvents(new PlayerChat(), this);
        pm.registerEvents(new PlayerCommandPreprocess(), this);
        pm.registerEvents(new SignChange(), this);
        pm.registerEvents(new PreLogin(), this);
        pm.registerEvents(new ServerPing(), this);*/

        this.getCommand("test").setExecutor(new TestCommand());
        this.getCommand("draw").setExecutor(new DrawCommand());
    }


}