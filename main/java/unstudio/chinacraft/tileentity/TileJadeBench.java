package unstudio.chinacraft.tileentity;

import net.minecraft.item.Item;
import unstudio.chinacraft.ChinaCraft;
import unstudio.chinacraft.recipes.JadeBenchRepair;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.tileentity.TileEntity;

import java.util.Random;

public class TileJadeBench  extends TileEntity implements IUpdatePlayerListBox, IInventory {
	
	private ItemStack stack[] = new ItemStack[3];
	
	@Override
	public int getSizeInventory() {
		return stack.length;
	}

	@Override
	public ItemStack getStackInSlot(int p_70301_1_) {
		return stack[p_70301_1_];
	}

	@Override
	public ItemStack decrStackSize(int index, int count) {
        if (this.stack[index] != null)
        {
                    ItemStack itemstack;

                    if (this.stack[index].stackSize <= count)
                    {
                        itemstack = this.stack[index];
                        this.stack[index] = null;
                        return itemstack;
                    }
                    else
                    {
                        itemstack = this.stack[index].splitStack(count);

                        if (this.stack[index].stackSize == 0)
                        {
                                    this.stack[index] = null;
                        }

                        return itemstack;
                    }
        }
        else
               {
                    return null;
        }
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int p_70304_1_) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setInventorySlotContents(int index, ItemStack stack) {
		this.stack[index] = stack;
		if (stack != null && stack.stackSize > this.getInventoryStackLimit()) {
			stack.stackSize = this.getInventoryStackLimit();
		}
	}

	@Override
	public String getInventoryName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasCustomInventoryName() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer p_70300_1_) {
		return true;
	}

	@Override
	public void openInventory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeInventory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void update() {
	
	}
	
	public void updateEntity(){
		super.updateEntity();
		if (getStackInSlot(0) != null){
			if (getStackInSlot(1) != null){
				if (getStackInSlot(2) == null){
					JadeBenchRepair r = JadeBenchRepair.getJadeBenchRepair(getStackInSlot(0), getStackInSlot(1));
					if(r !=null) {
							r.getTool().setItemDamage(r.getTool().getItemDamage() - 1);
							setInventorySlotContents(2, r.getOut());
							if (getStackInSlot(1).stackSize == 1){
								setInventorySlotContents(1, null);
							} else {
								setInventorySlotContents(1,new ItemStack(getStackInSlot(1).getItem(),getStackInSlot(1).stackSize--));
							}
					} else {
						if (getStackInSlot(1).getItem() == Item.getItemFromBlock(ChinaCraft.jadeOre)){
							Item out = getStackInSlot(0).getItem();
							if (out == ChinaCraft.hammerDiamond||out == ChinaCraft.hammerIron||out == ChinaCraft.hammerStone){
								int rn = new Random().nextInt(3);
								if (getStackInSlot(0).stackSize == 1){
									setInventorySlotContents(1,null);
								} else {
									setInventorySlotContents(1,new ItemStack(ChinaCraft.jadeOre,getStackInSlot(1).stackSize--));
								}
								//getStackInSlot(0).damageItem(3 ,);
								Item out1 = rn == 0?ChinaCraft.jadeGreenItem:ChinaCraft.jadeGreen2Item;
								setInventorySlotContents(2, new ItemStack(out1));
							}
						}
					}
				}
			}
		}

		if (getStackInSlot(2) != null){
			Item item2 = getStackInSlot(2).getItem();
			if (item2 == ChinaCraft.jadeGreenItem||item2 == ChinaCraft.jadeGreen2Item||item2 == ChinaCraft.jadePinkItem||item2 == ChinaCraft.jadePurpleItem){

			}
		}
		
	}
	
	public void readFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.readFromNBT(par1NBTTagCompound);
        NBTTagList var2 = par1NBTTagCompound.getTagList("Items", 10);
        this.stack = new ItemStack[this.getSizeInventory()];
        for (int var3 = 0; var3 < var2.tagCount(); ++var3)
        {
            NBTTagCompound var4 = (NBTTagCompound)var2.getCompoundTagAt(var3);
            byte var5 = var4.getByte("Slot");
            if (var5 >= 0 && var5 < this.stack.length)
            {
                this.stack[var5] = ItemStack.loadItemStackFromNBT(var4);
            }
        }
    }
 
    public void writeToNBT(NBTTagCompound par1NBTTagCompound)
    {
        super.writeToNBT(par1NBTTagCompound);
        NBTTagList var2 = new NBTTagList();
        for (int var3 = 0; var3 < this.stack.length; ++var3)
        {
            if (this.stack[var3] != null)
            {
                NBTTagCompound var4 = new NBTTagCompound();
                var4.setByte("Slot", (byte)var3);
                this.stack[var3].writeToNBT(var4);
                var2.appendTag(var4);
            }
        }
        par1NBTTagCompound.setTag("Items", var2);
    }
}