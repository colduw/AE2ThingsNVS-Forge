package io.github.projectet.ae2things.data;

import io.github.projectet.ae2things.AE2Things;

import net.minecraft.core.RegistrySetBuilder;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = AE2Things.MOD_ID)
public class AE2ThingsDataGenerator {
    @SubscribeEvent
    public static void onGatherData(GatherDataEvent.Server event) {
        var registries = new RegistrySetBuilder();
        var pack = event.getDefaultPackGenerator();

        registries.add(CraftingRecipeProvider.create());

        // Recipes
        pack.createReloadableRegistryObjects(registries);
    }
}
