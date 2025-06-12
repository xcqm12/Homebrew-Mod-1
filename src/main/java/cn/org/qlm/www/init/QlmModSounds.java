
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package cn.org.qlm.www.init;

import cn.org.qlm.www.QlmMod;

public class QlmModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, QlmMod.MODID);
	public static final RegistryObject<SoundEvent> GOUHUO = REGISTRY.register("gouhuo", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("qlm", "gouhuo")));
}
