package me.IronCrystal.HouseBuilder;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;


public class HouseBuilder extends JavaPlugin {
	public final Logger logger = Logger.getLogger("Minecraft");

	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " is now disabled!");
		
	}

	@Override
	public void onEnable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " version " + pdfFile.getVersion() + " is enabled.");
		
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	{
		Player player = (Player) sender;
		
		Location blockLocation = player.getLocation();
		double y = blockLocation.getBlockY();
		double x = blockLocation.getBlockX();
		double z = blockLocation.getBlockZ();
		x = x + 1;
		
		World currentWorld = player.getWorld();
		if (sender instanceof Player)
		{
		if(cmd.getName().equalsIgnoreCase("woodhouse"))
		{
			if (player.hasPermission("HouseBuilder.whouse"))
			{
			boolean roof = true;
			boolean brickUp = true;
			
			while(brickUp == true)
			{
				int blockUp = 1;
				int blockUp2 = 1;
			while(blockUp <= 2)
			{
				int blockx1 = 1;
				int blockx2 = 1;
				int blockx3 = 1;
				int blockz1 = 1;
				int blockz2 = 1;
				while (blockx1 <= 3)
				{				
					x++;
					Location rightBlock = new Location(currentWorld, x, y, z);
					rightBlock.getBlock().setType(Material.WOOD);
					blockx1++;
				}
				while (blockz1 <= 4)
				{				
					z++;
					Location rightBlock = new Location(currentWorld, x, y, z);
					rightBlock.getBlock().setType(Material.WOOD);
					blockz1++;
				}
				x = x - 3;
				z = z - 4;
				
				while (blockx2 <= 3)
				{				
					x = x-1;
					Location rightBlock = new Location(currentWorld, x, y, z);
					rightBlock.getBlock().setType(Material.WOOD);
					blockx2++;
				}
				while (blockz2 <= 4)
				{				
					z++;
					Location rightBlock = new Location(currentWorld, x, y, z);
					rightBlock.getBlock().setType(Material.WOOD);
					blockz2++;
				}
				while (blockx3 <= 5)
				{				
					x++;
					Location rightBlock = new Location(currentWorld, x, y, z);
					rightBlock.getBlock().setType(Material.WOOD);
					blockx3++;
				}
				x = x - 2;
				z = z - 4;
				y++;
				blockUp++;
				}
			y = y-1;
			
			Location wrong2Block = new Location(currentWorld, x, y, z);
			wrong2Block.getBlock().setType(Material.WOODEN_DOOR);
			ItemStack droppedItemTorch = new ItemStack(Material.TORCH, 1);
			currentWorld.dropItem(wrong2Block, droppedItemTorch);
			
			y = y + 1;
			while(blockUp2 <= 2)
			{
				int blockx1 = 1;
				int blockx2 = 1;
				int blockx3 = 1;
				int blockz1 = 1;
				int blockz2 = 1;
				while (blockx1 <= 3)
				{				
					x++;
					Location rightBlock = new Location(currentWorld, x, y, z);
					rightBlock.getBlock().setType(Material.WOOD);
					blockx1++;
				}
				while (blockz1 <= 4)
				{				
					z++;
					Location rightBlock = new Location(currentWorld, x, y, z);
					rightBlock.getBlock().setType(Material.WOOD);
					blockz1++;
				}
				x = x - 2;
				z = z - 4;
				
				while (blockx2 <= 4)
				{				
					x = x-1;
					Location rightBlock = new Location(currentWorld, x, y, z);
					rightBlock.getBlock().setType(Material.WOOD);
					blockx2++;
				}
				while (blockz2 <= 4)
				{				
					z++;
					Location rightBlock = new Location(currentWorld, x, y, z);
					rightBlock.getBlock().setType(Material.WOOD);
					blockz2++;
				}
				while (blockx3 <= 5)
				{				
					x++;
					Location rightBlock = new Location(currentWorld, x, y, z);
					rightBlock.getBlock().setType(Material.WOOD);
					blockx3++;
				}
				x = x - 2;
				z = z - 4;
				y++;
				blockUp2++;
				}
			brickUp = false;
			}
			while(roof == true)
			{
				y = y - 1;
				z = z + 1;
				x = x - 3;
				int blockx1 = 1;
				int blockx2 = 1;
				int blockx3 = 1;
				int blockz1 = 1;
				int blockz2 = 1;
				
				while (blockx1 <= 5)
				{				
					x++;
					Location rightBlock = new Location(currentWorld, x, y, z);
					rightBlock.getBlock().setType(Material.WOOD);
					blockx1++;
				}
				while (blockz1 <= 2)
				{			
					z++;
					Location rightBlock = new Location(currentWorld, x, y, z);
					rightBlock.getBlock().setType(Material.WOOD);
					blockz1++;
				}
				while (blockx2 <= 4)
				{				
					x = x-1;
					Location rightBlock = new Location(currentWorld, x, y, z);
					rightBlock.getBlock().setType(Material.WOOD);
					blockx2++;
				}
				while (blockz2 <= 1)
				{				
					z = z - 1;
					Location rightBlock = new Location(currentWorld, x, y, z);
					rightBlock.getBlock().setType(Material.WOOD);
					blockz2++;
				}
				while (blockx3 <= 3)
				{				
					x++;
					Location rightBlock = new Location(currentWorld, x, y, z);
					rightBlock.getBlock().setType(Material.WOOD);
					blockx3++;
				}
				roof = false;				
			}
			logger.info("[HouseBuilder] " + player.getName() + " has made a wooden house.");
		}
			else
			{
				player.sendMessage(ChatColor.RED + "You do not have the proper permissions to perform that command");
			}
			return true;
		}
		
		else if(cmd.getName().equalsIgnoreCase("brickhouse"))
		{
			if (player.hasPermission("HouseBuilder.bhouse"))
			{
			boolean roof = true;
			boolean brickUp = true;
			
			while(brickUp == true)
			{
				int blockUp = 1;
				int blockUp2 = 1;
			while(blockUp <= 2)
			{
				int blockx1 = 1;
				int blockx2 = 1;
				int blockx3 = 1;
				int blockz1 = 1;
				int blockz2 = 1;
				while (blockx1 <= 3)
				{				
					x++;
					Location rightBlock = new Location(currentWorld, x, y, z);
					rightBlock.getBlock().setType(Material.BRICK);
					blockx1++;
				}
				while (blockz1 <= 4)
				{				
					z++;
					Location rightBlock = new Location(currentWorld, x, y, z);
					rightBlock.getBlock().setType(Material.BRICK);
					blockz1++;
				}
				x = x - 3;
				z = z - 4;
				
				while (blockx2 <= 3)
				{				
					x = x-1;
					Location rightBlock = new Location(currentWorld, x, y, z);
					rightBlock.getBlock().setType(Material.BRICK);
					blockx2++;
				}
				while (blockz2 <= 4)
				{				
					z++;
					Location rightBlock = new Location(currentWorld, x, y, z);
					rightBlock.getBlock().setType(Material.BRICK);
					blockz2++;
				}
				while (blockx3 <= 5)
				{				
					x++;
					Location rightBlock = new Location(currentWorld, x, y, z);
					rightBlock.getBlock().setType(Material.BRICK);
					blockx3++;
				}
				x = x - 2;
				z = z - 4;
				y++;
				blockUp++;
				}
			y = y-1;
			
			Location wrong2Block = new Location(currentWorld, x, y, z);
			wrong2Block.getBlock().setType(Material.WOODEN_DOOR);
			ItemStack droppedItemTorch = new ItemStack(Material.TORCH, 1);
			currentWorld.dropItem(wrong2Block, droppedItemTorch);
			
			y = y + 1;
			while(blockUp2 <= 2)
			{
				int blockx1 = 1;
				int blockx2 = 1;
				int blockx3 = 1;
				int blockz1 = 1;
				int blockz2 = 1;
				while (blockx1 <= 3)
				{				
					x++;
					Location rightBlock = new Location(currentWorld, x, y, z);
					rightBlock.getBlock().setType(Material.BRICK);
					blockx1++;
				}
				while (blockz1 <= 4)
				{				
					z++;
					Location rightBlock = new Location(currentWorld, x, y, z);
					rightBlock.getBlock().setType(Material.BRICK);
					blockz1++;
				}
				x = x - 2;
				z = z - 4;
				
				while (blockx2 <= 4)
				{				
					x = x-1;
					Location rightBlock = new Location(currentWorld, x, y, z);
					rightBlock.getBlock().setType(Material.BRICK);
					blockx2++;
				}
				while (blockz2 <= 4)
				{				
					z++;
					Location rightBlock = new Location(currentWorld, x, y, z);
					rightBlock.getBlock().setType(Material.BRICK);
					blockz2++;
				}
				while (blockx3 <= 5)
				{				
					x++;
					Location rightBlock = new Location(currentWorld, x, y, z);
					rightBlock.getBlock().setType(Material.BRICK);
					blockx3++;
				}
				x = x - 2;
				z = z - 4;
				y++;
				blockUp2++;
				}
			brickUp = false;
			}
			while(roof == true)
			{
				y = y - 1;
				z = z + 1;
				x = x - 3;
				int blockx1 = 1;
				int blockx2 = 1;
				int blockx3 = 1;
				int blockz1 = 1;
				int blockz2 = 1;
				
				while (blockx1 <= 5)
				{				
					x++;
					Location rightBlock = new Location(currentWorld, x, y, z);
					rightBlock.getBlock().setType(Material.BRICK);
					blockx1++;
				}
				while (blockz1 <= 2)
				{			
					z++;
					Location rightBlock = new Location(currentWorld, x, y, z);
					rightBlock.getBlock().setType(Material.BRICK);
					blockz1++;
				}
				while (blockx2 <= 4)
				{				
					x = x-1;
					Location rightBlock = new Location(currentWorld, x, y, z);
					rightBlock.getBlock().setType(Material.BRICK);
					blockx2++;
				}
				while (blockz2 <= 1)
				{				
					z = z - 1;
					Location rightBlock = new Location(currentWorld, x, y, z);
					rightBlock.getBlock().setType(Material.BRICK);
					blockz2++;
				}
				while (blockx3 <= 3)
				{				
					x++;
					Location rightBlock = new Location(currentWorld, x, y, z);
					rightBlock.getBlock().setType(Material.BRICK);
					blockx3++;
				}
				roof = false;				
			}
			logger.info("[HouseBuilder] " + player.getName() + " has made a brick house.");
		}
			else
			{
				player.sendMessage(ChatColor.RED + "You do not have the proper permissions to perform that command");
			}
		}
		else if(cmd.getName().equalsIgnoreCase("househelp"))
		{
			if (player.hasPermission("HouseBuilder.help"))
			{
				player.sendMessage(ChatColor.GREEN + "/househelp -shows this page.");
				player.sendMessage(ChatColor.GREEN + "/woodhouse -makes a wooden house.");
				player.sendMessage(ChatColor.GREEN + "/brickhouse -makes a brick house.");
				return true;
			}
			else
			{
				player.sendMessage(ChatColor.RED + "You do not have the proper permissions to perform that command");
			}
		}
		}
		else
		{
			logger.warning("That command must be used by a player");
			
		}
		return false;
	}
}