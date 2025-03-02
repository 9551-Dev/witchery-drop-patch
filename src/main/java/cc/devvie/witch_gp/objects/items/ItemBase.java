package cc.devvie.witch_gp.objects.items;

import cc.devvie.witch_gp.WitchGP;
import cc.devvie.witch_gp.init.ItemInit;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
    public ItemBase(String name) {
        this.setRegistryName(name);
        this.setTranslationKey(name);
        this.setCreativeTab(WitchGP.MOD_TAB);

        ItemInit.MOD_ITEMS.add(this);
    }

    @Override
    public void register() {
        WitchGP.proxy.registerItemRenderer(this,0,"inventory");
    }
}
