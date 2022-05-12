package com.revature.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.GroceryItem;
import com.revature.services.GroceryService;
import io.javalin.http.Handler;

import java.util.List;

public class GroceryController {
    private GroceryService gs;
    private ObjectMapper om;
    public GroceryController(GroceryService gs){
        this.gs = gs;
        this.om = new ObjectMapper();
    }
    public Handler handleGetItems = ctx -> {
        List<GroceryItem> itemList = gs.getGroceryItems();
        String list = om.writeValueAsString(itemList);
        ctx.result(list);
    };
    public Handler handleAddItem = ctx -> {
        GroceryItem gItem = om.readValue(ctx.body(),GroceryItem.class);
        System.out.println(gItem);
        List<GroceryItem> itemList = gs.addGroceryItem(gItem.getItem());
        String item = om.writeValueAsString(itemList);
        ctx.result(item);
    };
}
