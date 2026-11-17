package org.teamvikcee.aetherdrift.item

import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceKey
import net.minecraft.world.item.Item
import org.teamvikcee.aetherdrift.Aetherdrift
import net.neoforged.neoforge.registries.DeferredRegister

import thedarkcolour.kotlinforforge.neoforge.forge.getValue

object ModItems {
    val REGISTRY = DeferredRegister.createItems(Aetherdrift.ID)

    val EXAMPLE_BLOCK by REGISTRY.register("example_block") { rName ->
        Item(Item.Properties().setId(ResourceKey.create(Registries.ITEM, rName)))
    }
}
