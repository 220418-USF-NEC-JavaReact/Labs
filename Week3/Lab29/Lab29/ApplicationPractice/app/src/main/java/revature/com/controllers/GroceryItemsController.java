package revature.com.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import revature.com.models.RegisterGroceryItems;
import revature.com.services.GroceryItemsServices;
import io.javalin.http.Handler;


public class GroceryItemsController {

    private GroceryItemsServices gs;

    private ObjectMapper om;

    public GroceryItemsController(GroceryItemsServices gs){
        this.gs = gs;
        this.om = new ObjectMapper();

    }

    public Handler handleCreateItems = (ctx) -> {
        RegisterGroceryItems rgi = om.readValue(ctx.body(), RegisterGroceryItems.class);
        gs.createItems(rgi.name, rgi.price);
        ctx.status(200);
        ctx.result("Create the items into database");
    };

    public Handler handlerShowAll = (ctx) -> {

        ctx.result(om.writeValueAsString(gs.showAllItem()));


    };

    public Handler handlerDelete = (ctx) ->{
        RegisterGroceryItems rgi = om.readValue(ctx.body(), RegisterGroceryItems.class);
        gs.deleteItem(rgi.name, rgi.price);

    };

    public Handler handlerUpdatePrice = (ctx) -> {
        RegisterGroceryItems rgi = om.readValue(ctx.body(), RegisterGroceryItems.class);
        gs.updateItemPrice(rgi.name, rgi.price);
    };
}
