package Cssey.macacus.urbanus.entity;

import org.jetbrains.annotations.Nullable;

import Cssey.macacus.urbanus.MacacusUrbanus;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.OcelotEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.util.math.BlockPos;

public class MonkeyEntity extends OcelotEntity{

    public boolean MonkeyCanSpawn = true;

    public MonkeyEntity(EntityType<? extends OcelotEntity> entityType, World world) {
        super(entityType, world);
        
        this.experiencePoints = 60;
        this.setStackInHand(Hand.MAIN_HAND, new ItemStack(MacacusUrbanus.CIGARRETE));
    }

    public static DefaultAttributeContainer.Builder createMonkeyAttributes(){
        return AnimalEntity.createLivingAttributes()
        .add(EntityAttributes.GENERIC_MAX_HEALTH, 60D)
        .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.50D);
    }
    @Override
    public boolean canSpawn(WorldView view){
        BlockPos blockunderentity = new BlockPos(this.getX(), this.getY() -1, this.getZ());
        BlockPos posentity = new BlockPos(this.getX(), this.getY(), this.getZ());

        return view.intersectsEntities(this) && this.world.isDay() || this.world.isNight() && !world.containsFluid(this.getBoundingBox())
        && this.world.getBlockState(posentity).getBlock().canMobSpawnInside() && this.world.getBlockState(blockunderentity).allowsSpawning(world, blockunderentity, MacacusUrbanus.MONKEY)
        && MonkeyCanSpawn;
    }

    protected SoundEvent getHurtSound(DamageSource source) {
		return MacacusUrbanus.MONKEY_SOUND_HURT_EVENT;
	}
    protected void initEquipment(LocalDifficulty difficulty) {
		this.equipStack(EquipmentSlot.MAINHAND, new ItemStack(MacacusUrbanus.CIGARRETE));
	}
    
    @Nullable
    protected SoundEvent getAmbientSound() {
        return MacacusUrbanus.MONKEY_SOUND_AMBIENT_EVENT;
    }

}
