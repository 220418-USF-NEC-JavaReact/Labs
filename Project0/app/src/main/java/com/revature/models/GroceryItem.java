package com.revature.models;

public class GroceryItem {
    private int id;
    private String item;

    public GroceryItem(){
    }
    public GroceryItem(int id, String item){
        this.id = id;
        this.item = item;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "GroceryItem{" +
                "id=" + id +
                ", item='" + item + '\'' +
                '}';
    }
}
