package io.github.darkkronicle.advancedchatlog.listener;

import fi.dy.masa.malilib.interfaces.IWorldLoadListener;
import io.github.darkkronicle.advancedchatlog.util.LogChatMessageSerializer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.world.ClientWorld;

public class WorldListener implements IWorldLoadListener {

	@Override
	public void onWorldLoadPost(ClientWorld worldBefore, ClientWorld worldAfter, MinecraftClient mc) {
		LogChatMessageSerializer.getOrCreateTextSerializer();
	}

}
