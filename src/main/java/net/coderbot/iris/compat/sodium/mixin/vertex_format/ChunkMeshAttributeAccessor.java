package net.coderbot.iris.compat.sodium.mixin.vertex_format;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import me.jellysquid.mods.sodium.client.render.chunk.format.ChunkMeshAttribute;

@Mixin(ChunkMeshAttribute.class)
public interface ChunkMeshAttributeAccessor {
	@Invoker(value = "<init>")
	static ChunkMeshAttribute createChunkMeshAttribute(String name, int ordinal) {
		throw new AssertionError();
	}
}
