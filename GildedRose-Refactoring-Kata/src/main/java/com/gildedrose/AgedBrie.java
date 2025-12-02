package com.gildedrose;

public class AgedBrieItem implements UpdatableItem {

    private final Item item;

    public AgedBrieItem(Item item) {
        this.item = item;
    }

    @Override
    public void update() {
        item.sellIn--;

        if (item.quality < 50) {
            item.quality++;
        }

        if (item.sellIn < 0 && item.quality < 50) {
            item.quality++;
        }
    }
}

