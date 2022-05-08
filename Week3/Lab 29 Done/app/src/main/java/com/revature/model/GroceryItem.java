package com.revature.model;

public class GroceryItem {

    private int elementId;

    private String elementText;

    public GroceryItem(String elementText) {
        this.elementText = elementText;
    }

    public GroceryItem(int elementId, String elementText) {
        this.elementId = elementId;
        this.elementText = elementText;
    }

    public int getElementId() {
        return elementId;
    }

    public void setElementId(int elementId) {
        this.elementId = elementId;
    }

    public String getElementText() {
        return elementText;
    }

    public void setElementText(String elementText) {
        this.elementText = elementText;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\" : " + elementId +
                ",\"content\" : \"" + elementText + '\"' +
                '}';
    }
}
