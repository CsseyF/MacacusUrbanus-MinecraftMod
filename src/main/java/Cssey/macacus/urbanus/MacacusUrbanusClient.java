package Cssey.macacus.urbanus;

import Cssey.macacus.urbanus.client.renderer.MonkeyEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class MacacusUrbanusClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.INSTANCE.register(MacacusUrbanus.MONKEY, (dispatcher, context) -> {
            return new MonkeyEntityRenderer(dispatcher);
        });
        
    }
    
}
