
package cn.org.qlm.www.item;

public class CopperhorsearmorItem extends Item {
	public CopperhorsearmorItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0f;
	}
}
