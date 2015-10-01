package unstudio.chinacraft.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import java.util.List;

public class SMFFire extends SpiritualMagicFigures{
    public SMFFire(){
        setUnlocalizedName("spiritual_magic_figures_fire");
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        target.setFire(target.worldObj.rand.nextInt(8) + 15);
        stack.stackSize = stack.stackSize -1;
        return false;
    }
    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
        stack.stackSize = stack.stackSize -1;
        player.setFire(15);
        return stack;
    }
    @Override
    public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List p_77624_3_, boolean p_77624_4_) {
        p_77624_3_.add(StatCollector.translateToLocal("item.spiritual_magic_figures_fire.lore"));
    }
}
