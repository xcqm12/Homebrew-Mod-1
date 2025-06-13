
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package cn.org.qlm.www.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import cn.org.qlm.www.ModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ModMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(ModModItems.AXE_1.get());
			tabData.accept(ModModItems.COPPERAXE.get());
			tabData.accept(ModModItems.COPPERHOE.get());
			tabData.accept(ModModItems.COPPERPICKAXE.get());
			tabData.accept(ModModItems.COPPERSHEARS.get());
			tabData.accept(ModModItems.COPPERSHOVEL.get());
			tabData.accept(ModModItems.EMERALDAXE.get());
			tabData.accept(ModModItems.EMERALDPICKAXE.get());
			tabData.accept(ModModItems.EMERALDSHOVEL.get());
			tabData.accept(ModModItems.GLASSHOE.get());
			tabData.accept(ModModItems.GLASSPICKAXE.get());
			tabData.accept(ModModItems.GLASSSHOVEL.get());
			tabData.accept(ModModItems.HOE_1.get());
			tabData.accept(ModModItems.PAXEL.get());
			tabData.accept(ModModItems.PICKAXE_1.get());
			tabData.accept(ModModItems.SHOVEL_1.get());
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
			tabData.accept(ModModItems.COPPERSWORD.get());
			tabData.accept(ModModItems.EMERALDARMOR_HELMET.get());
			tabData.accept(ModModItems.EMERALDARMOR_CHESTPLATE.get());
			tabData.accept(ModModItems.EMERALDARMOR_LEGGINGS.get());
			tabData.accept(ModModItems.EMERALDARMOR_BOOTS.get());
			tabData.accept(ModModItems.EMERALDSWORD.get());
			tabData.accept(ModModItems.GLASSAXE.get());
			tabData.accept(ModModItems.GLASSARMOR_HELMET.get());
			tabData.accept(ModModItems.GLASSARMOR_CHESTPLATE.get());
			tabData.accept(ModModItems.GLASSARMOR_LEGGINGS.get());
			tabData.accept(ModModItems.GLASSARMOR_BOOTS.get());
			tabData.accept(ModModItems.GLASSSWORD.get());
			tabData.accept(ModModItems.PAXEL.get());
			tabData.accept(ModModItems.SWORD_1.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(ModModItems.GLASSINGOT.get());
			tabData.accept(ModModItems.GLASSSTICK.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(ModModItems.MUSICDISCGOUHUO.get());
		}
	}
}
