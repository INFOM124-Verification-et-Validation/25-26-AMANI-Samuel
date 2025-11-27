package com.gildedrose;

public abstract Updatable implements UpdatableItem{
    protected final Item item;

    protected Updatable(Item item){
        this.item = item;
    }

    protected void increaseQuality(int value){
        item.quality = Math.min(50, item.quality + value);
    }

    protected void decreaseQuality(int value){
        item.quality = Math.max(0, item.quality - value);
    }

    protected void decreaseSellIn(){
        item.sellIn--;
    }

}
