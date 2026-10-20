package io.github.projectet.ae2things.client;

import javax.annotation.Nullable;

import com.mojang.serialization.MapCodec;

import io.github.projectet.ae2things.AE2Things;
import io.github.projectet.ae2things.item.DISKDrive;
import net.minecraft.client.color.item.ItemTintSource;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

@Mod(value = AE2Things.MOD_ID, dist = Dist.CLIENT)
public class AE2ThingsClient {
    public AE2ThingsClient(IEventBus eventBus) {
        eventBus.addListener(AE2ThingsClient::registerItemColors);
    }

    public static void registerItemColors(RegisterColorHandlersEvent.ItemTintSources event) {
        event.register(AE2Things.id("disk_color"), DiskColor.MAP_CODEC);
    }

    public record DiskColor() implements ItemTintSource {
        public static final MapCodec<DiskColor> MAP_CODEC = MapCodec.unit(new DiskColor());

        @Override 
        public int calculate(ItemStack var1, @Nullable ClientLevel var2, @Nullable LivingEntity var3) {
            return DISKDrive.getColor(var1, 1);
        }

        public MapCodec<DiskColor> type() {
            return MAP_CODEC;
        }
    }
}
