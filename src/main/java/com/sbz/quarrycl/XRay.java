package com.sbz.quarrycl;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.lwjgl.input.Keyboard;

public class XRay extends KeyBinding {

    public XRay() {
        super("X-Ray-Toggle", Keyboard.KEY_X, "Quarry");
    }

    @SubscribeEvent
    public void onKeyPressed(InputEvent.KeyInputEvent event){
    }
}
