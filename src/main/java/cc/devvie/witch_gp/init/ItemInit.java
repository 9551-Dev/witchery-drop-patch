package cc.devvie.witch_gp.init;

import cc.devvie.witch_gp.objects.itembehavior.MeowItemBehavior;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final List<Item> MOD_ITEMS = new ArrayList<>();

    public static final Item MEOW_ITEM = new MeowItemBehavior("meow");
}
