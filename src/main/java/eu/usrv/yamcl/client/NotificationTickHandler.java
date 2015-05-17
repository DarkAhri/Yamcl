package eu.usrv.yamcl.client;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.client.Minecraft;

/**
 * Original source copied from BeyondRealityCore. All credits go to pauljoda for this code
 * @author pauljoda
 *
 */
public class NotificationTickHandler {
    public static GuiNotification guiNotification;

    @SubscribeEvent
    public void renderTick(TickEvent.RenderTickEvent event) {
        Minecraft mc = Minecraft.getMinecraft();

        if (mc.theWorld != null) {
            if(guiNotification == null)
                guiNotification = new GuiNotification(mc);
            guiNotification.update();
        }
    }
}