package com.gildedrose;

public class RegularItem implements UpdatableItem {
    private final Item item;

    public RegularItem(Item item){
        this.item = item;
    }

    @override
    public void update(){
        item.sellIn--;

        if(item.quality > 0){
            item.quality--;
        }

        if(item.sellIn < 0 && item.quality > 0){
            item.quality--;
        }
    }
}
