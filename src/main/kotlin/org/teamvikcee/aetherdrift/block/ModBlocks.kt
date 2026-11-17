package org.teamvikcee.aetherdrift.block

import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceKey
import org.teamvikcee.aetherdrift.Aetherdrift
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.state.BlockBehaviour
import net.neoforged.neoforge.registries.DeferredRegister

import thedarkcolour.kotlinforforge.neoforge.forge.getValue

object ModBlocks {
    val REGISTRY = DeferredRegister.createBlocks(Aetherdrift.ID)

    val EXAMPLE_BLOCK by REGISTRY.register("example_block") { rName ->
        Block(BlockBehaviour.Properties.of().lightLevel { 15 }.strength(3.0f).setId(ResourceKey.create(Registries.BLOCK, rName)))
    }
}
