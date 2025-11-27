package com.gildedrose;

public class Factory () {
    public static UpdatableItem create (Item item) {
        switch (item.name){
            case "Age Brie" :
                return new AgedBrie(item);
            case "Backstage passes to a TAFKAL80ETC concert" :
                return new BackstagePass(item);
            case "Sulfuras, Hand of Ragnaros" :
                return new Sulfuras(item);
            default :
                return new RegularItem(item);
        }
    }
}
