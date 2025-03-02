package cc.devvie.witch_gp.objects.itembehavior;

import cc.devvie.witch_gp.WitchGP;
import cc.devvie.witch_gp.objects.items.ItemBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class MeowItemBehavior extends ItemBase {
    public MeowItemBehavior(String name) {
        super(name);
    }

    private static final Random random_gen = new Random();

    private static void triggerMeow(EntityLivingBase entity) {
        int rand_sound = random_gen.nextInt(WitchGP.cat_sounds.list.size());

        entity.playSound(
                WitchGP.cat_sounds.list.get(rand_sound),
                2,
                1
        );
    }

    @Override
    public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
        triggerMeow(entityLiving);

        return super.onEntitySwing(entityLiving, stack);
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        triggerMeow(player);

        return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
    }
}
