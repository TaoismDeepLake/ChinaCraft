package unstudio.chinacraft.common;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.MinecraftForgeClient;

import unstudio.chinacraft.block.decoration.BlockCCDing;
import unstudio.chinacraft.client.model.block.ModelBuhrimill;
import unstudio.chinacraft.client.model.block.ModelDing;
import unstudio.chinacraft.client.model.block.ModelLanternScaldfish;
import unstudio.chinacraft.client.render.block.BlockLanternRenderer;
import unstudio.chinacraft.client.render.block.BlockWoodenBucketRenderer;
import unstudio.chinacraft.client.render.item.*;
import unstudio.chinacraft.client.render.tileentity.TileEntityBuhrimillRenderer;
import unstudio.chinacraft.client.render.tileentity.TileEntityModelBlockRenderer;
import unstudio.chinacraft.client.render.tileentity.TileEntityPotteryTableRenderer;
import unstudio.chinacraft.client.render.tileentity.TileEntitySericultureFrameRenderer;
import unstudio.chinacraft.client.nei.NEIAPI;
import unstudio.chinacraft.entity.EntityRenderingRegistry;
import unstudio.chinacraft.item.combat.ModelArmorRegister;
import unstudio.chinacraft.tileentity.*;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import unstudio.chinacraft.util.annotation.ClientSideRegister;
import unstudio.chinacraft.util.annotation.SpecialItemRenderRegister;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        ChinaCraft.bronzeArmorTexture = RenderingRegistry.addNewArmourRendererPrefix("ccbronze"); // 青铜套装外部材质注册

        super.preInit(event);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        if (ChinaCraft.NEIIsLoad) {
            new NEIAPI().loadConfig();
        }

        //清理此地材质注册……
        ChinaCraft.azalea.setBlockTextureName("chinacraft:azalea");
        ChinaCraft.peony.setBlockTextureName("chinacraft:peony");
        ChinaCraft.chrysanthemum.setBlockTextureName("chinacraft:chrysanthemum");
        ChinaCraft.glutinousRice.setTextureName("chinacraft:glutinous_rice");
        ChinaCraft.jadeWorkingTable.setBlockTextureName("chinacraft:jade_table");

        ChinaCraft.tinPowder.setTextureName("chinacraft:tin_powder");
        ChinaCraft.copperPowder.setTextureName("chinacraft:copper_powder");
        ChinaCraft.copperIngot.setTextureName("chinacraft:copper_ingot");
        ChinaCraft.copperTinMixedPowder.setTextureName("chinacraft:copper_tin_mixed_powder");
        ChinaCraft.bronzeSword.setTextureName("chinacraft:bronze_sword");
        ChinaCraft.bronzeBroadSword.setTextureName("chinacraft:bronze_bigsword");
        ChinaCraft.bronzeBroadSwordGreen.setTextureName("chinacraft:bronze_bigsword_green");
        ChinaCraft.bronzeBroadSwordGreen2.setTextureName("chinacraft:bronze_bigsword_green2");
        ChinaCraft.bronzeBroadSwordPink.setTextureName("chinacraft:bronze_bigsword_pink");
        ChinaCraft.bronzeBroadSwordPurple.setTextureName("chinacraft:bronze_bigsword_purple");
        ChinaCraft.blGiantSword.setTextureName("chinacraft:blgiantsword");
        ChinaCraft.jiuqu_tang.setTextureName("chinacraft:jiuqu_tang");
        ChinaCraft.mace.setTextureName("chinacraft:mace");
        ChinaCraft.tinIngot.setTextureName("chinacraft:tin_ingot");
        ChinaCraft.silverIngot.setTextureName("chinacraft:silver_ingot");
        ChinaCraft.rices.setTextureName("chinacraft:barley_rice");
        ChinaCraft.soy.setTextureName("chinacraft:soy_item");
        ChinaCraft.lcker.setTextureName("chinacraft:lcker");
        ChinaCraft.soyPod.setTextureName("chinacraft:soy_pod");
        ChinaCraft.itemMulberryLeaf.setTextureName("chinacraft:mulberry_leaf");
        ChinaCraft.woodenBucket.setTextureName("chinacraft:woodenbucket");
        ChinaCraft.woodenBucket_Water.setTextureName("chinacraft:woodenbucket_water");
        ChinaCraft.silkwormChrysalis.setTextureName("chinacraft:silkworm_chrysalis");
        ChinaCraft.redPacket.setTextureName("chinacraft:redpacket");
        ChinaCraft.firecracker.setTextureName("chinacraft:firecracker");
        ChinaCraft.bomb.setTextureName("chinacraft:bomb");
        ChinaCraft.flyingCutter.setTextureName("chinacraft:flying_cutter");
        ChinaCraft.blackDogBlood.setTextureName("chinacraft:blackdogblood");
        ChinaCraft.moonCake.setTextureName("chinacraft:mooncake");
        ChinaCraft.itemXinjiangNutCake.setTextureName("chinacraft:xinjiang_nut_cake");
        ChinaCraft.xinjiangNutCake.setBlockTextureName("chinacraft:xinjiang_nut_cake");
        ChinaCraft.appleCake.setBlockTextureName("chinacraft:apple_cake");
        ChinaCraft.itemAppleCake.setTextureName("chinacraft:apple_cake");
        ChinaCraft.salt.setTextureName("chinacraft:salt_powder");
        ChinaCraft.douJiangBucket.setTextureName("chinacraft:doujiang");
        // 青铜
        ChinaCraft.bronzePickaxe.setTextureName("chinacraft:bronze_pickaxe");
        ChinaCraft.bronzeAxe.setTextureName("chinacraft:bronze_axe");
        ChinaCraft.bronzeHoe.setTextureName("chinacraft:bronze_hoe");
        ChinaCraft.bronzeShovel.setTextureName("chinacraft:bronze_shovel");

        ChinaCraft.bronzeHelmet.setTextureName("chinacraft:bronze_helmet");
        ChinaCraft.bronzeChestplate.setTextureName("chinacraft:bronze_chestplate");
        ChinaCraft.bronzeLeggings.setTextureName("chinacraft:bronze_leggings");
        ChinaCraft.bronzeBoots.setTextureName("chinacraft:bronze_boots");
        ChinaCraft.hammerStone.setTextureName("chinacraft:hammer_stone");
        ChinaCraft.hammerIron.setTextureName("chinacraft:hammer_iron");
        ChinaCraft.hammerDiamond.setTextureName("chinacraft:hammer_diamond");
        ChinaCraft.hammerBronze.setTextureName("chinacraft:hammer_bronze");
        ChinaCraft.buddhistCane.setTextureName("chinacraft:buddhist_cane");

        // 玉
        ChinaCraft.jadeGreenItem.setTextureName("chinacraft:jade_green");
        ChinaCraft.jadeGreen2Item.setTextureName("chinacraft:jade_green2");
        ChinaCraft.jadePinkItem.setTextureName("chinacraft:jade_pink");
        ChinaCraft.jadePurpleItem.setTextureName("chinacraft:jade_purple");
        ChinaCraft.jadeKnife.setTextureName("chinacraft:jade_knife");
        ChinaCraft.artKnife.setTextureName("chinacraft:art_knife");

        // 耐火砖
        ChinaCraft.blockFirebrick.setBlockTextureName("chinacraft:firebrick");
        ChinaCraft.firebrick.setTextureName("chinacraft:firebrick");
        ChinaCraft.blockPotteryKiln.setBlockTextureName("chinacraft:firebrick");
        ChinaCraft.claySandMixture.setTextureName("chinacraft:clay_sand_mixture");

        // 饮品、食物
        ChinaCraft.cup.setTextureName("chinacraft:cup");
        ChinaCraft.cup_Clay.setTextureName("chinacraft:cup_clay");
        ChinaCraft.cupChocolate.setTextureName("chinacraft:cup_chocolate");
        ChinaCraft.cocoa.setTextureName("chinacraft:cocoa");
        ChinaCraft.ladyfinger.setTextureName("chinacraft:ladyfinger");
        ChinaCraft.cupWater.setTextureName("chinacraft:cup_water");
        ChinaCraft.cupChrysanthemum.setTextureName("chinacraft:cup_chrysanthemum");
        ChinaCraft.flour.setTextureName("chinacraft:flour");
        ChinaCraft.riceFlour.setTextureName("chinacraft:riceflour");
        ChinaCraft.barleyRice.setTextureName("chinacraft:barley_rice");

        // 靈符
        ChinaCraft.spiritualMagicFigures.setTextureName("chinacraft:spiritual_magic_figures");
        ChinaCraft.smfFire.setTextureName("chinacraft:spiritual_magic_figures_fire");
        ChinaCraft.smfNightVision.setTextureName("chinacraft:spiritual_magic_figures_night_vision");
        ChinaCraft.smfPoison.setTextureName("chinacraft:spiritual_magic_figures_poison");
        ChinaCraft.smfPower.setTextureName("chinacraft:spiritual_magic_figures_power");
        ChinaCraft.smfHeal.setTextureName("chinacraft:spiritual_magic_figures_heal");
        ChinaCraft.smfProtect.setTextureName("chinacraft:spiritual_magic_figures_protect");
        ChinaCraft.smfSuper.setTextureName("chinacraft:spiritual_magic_figures_super");

        ChinaCraft.debug.setTextureName("chinacraft:debug");

        super.init(event);

        ModelArmorRegister.init();

        ClientRegistry.bindTileEntitySpecialRenderer(TileBuhrimill.class, new TileEntityBuhrimillRenderer());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ChinaCraft.buhrimill), new ModelBlockItemRenderer(new ModelBuhrimill(),
                new ResourceLocation("chinacraft:textures/models/block/buhrimill.png")));

