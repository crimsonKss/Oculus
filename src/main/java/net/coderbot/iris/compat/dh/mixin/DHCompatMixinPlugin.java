package net.coderbot.iris.compat.dh.mixin;

import net.minecraftforge.fml.loading.FMLLoader;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import java.util.List;
import java.util.Set;

public class DHCompatMixinPlugin implements IMixinConfigPlugin {
    public static boolean isDHLoaded;

    @Override
    public void onLoad(String mixinPackage) {
        isDHLoaded = FMLLoader.getLoadingModList().getModFileById("distanthorizons") != null;
    }

    @Override
    public String getRefMapperConfig() {
        return null;
    }

    @Override
    public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
        return isDHLoaded;
    }

    @Override
    public void acceptTargets(Set<String> targets, Set<String> otherTargets) {

    }

    @Override
    public List<String> getMixins() {
        return null;
    }

    @Override
    public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo iMixinInfo) {

    }

    @Override
    public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo iMixinInfo) {

    }
}
