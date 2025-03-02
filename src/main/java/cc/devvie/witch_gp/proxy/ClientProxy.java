package cc.devvie.witch_gp.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerItemRenderer(Item item, int damage, String id) {
        ModelLoader.setCustomModelResourceLocation(item,damage,new ModelResourceLocation(item.getRegistryName(),id));
    }
}
