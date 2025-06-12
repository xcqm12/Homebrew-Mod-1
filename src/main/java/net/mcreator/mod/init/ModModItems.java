
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.mod.item.ObsidianarmorItem;
import net.mcreator.mod.item.CopperhorsearmorItem;
import net.mcreator.mod.item.CopperhoeItem;
import net.mcreator.mod.item.CopperaxeItem;
import net.mcreator.mod.item.CopperarrowItem;
import net.mcreator.mod.item.CopperarmorItem;
import net.mcreator.mod.item.Axe1Item;
import net.mcreator.mod.ModMod;

public class ModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ModMod.MODID);
	public static final RegistryObject<Item> AXE_1 = REGISTRY.register("axe_1", () -> new Axe1Item());
	public static final RegistryObject<Item> OBSIDIANARMOR_HELMET = REGISTRY.register("obsidianarmor_helmet", () -> new ObsidianarmorItem.Helmet());
	public static final RegistryObject<Item> OBSIDIANARMOR_CHESTPLATE = REGISTRY.register("obsidianarmor_chestplate", () -> new ObsidianarmorItem.Chestplate());
	public static final RegistryObject<Item> OBSIDIANARMOR_LEGGINGS = REGISTRY.register("obsidianarmor_leggings", () -> new ObsidianarmorItem.Leggings());
	public static final RegistryObject<Item> OBSIDIANARMOR_BOOTS = REGISTRY.register("obsidianarmor_boots", () -> new ObsidianarmorItem.Boots());
	public static final RegistryObject<Item> COPPERARROW = REGISTRY.register("copperarrow", () -> new CopperarrowItem());
	public static final RegistryObject<Item> COPPERAXE = REGISTRY.register("copperaxe", () -> new CopperaxeItem());
	public static final RegistryObject<Item> COPPERARMOR_HELMET = REGISTRY.register("copperarmor_helmet", () -> new CopperarmorItem.Helmet());
	public static final RegistryObject<Item> COPPERARMOR_CHESTPLATE = REGISTRY.register("copperarmor_chestplate", () -> new CopperarmorItem.Chestplate());
	public static final RegistryObject<Item> COPPERARMOR_LEGGINGS = REGISTRY.register("copperarmor_leggings", () -> new CopperarmorItem.Leggings());
	public static final RegistryObject<Item> COPPERARMOR_BOOTS = REGISTRY.register("copperarmor_boots", () -> new CopperarmorItem.Boots());
	public static final RegistryObject<Item> COPPERHOE = REGISTRY.register("copperhoe", () -> new CopperhoeItem());
	public static final RegistryObject<Item> COPPERHORSEARMOR = REGISTRY.register("copperhorsearmor", () -> new CopperhorsearmorItem());
	// Start of user code block custom items
	// End of user code block custom items
}
