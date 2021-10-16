package Cssey.macacus.urbanus.client.model;

import Cssey.macacus.urbanus.entity.MonkeyEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class MonkeyEntityModel extends EntityModel<MonkeyEntity>{
    private final ModelPart base;

    public MonkeyEntityModel() {
        this.textureHeight = 32;
        this.textureWidth = 32;
        base = new ModelPart(this,0,0);
        
    }

    @Override
    public void setAngles(MonkeyEntity entity, float limbAngle, float limbDistance, float animationProgress,
            float headYaw, float headPitch) {
        
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green,
            float blue, float alpha) {
                matrices.translate(0, 1.125, 0);

                base.render(matrices, vertices, light, overlay);
        
    }
    
}
