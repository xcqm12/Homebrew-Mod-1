
package cn.org.qlm.www.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundEvent;

import com.google.common.collect.Iterables;

import cn.org.qlm.www.procedures.EmeraldarmorXueZiShiJianMeiYouXiKeProcedure;
import cn.org.qlm.www.procedures.EmeraldarmorXiongJiaShiJianMeiYouXiKeProcedure;
import cn.org.qlm.www.procedures.EmeraldarmorTouKuiShiJianMeiYouXiKeProcedure;
import cn.org.qlm.www.procedures.EmeraldarmorHuTuiShiJianMeiYouXiKeProcedure;

public abstract class EmeraldarmorItem extends ArmorItem {
	public EmeraldarmorItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 1024;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{1024, 1024, 1024, 1024}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 90;
			}

			@Override
			public SoundEvent getEquipSound() {
				return SoundEvents.EMPTY;
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}

			@Override
			public String getName() {
				return "emeraldarmor";
			}

			@Override
			public float getToughness() {
				return 1024f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, type, properties);
	}

	public static class Helmet extends EmeraldarmorItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties().fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mod:textures/models/armor/emerald_layer_1.png";
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean isFoil(ItemStack itemstack) {
			return true;
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				EmeraldarmorTouKuiShiJianMeiYouXiKeProcedure.execute(entity);
			}
		}
	}

	public static class Chestplate extends EmeraldarmorItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mod:textures/models/armor/emerald_layer_1.png";
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean isFoil(ItemStack itemstack) {
			return true;
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				EmeraldarmorXiongJiaShiJianMeiYouXiKeProcedure.execute(entity);
			}
		}
	}

	public static class Leggings extends EmeraldarmorItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mod:textures/models/armor/emerald_layer_2.png";
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean isFoil(ItemStack itemstack) {
			return true;
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				EmeraldarmorHuTuiShiJianMeiYouXiKeProcedure.execute(entity);
			}
		}
	}

	public static class Boots extends EmeraldarmorItem {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties().fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "mod:textures/models/armor/emerald_layer_1.png";
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean isFoil(ItemStack itemstack) {
			return true;
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				EmeraldarmorXueZiShiJianMeiYouXiKeProcedure.execute(entity);
			}
		}
	}
}
