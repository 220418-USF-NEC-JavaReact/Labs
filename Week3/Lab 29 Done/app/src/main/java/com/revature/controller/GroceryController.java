package com.revature.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.model.GroceryItem;
import com.revature.model.GroceryObject;
import com.revature.service.GroceryService;
import io.javalin.http.Handler;

import java.util.List;

public class GroceryController {

    private GroceryService gs;

    private ObjectMapper om;

    public GroceryController(GroceryService gs) {
        this.gs = gs;
        this.om  = new ObjectMapper();
    }

    public Handler handleCreate = ctx -> {
        GroceryObject go = om.readValue(ctx.body(), GroceryObject.class);
        Integer id = gs.createItem(go.content);
        ctx.result(id.toString());
    };

    public Handler handleRead = ctx -> {
        GroceryObject go = om.readValue(ctx.body(), GroceryObject.class);
        String content = gs.readItem(go.id);
        ctx.result(content);
    };

    public Handler handleUpdate = ctx -> {
        GroceryObject go = om.readValue(ctx.body(), GroceryObject.class);
        gs.updateItem(go.id, go.content);
        ctx.result("Item Updated");
    };

    public Handler handleDelete = ctx -> {
        int id = Integer.parseInt(ctx.pathParam("id"));
        gs.deleteItem(id);
        ctx.result("Item Deleted");
    };

    public Handler handleReadAllListItems = ctx -> {
        List<GroceryItem> theList = gs.readAllGroceryItems();
        ctx.result(theList.toString());
    };
}
