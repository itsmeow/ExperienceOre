package com.cazsius.experienceore.blocks;

import com.cazsius.experienceore.ConfigData;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.common.extensions.IForgeBlockState;
import sun.security.krb5.Config;

public class ExperienceOreBlock extends Block {

    int oreXpDrop = ConfigData.SERVER.oreXpDrop.get();

    public ExperienceOreBlock() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.METAL)
                .hardnessAndResistance(2.0F)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(1)
        );
        setRegistryName("experienceore");
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader world, BlockPos pos, int fortune, int silktouch) {
        return this.oreXpDrop;
    }
}