package com.gildedrose;

class BackstagePass extends Item implements UpdatableItem {
    private final Item item;

    public BackstagePass(Item item){
        this.item = item;
    }

    @Override
    public void update() {
        item.sellIn--;

        if(item.sellIn < 0){
            item.quality = 0; //apres le concert
            return;
        }

        // Avant concert : augmentation progressive
        if (item.quality < 50) item.quality++;

        if (item.sellIn < 10 && item.quality < 50) item.quality++;

        if (item.sellIn < 5 && item.quality < 50) item.quality++;

    }
}
