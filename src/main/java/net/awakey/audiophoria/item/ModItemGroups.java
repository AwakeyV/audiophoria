package net.awakey.audiophoria.item;
import net.awakey.audiophoria.Audiophoria;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Audiophoria.MOD_ID, "violent"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.violent"))
                    .icon(() -> new ItemStack(ModItems.VIOLENT_MUSIC_DISC)).entries((displayContext, entries) -> {
                        entries.add(ModItems.VIOLENT_MUSIC_DISC);
                    }).build());

    public static void registerItemGroups() {
        Audiophoria.LOGGER.info("Registering Item Groups for " + Audiophoria.MOD_ID);
    }
}