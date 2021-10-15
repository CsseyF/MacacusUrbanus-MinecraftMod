package Cssey.macacus.urbanus;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialBelial implements ToolMaterial{

    @Override
    public int getDurability() {

        return 600;
    }

    @Override
    public float getMiningSpeedMultiplier() {
    
        return 8.5f;
    }

    @Override
    public float getAttackDamage() {
        
        return 5;
    }

    @Override
    public int getMiningLevel() {
        
        return 3;
    }

    @Override
    public int getEnchantability() {
        
        return 25;
    }

    @Override
    public Ingredient getRepairIngredient() {
        
        return Ingredient.ofItems(MacacusUrbanus.BELIAL_INGOT);
    }
    
}
