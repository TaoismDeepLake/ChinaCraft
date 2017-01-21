package unstudio.chinacraft.client.model.block;

import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;
import unstudio.chinacraft.client.model.ModelExtendBlock;
import unstudio.chinacraft.client.render.tileentity.TileEntityModelBlockRenderer;
import unstudio.chinacraft.common.ChinaCraft;
import unstudio.chinacraft.tileentity.TileModelBlock;

public class ModelLanternScaldfish extends ModelBase implements ModelExtendBlock,TileEntityModelBlockRenderer.ModelRenderer {
    // fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape13;

    ModelRenderer Shape14;

    ModelRenderer foot1;
    ModelRenderer foot2;

    public ModelLanternScaldfish() {
        textureWidth = 64;
        textureHeight = 128;

        Shape1 = new ModelRenderer(this, 0, 84);
        Shape1.addBox(0F, 0F, 0F, 12, 8, 4);
        Shape1.setRotationPoint(-6F, 13F, -2F);
        Shape1.setTextureSize(64, 128);
        Shape1.mirror = true;
        setRotation(Shape1, 0F, 0F, 0F);
        Shape2 = new ModelRenderer(this, 0, 84);
        Shape2.addBox(0F, 0F, 0F, 12, 8, 4);
        Shape2.setRotationPoint(-2F, 13F, 6F);
        Shape2.setTextureSize(64, 128);
        Shape2.mirror = true;
        setRotation(Shape2, 0F, 1.570796F, 0F);
        Shape3 = new ModelRenderer(this, 0, 68);
        Shape3.addBox(0F, 0F, 0F, 10, 8, 8);
        Shape3.setRotationPoint(-4F, 13F, 5F);
        Shape3.setTextureSize(64, 128);
        Shape3.mirror = true;
        setRotation(Shape3, 0F, 1.570796F, 0F);
        Shape4 = new ModelRenderer(this, 0, 68);
        Shape4.addBox(0F, 0F, 0F, 10, 8, 8);
        Shape4.setRotationPoint(-5F, 13F, -4F);
        Shape4.setTextureSize(64, 128);
        Shape4.mirror = true;
        setRotation(Shape4, 0F, 0F, 0F);
        Shape5 = new ModelRenderer(this, 0, 34);
        Shape5.addBox(0F, 0F, 0F, 8, 12, 6);
        Shape5.setRotationPoint(-3F, 11F, 4F);
        Shape5.setTextureSize(64, 128);
        Shape5.mirror = true;
        setRotation(Shape5, 0F, 1.570796F, 0F);
        Shape6 = new ModelRenderer(this, 0, 34);
        Shape6.addBox(0F, 0F, 0F, 8, 12, 6);
        Shape6.setRotationPoint(-4F, 11F, -3F);
        Shape6.setTextureSize(64, 128);
        Shape6.mirror = true;
        setRotation(Shape6, 0F, 0F, 0F);
        Shape7 = new ModelRenderer(this, 0, 18);
        Shape7.addBox(0F, 0F, 0F, 10, 10, 6);
        Shape7.setRotationPoint(-5F, 12F, -3F);
        Shape7.setTextureSize(64, 128);
        Shape7.mirror = true;
        setRotation(Shape7, 0F, 0F, 0F);
        Shape8 = new ModelRenderer(this, 0, 18);
        Shape8.addBox(0F, 0F, 0F, 10, 10, 6);
        Shape8.setRotationPoint(-3F, 12F, 5F);
        Shape8.setTextureSize(64, 128);
        Shape8.mirror = true;
        setRotation(Shape8, 0F, 1.570796F, 0F);
        Shape9 = new ModelRenderer(this, 0, 96);
        Shape9.addBox(0F, 0F, 0F, 8, 10, 8);
        Shape9.setRotationPoint(-4F, 12F, -4F);
        Shape9.setTextureSize(64, 128);
        Shape9.mirror = true;
        setRotation(Shape9, 0F, 0F, 0F);
        Shape10 = new ModelRenderer(this, 0, 0);
        Shape10.addBox(0F, 0F, 0F, 4, 14, 1);
        Shape10.setRotationPoint(-3F, 10F, 2F);
        Shape10.setTextureSize(64, 128);
        Shape10.mirror = true;
        setRotation(Shape10, 0F, 1.570796F, 0F);
        Shape11 = new ModelRenderer(this, 0, 0);
        Shape11.addBox(0F, 0F, 0F, 4, 14, 1);
        Shape11.setRotationPoint(2F, 10F, 2F);
        Shape11.setTextureSize(64, 128);
        Shape11.mirror = true;
        setRotation(Shape11, 0F, 1.570796F, 0F);
        Shape12 = new ModelRenderer(this, 0, 0);
        Shape12.addBox(0F, 0F, 0F, 4, 14, 1);
        Shape12.setRotationPoint(-2F, 10F, 2F);
        Shape12.setTextureSize(64, 128);
        Shape12.mirror = true;
        setRotation(Shape12, 0F, 0F, 0F);
        Shape13 = new ModelRenderer(this, 0, 0);
        Shape13.addBox(0F, 0F, 0F, 4, 14, 1);
        Shape13.setRotationPoint(-2F, 10F, -3F);
        Shape13.setTextureSize(64, 128);
        Shape13.mirror = true;
        setRotation(Shape13, 0F, 0F, 0F);
        Shape14 = new ModelRenderer(this, 0, 0);
        Shape14.addBox(0F, 0F, 0F, 1, 6, 1);
        Shape14.setRotationPoint(-0.5F, 7F, -0.5F);
        Shape14.setTextureSize(0, 0);
        Shape14.mirror = true;
        setRotation(Shape14, 0F, 0F, 0F);
        foot1 = new ModelRenderer(this, 14, 0);
        foot1.addBox(0F, 0F, 0F, 1, 3, 1);
        foot1.setRotationPoint(-0.5F, 22F, -0.5F);
        foot1.setTextureSize(64, 128);
        foot1.mirror = true;
        setRotation(foot1, 0F, 0F, 0F);
        foot2 = new ModelRenderer(this, 14, 6);
        foot2.addBox(0F, 0F, 0F, 1, 2, 1);
        foot2.setRotationPoint(-0.5F, 25F, -0.5F);
        foot2.setTextureSize(64, 128);
        foot2.mirror = true;
        setRotation(foot2, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    @Override
    public void render(float f5) {
        Shape1.render(f5);
        Shape3.render(f5);
        Shape4.render(f5);
        Shape5.render(f5);
        Shape6.render(f5);
        Shape7.render(f5);
        Shape8.render(f5);
        Shape9.render(f5);
        Shape10.render(f5);
        Shape11.render(f5);
        Shape12.render(f5);
        Shape13.render(f5);
        Shape2.render(f5);
    }

    @Override
    public void render(TileEntity tile, double x, double y, double z) {
        double sca = tile.getBlockMetadata() * 0.2;
        if (tile.getWorldObj().isAirBlock(tile.xCoord,tile.yCoord - 1,tile.zCoord)){
            foot1.render(0.0625f);
            foot2.render(0.0625f);
        }
        Block b = tile.getWorldObj().getBlock(tile.xCoord,tile.yCoord + 1,tile.zCoord);
        if  ((System.currentTimeMillis() & 99) == 0 && tile.getWorldObj().getBlock(tile.xCoord,tile.yCoord,tile.zCoord) == ChinaCraft.lanternScaldfish) tile.getWorldObj().spawnParticle("flame",tile.xCoord + 0.5,tile.yCoord + 0.635,tile.zCoord + 0.5,0,0.002,0);
        if (b == ChinaCraft.lanternScaldfish||b == ChinaCraft.lanternScaldfishOff||b.getRenderType() == 0 || b.getRenderType() == 11|| b.getRenderType() == 32){
                Shape14.render(0.0625F);
        }
        GL11.glScaled(1.0 + sca,1.0,1.0 + sca);
        render(0.0625F);
    }
}
