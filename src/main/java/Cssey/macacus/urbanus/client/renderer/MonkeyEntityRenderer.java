package Cssey.macacus.urbanus.client.renderer;


import Cssey.macacus.urbanus.entity.MonkeyEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.util.Identifier;

public class MonkeyEntityRenderer extends MobEntityRenderer<MonkeyEntity, PlayerEntityModel<MonkeyEntity>> {




    public MonkeyEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new PlayerEntityModel<MonkeyEntity>(0.5f, false), 0.4f);
    
    }


    @Override
    public Identifier getTexture(MonkeyEntity entity) {
        return new Identifier("macacusurbanus", "textures/entity/monkey/monkey.png");
    }
    
}
