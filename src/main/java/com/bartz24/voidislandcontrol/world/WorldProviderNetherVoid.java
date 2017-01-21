package com.bartz24.voidislandcontrol.world;

import net.minecraft.world.WorldProviderHell;
import net.minecraft.world.chunk.IChunkGenerator;

public class WorldProviderNetherVoid extends WorldProviderHell
{

	@Override
	public IChunkGenerator createChunkGenerator()
	{
		return new ChunkGeneratorNetherVoid(world, world.getSeed());
	}

}
