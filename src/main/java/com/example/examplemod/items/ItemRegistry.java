package com.example.examplemod.items;

import com.example.examplemod.items.upgrades.ItemUpgradeBase;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;

public class ItemRegistry
{
    public static void onItemRegistryReady(RegistryEvent.Register<Item> e)
    {
        ItemUpgradeBase.onItemRegistryReady(e);
    }
}
