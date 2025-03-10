package net.gecko.varandeco.item;

import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.item.projectile.SnowBrickItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DecoItems {
    public static final Item SNOW_BRICK = registerItem("snow_brick",
            new SnowBrickItem(new Item.Settings().group(ItemGroup.MISC).maxCount(16)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(VaranDeco.MOD_ID, name),item);
    }

    public static void registerDecoItems() {
        VaranDeco.LOGGER.debug("Registering Items for" + VaranDeco.MOD_ID);
    }
}
