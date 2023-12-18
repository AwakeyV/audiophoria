package net.awakey.audiophoria.item;
import net.awakey.audiophoria.Audiophoria;
import net.awakey.audiophoria.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item VIOLENT_MUSIC_DISC = registerItem("violent_music_disc",
            new MusicDiscItem(7, ModSounds.VIOLENT, new FabricItemSettings().maxCount(1), 205));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {










    }




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Audiophoria.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Audiophoria.LOGGER.info("Registering Mod Items for " + Audiophoria.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }

}
