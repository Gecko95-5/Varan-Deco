package net.gecko.varandeco.item;

import net.gecko.varandeco.VaranDeco;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class DecoItems {
    public static final Item PLACEHOLDER_STICK = registerItem("placeholder_stick",
            new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(VaranDeco.MOD_ID, name),item);
    }

    public static void registerDecoItems() {
        VaranDeco.LOGGER.debug("Registering Items for" + VaranDeco.MOD_ID);
    }
}
