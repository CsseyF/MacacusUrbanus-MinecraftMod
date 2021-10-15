package Cssey.macacus.urbanus;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class PickaxeBase extends PickaxeItem {

    public PickaxeBase(ToolMaterial material) {
        super(material, -1, -2.2f, new Item.Settings().group(ItemGroup.TOOLS));
        
    }
    
}
