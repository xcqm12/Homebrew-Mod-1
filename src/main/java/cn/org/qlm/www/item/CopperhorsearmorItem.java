
package cn.org.qlm.www.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CopperhorsearmorItem extends Item {
	public CopperhorsearmorItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
