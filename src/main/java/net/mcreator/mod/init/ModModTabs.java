
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mod.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.mod.ModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ModMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(ModModItems.AXE_1.get());
			tabData.accept(ModModItems.COPPERAXE.get());
			tabData.accept(ModModItems.COPPERHOE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(ModModItems.OBSIDIANARMOR_HELMET.get());
			tabData.accept(ModModItems.OBSIDIANARMOR_CHESTPLATE.get());
			tabData.accept(ModModItems.OBSIDIANARMOR_LEGGINGS.get());
			tabData.accept(ModModItems.OBSIDIANARMOR_BOOTS.get());
			tabData.accept(ModModItems.COPPERARROW.get());
			tabData.accept(ModModItems.COPPERARMOR_HELMET.get());
			tabData.accept(ModModItems.COPPERARMOR_CHESTPLATE.get());
			tabData.accept(ModModItems.COPPERARMOR_LEGGINGS.get());
			tabData.accept(ModModItems.COPPERARMOR_BOOTS.get());
		}
	}
}
