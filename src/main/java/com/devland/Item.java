package com.devland;

public class Item {
    public int itemId;
    public String itemName;
    public User owner;

    public Item() {
        super();
    }

    public Item(final int itemId, final String itemName, final User owner) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.owner = owner;
    }
    
    // API

    public int getId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public User getOwner() {
        return owner;
    }
}
