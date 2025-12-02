package com.gildedrose;

public class GildedRose {
    private UpdatableItem[] items;

    public GildedRose(Item[] items) {
        // Cree un tableau de la bonne taille
        this.items = new UpdatableItem[items.length];

        // Le remplir
        for (int i =0 ; i < items.length ; i++ ){
            this.items = ItemFactory.create(items[i]);
        }
    }

   /* public GildedRose(Items[] items){
        this.items = Arrays.stream(items)
            .map(ItemFactory::create)
            .toArray(UpdatableItem[]::new);

    }

    //Ou

    public GildedRose(Item[] items) {
        List<UpdatableItem> tempList = new ArrayList<>();
        for(int i = 0; i < items.length; i++){
            UpdatableItem transforamtion = ItemFactory.create(items[i]);
            tempList.add(transforamtion);
        }
        // Convertis la liste en tableau du nouveau type
        this.items = tempList.toArray(new UpdatableItem[0]);
    } */

    public void updateQuality() {
        for (UpdatableItem i : items) {
            i.update();
        }
    }
}


