package com.example.examplemod.items.upgrades;

import com.example.examplemod.references.Reference;
import com.mowmaster.pedestals.api.upgrade.IUpgradeBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ItemUpgradeBase extends Item implements IUpgradeBase {
    public ItemUpgradeBase(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public Boolean canAcceptOpSpeed() {
        return true;
    }

    @Override
    public Boolean canAcceptCapacity() {
        return true;
    }

    @Override
    public Boolean canAcceptMagnet() {
        return false;
    }

    @Override
    public Boolean canAcceptRange() {
        return false;
    }

    @Override
    public Boolean canAcceptAdvanced() {
        return true;
    }

    @Override
    public Boolean canAcceptArea() {
        return false;
    }

    @Override
    public boolean isEnchantable(ItemStack p_77616_1_) {
        return true;
    }

    @Override
    public int getItemEnchantability(ItemStack stack) {
        return 10;
    }

    public static final Item DEFAULT = new ItemUpgradeBase(new Item.Properties().stacksTo(64)).setRegistryName(new ResourceLocation(Reference.MODID, "default"));

    @SubscribeEvent
    public static void onItemRegistryReady(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(DEFAULT);
    }
}
