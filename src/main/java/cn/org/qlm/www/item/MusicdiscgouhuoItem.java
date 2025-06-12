
package cn.org.qlm.www.item;

public class MusicdiscgouhuoItem extends RecordItem {
	public MusicdiscgouhuoItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("qlm:gouhuo")), new Item.Properties().stacksTo(1).rarity(Rarity.COMMON), 4000);
	}
}
