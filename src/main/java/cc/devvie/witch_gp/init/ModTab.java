package cc.devvie.witch_gp.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModTab extends CreativeTabs {
    public ModTab(String name) {
        super(name);
    }

    @Override
    public ItemStack createIcon() {
        return ItemInit.MEOW_ITEM.getDefaultInstance();
    }
}