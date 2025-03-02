package cc.devvie.witch_gp;

import cc.devvie.witch_gp.init.ModTab;
import cc.devvie.witch_gp.objects.registry.CatSoundRegistry;
import cc.devvie.witch_gp.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import zone.rong.mixinbooter.ILateMixinLoader;

import java.util.ArrayList;
import java.util.List;

@Mod(modid = Tags.MOD_ID, name = Tags.MOD_NAME, version = Tags.VERSION)
public class WitchGP implements ILateMixinLoader {

    public static final Logger LOGGER = LogManager.getLogger(Tags.MOD_NAME);
    public static final CreativeTabs MOD_TAB = new ModTab("devvie_blesky_fix");
    public static final CatSoundRegistry cat_sounds = new CatSoundRegistry();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOGGER.info("Hello From {}!", Tags.MOD_NAME);
    }

    @SidedProxy(
            serverSide = "cc.devvie.witch_gp.proxy.CommonProxy",
            clientSide = "cc.devvie.witch_gp.proxy.ClientProxy"
    )
    public static CommonProxy proxy;

    @Override
    public List<String> getMixinConfigs() {
        List<String> configs = new ArrayList<>();
        configs.add("mixins.witch_gp.json");
        return configs;
    }
}