package blugga.MagicLamp;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.Material;


public class MagicLampEvent implements Listener {
	
	public MagicLamp plugin;
	
	public MagicLampEvent(MagicLamp plugin)
	{
		this.plugin = plugin;
	}
	
	
	@EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
	public void onPlayerInteract(PlayerInteractEvent e)
	{
		Player player = e.getPlayer();
		
		if(e.getAction() == Action.RIGHT_CLICK_BLOCK
		 
			&& player.getItemInHand() != null
			&& player.getItemInHand().getType() == Material.FLINT_AND_STEEL)
			{
			
			
			
	
			 
		    	Block block = e.getClickedBlock();
		    	
		    	if (block.getType() == Material.REDSTONE_LAMP_OFF)
		    	{
		    		block.setType(Material.REDSTONE_LAMP_ON);
		    	}
		    	
		    	else if (block.getType() == Material.REDSTONE_LAMP_ON)
		    	{
		    		block.setType(Material.REDSTONE_LAMP_OFF);
		    	}
		    	
		    	e.setCancelled(true);
		    	
		     }
	}
}
		     
			
			
			
	
		
		
			
			
			
		     
		     
		    	
		   
		    	
		    	
	
			        
			 
			
		
			
							
				
					
			


	
		
		
			
				
					
	
					
						
					
						
							
				
			
				
		
		
		
			
		
	  


