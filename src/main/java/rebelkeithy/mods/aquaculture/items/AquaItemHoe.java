package rebelkeithy.mods.aquaculture.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class AquaItemHoe extends ItemHoe {

    public AquaItemHoe(ToolMaterial toolMaterial) {
        super(toolMaterial);
    }

    /**
     * Sets the unlocalized name of this item to the string passed as the parameter, prefixed by "item."
     */
    @Override
    public Item setUnlocalizedName(String par1Str) {
        super.setUnlocalizedName(par1Str);
        this.setTextureName("aquaculture:" + par1Str.replaceAll("\\s", ""));
        return this;
    }

}