//        MinecraftForgeClient.registerItemRenderer(ChinaCraft.itemLanternScaldfishOpenable,
//                new ModelBlockItemRenderer(new ModelLanternScaldfish(),
//                        new ResourceLocation("chinacraft:textures/models/block/lantern_scaldfish_on.png")));

        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ChinaCraft.lanternScaldfish),
                new ModelBlockItemRenderer(new ModelLanternScaldfish(),
                        new ResourceLocation("chinacraft:textures/models/block/lantern_scaldfish_on.png")));

        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ChinaCraft.lanternScaldfishOff),
                new ModelBlockItemRenderer(new ModelLanternScaldfish(),
                        new ResourceLocation("chinacraft:textures/models/block/lantern_scaldfish_off.png")));

        RenderingRegistry.registerBlockHandler(new BlockLanternRenderer());

        ClientRegistry.bindTileEntitySpecialRenderer(TileModelBlock.class, new TileEntityModelBlockRenderer());

        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ChinaCraft.ding), new ModelBlockItemRenderer(new ModelDing(), new ResourceLocation("chinacraft:textures/models/block/ding.png")).setRenderer(new BlockCCDing.ItemCustomRender()));


        ClientRegistry.bindTileEntitySpecialRenderer(TileSericultureFrame.class,
                new TileEntitySericultureFrameRenderer());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ChinaCraft.sericultureFrame), new ItemSericultureFrameRenderer());

        RenderingRegistry.registerBlockHandler(new BlockWoodenBucketRenderer());
        // MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ChinaCraft.blockPotteryBase),
        // new ItemPotteryBlockRenderer(new TilePotteryBlock(), 0.0D, -0.1D,
        // 0.0D));

        ClientRegistry.bindTileEntitySpecialRenderer(TilePotteryTable.class, new TileEntityPotteryTableRenderer());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ChinaCraft.potteryTable), new ItemPotteryTableRenderer());
        //MinecraftForgeClient.registerItemRenderer(ChinaCraft.itemPotteryTable, new ItemPotteryTableRenderer());

        // RenderingRegistry.registerBlockHandler(new BlockLanternRenderer());
        EntityRenderingRegistry.init();

        //实现IClient
        ClientSideRegister.registerAll();

        //注册物品渲染器
        SpecialItemRenderRegister.registerAll();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}
