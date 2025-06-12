
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package cn.org.qlm.www.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import cn.org.qlm.www.ModMod;

public class ModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ModMod.MODID);
	public static final RegistryObject<SoundEvent> GOUHUO = REGISTRY.register("gouhuo", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mod", "gouhuo")));
}
