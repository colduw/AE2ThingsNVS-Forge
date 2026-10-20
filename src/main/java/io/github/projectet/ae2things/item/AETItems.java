package io.github.projectet.ae2things.item;

import static io.github.projectet.ae2things.AE2Things.id;

import java.util.List;
import java.util.function.Supplier;

import io.github.projectet.ae2things.AE2Things;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;

import appeng.api.client.StorageCellModels;
import appeng.core.definitions.AEItems;

public class AETItems {

    public static final DeferredItem<Item> DISK_HOUSING = AE2Things.ITEMS.registerItem("disk_housing", p -> new Item(p.stacksTo(64).fireResistant()));
    public static final DeferredItem<Item> DISK_DRIVE_1K = AE2Things.ITEMS.registerItem("disk_drive_1k", p -> new DISKDrive(p, AEItems.CELL_COMPONENT_1K.asItem(), 1, 0.5f));
    public static final DeferredItem<Item> DISK_DRIVE_4K = AE2Things.ITEMS.registerItem("disk_drive_4k", p -> new DISKDrive(p, AEItems.CELL_COMPONENT_4K.asItem(), 4, 1.0f));
    public static final DeferredItem<Item> DISK_DRIVE_16K = AE2Things.ITEMS.registerItem("disk_drive_16k", p -> new DISKDrive(p, AEItems.CELL_COMPONENT_16K.asItem(), 16, 1.5f));
    public static final DeferredItem<Item> DISK_DRIVE_64K = AE2Things.ITEMS.registerItem("disk_drive_64k", p -> new DISKDrive(p, AEItems.CELL_COMPONENT_64K.asItem(), 64, 2.0f));
    public static final DeferredItem<Item> DISK_DRIVE_256K = AE2Things.ITEMS.registerItem("disk_drive_256k", p -> new DISKDrive(p, AEItems.CELL_COMPONENT_256K.asItem(), 256, 2.5f));

    public static final List<Supplier<Item>> DISK_DRIVES = List.of(
            DISK_DRIVE_1K,
            DISK_DRIVE_4K,
            DISK_DRIVE_16K,
            DISK_DRIVE_64K,
            DISK_DRIVE_256K);

    public static final Identifier MODEL_DISK_DRIVE_1K = id("block/disk_1k");
    public static final Identifier MODEL_DISK_DRIVE_4K = id("block/disk_4k");
    public static final Identifier MODEL_DISK_DRIVE_16K = id("block/disk_16k");
    public static final Identifier MODEL_DISK_DRIVE_64K = id("block/disk_64k");
    public static final Identifier MODEL_DISK_DRIVE_256K = id("block/disk_256k");

    public static void init() {
        // init static
    }

    public static void commonSetup() {
        StorageCellModels.registerModel(DISK_DRIVE_1K.get(), MODEL_DISK_DRIVE_1K);
        StorageCellModels.registerModel(DISK_DRIVE_4K.get(), MODEL_DISK_DRIVE_4K);
        StorageCellModels.registerModel(DISK_DRIVE_16K.get(), MODEL_DISK_DRIVE_16K);
        StorageCellModels.registerModel(DISK_DRIVE_64K.get(), MODEL_DISK_DRIVE_64K);
        StorageCellModels.registerModel(DISK_DRIVE_256K.get(), MODEL_DISK_DRIVE_256K);
    }
}
