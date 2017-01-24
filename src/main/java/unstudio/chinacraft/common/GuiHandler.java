package unstudio.chinacraft.common;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import unstudio.chinacraft.client.gui.*;
import unstudio.chinacraft.inventory.*;
import unstudio.chinacraft.tileentity.*;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID) {
        case GuiID.GUI_Buhrimill:
            return new ContainerBuhrimill(player.inventory, (TileBuhrimill) world.getTileEntity(x, y, z));

        case GuiID.GUI_JadeBench:
            return new ContainerJadeBench(player.inventory, (TileJadeBench) world.getTileEntity(x, y, z));

        case GuiID.GUI_CookingBench:
            return new ContainerCookingBench(player.inventory, (TileCookingBench) world.getTileEntity(x, y, z));

        case GuiID.GUI_Sericulture_Farme:
            return new ContainerSericultureFrame(player.inventory, (TileSericultureFrame) world.getTileEntity(x, y, z));

        case GuiID.GUI_PotteryTable:
            return new ContainerPotteryTable(player);

        case GuiID.GUI_PotteryKiln:
            return new ContainerPotteryKiln(player.inventory, (TilePotteryKiln) world.getTileEntity(x, y, z));

        case GuiID.GUI_RedPacket:
            return new ContainerRedPacket(player);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID) {
        case GuiID.GUI_Buhrimill:
            return new GuiBuhrimill(player.inventory, (TileBuhrimill) world.getTileEntity(x, y, z));

        case GuiID.GUI_JadeBench:
            return new GuiJadeBench(player.inventory, (TileJadeBench) world.getTileEntity(x, y, z));

        case GuiID.GUI_CookingBench:
            return new GuiCookingBench(player.inventory, (TileCookingBench) world.getTileEntity(x, y, z));

        case GuiID.GUI_Sericulture_Farme:
            return new GuiSericultureFrame(player.inventory, (TileSericultureFrame) world.getTileEntity(x, y, z));

        case GuiID.GUI_PotteryTable:
            return new GuiPotteryTable(player);

        case GuiID.GUI_PotteryKiln:
            return new GuiPotteryKiln(player.inventory, (TilePotteryKiln) world.getTileEntity(x, y, z));

        case GuiID.GUI_RedPacket:
            return new GuiRedPacket(player);
        }
        return null;
    }

}
