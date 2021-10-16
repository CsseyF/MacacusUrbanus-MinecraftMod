package Cssey.macacus.urbanus.foods;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class CigarreteFoodComponent {
    
    public static final FoodComponent CIGARRETE_TOBACCO = ( new FoodComponent.Builder()).hunger(1).saturationModifier((float) .2).statusEffect(new StatusEffectInstance(StatusEffects.SPEED ,2400,2),1.0F).statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS,2400, 0),1.0F).snack().alwaysEdible().build();

    public static final FoodComponent CIGARRETE_WEED = ( new FoodComponent.Builder()).hunger(1).saturationModifier((float) .2).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH ,2400,1),1.0F).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,1200, 0),1.0F).snack().alwaysEdible().build();
}
