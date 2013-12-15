package blugga.MagicLamp;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class MagicLamp extends JavaPlugin {

	public static Logger log = Logger.getLogger("Minecraft");
	
	public void onEnable()
	{
		PluginManager pm = this.getServer().getPluginManager();
		
		pm.registerEvents(new MagicLampEvent(this), this);
		log.info("MagicLamp Actif");
	}
	
	public void onDisable()
	{
		log.info("MagicLamp inactif");
	}
}
	


   
