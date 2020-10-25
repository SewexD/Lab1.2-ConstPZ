package com.sewex;
import java.io.Serializable;

public final class Item implements Comparable, Serializable {
    private String name;
    private float price;
    private int count;
    private float weight;

    public Item(String name, float price, int count, float weight) {
        this.name = name;
        this.price = price;
        this.count = count;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public float getWeight() {
        return weight;
    }

    public boolean equals(Item item) {
        return (this == item);
    }

    public Item clone(Item item) {
        return new Item(item.name, item.price, item.count, item.weight);
    }

    @Override
    public int hashCode() {
        int seed = 17;
        int result = seed * name.hashCode();
        result = seed * result + (int)price;
        result = seed * result + count;
        result = seed * result + (int)weight;
        return result;
    }

    @Override
    public String toString() {
        return name + " " + price + " " + count + " " + weight;
    }

    @Override
    public int compareTo(Object comparable) {
        Item item = (Item) comparable;
        if(item.equals(this)) return 1;
        return 0;
    }
}
