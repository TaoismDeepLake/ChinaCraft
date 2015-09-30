package unstudio.chinacraft.block;

import java.util.Random;

import unstudio.chinacraft.ChinaCraft;
import unstudio.chinacraft.GuiID;
import unstudio.chinacraft.tileentity.TileBuhrimill;
import unstudio.chinacraft.tileentity.TileSericultureFrame;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class SericultureFrame extends BlockContainer{

	public SericultureFrame() {
		super(Material.wood);
		setBlockName("sericulture_frame");
		setHardness(1.5F);
		setResistance(10.0F);
		setStepSound(soundTypeWood);
		setCreativeTab(ChinaCraft.tabCore);
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileSericultureFrame();
	}

	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
		if(world.isRemote) return true;
            p_149727_5_.openGui(ChinaCraft.instance, GuiID.GUI_Sericulture_Farme, world, x, y, z);
            return true;
    }
	
	 public void breakBlock(World World, int x, int y, int z, Block Block, int var1)
	    {

		 TileSericultureFrame tileentity = (TileSericultureFrame)World.getTileEntity(x, y, z);
		 Random random = World.rand;
	            if (tileentity != null)
	            {
	                for (int i1 = 0; i1 < tileentity.getSizeInventory(); ++i1)
	                {
	                    ItemStack itemstack = tileentity.getStackInSlot(i1);

	                    if (itemstack != null)
	                    {
	                        float f = random.nextFloat() * 0.8F + 0.1F;
	                        float f1 = random.nextFloat() * 0.8F + 0.1F;
	                        float f2 = random.nextFloat() * 0.8F + 0.1F;

	                        while (itemstack.stackSize > 0)
	                        {
	                            int j1 = random.nextInt(21) + 10;

	                            if (j1 > itemstack.stackSize)
	                            {
	                                j1 = itemstack.stackSize;
	                            }

	                            itemstack.stackSize -= j1;
	                            EntityItem entityitem = new EntityItem(World, (double)((float)x + f), (double)((float)y + f1), (double)((float)z + f2), new ItemStack(itemstack.getItem(), j1, itemstack.getItemDamage()));

	                            if (itemstack.hasTagCompound())
	                            {
	                                entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
	                            }

	                            float f3 = 0.05F;
	                            entityitem.motionX = (double)((float)random.nextGaussian() * f3);
	                            entityitem.motionY = (double)((float)random.nextGaussian() * f3 + 0.2F);
	                            entityitem.motionZ = (double)((float)random.nextGaussian() * f3);
	                            World.spawnEntityInWorld(entityitem);
	                        }
	                    }
	                }

	                World.func_147453_f(x, y, z, Block);
	            }
	        

	        super.breakBlock(World, x, y, z, Block, var1);
	    }
}