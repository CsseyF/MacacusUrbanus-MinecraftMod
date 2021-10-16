package Cssey.macacus.urbanus.spawns;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;

import Cssey.macacus.urbanus.MacacusUrbanus;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.registry.Registry;

@SuppressWarnings("deprecation")
public class SpawnInit {

    public static int SpawnRate = 70;

    public static void addSpawn(Predicate<BiomeSelectionContext> BiomeSelector, SpawnGroup spawnGroup, SpawnSettings.SpawnEntry se){
        Preconditions.checkArgument(se.type.getSpawnGroup() != SpawnGroup.MISC, "MISC Spawns pigs");

        net.minecraft.util.Identifier id = Registry.ENTITY_TYPE.getId(se.type);
        Preconditions.checkState(id != Registry.ENTITY_TYPE.getDefaultId(), "Unregistered entity type : %S",se.type);
        
        BiomeModifications.create(id).add(ModificationPhase.ADDITIONS, BiomeSelector, context-> {context.getSpawnSettings().addSpawn(spawnGroup, se);});
    }

    private static void normalspawn(){
    Predicate<BiomeSelectionContext> biomeSelector = (context) -> {
        Biome.Category category = context.getBiome().getCategory();
        return category != Biome.Category.NETHER && category != Biome.Category.DESERT && category != Biome.Category.THEEND && category != Biome.Category.ICY
        && category != Biome.Category.OCEAN;
    };

    addSpawn(biomeSelector, MacacusUrbanus.MONKEY.getSpawnGroup(), new SpawnSettings.SpawnEntry(MacacusUrbanus.MONKEY, SpawnRate,3, 5));

    }

    public static void init() {
        normalspawn();
    }

}
