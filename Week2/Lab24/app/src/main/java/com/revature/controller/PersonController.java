package com.revature.controller;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.revature.models.Address;
import com.revature.models.AddressHelper;
import com.revature.models.PersonHelper;
import com.revature.service.PersonServices;
import io.javalin.http.Handler;

public class PersonController {
    private PersonServices ps;
    private ObjectMapper oma;
    private ObjectMapper omp;
    private Address ao;

    public PersonController(PersonServices ps) {
        this.ps = ps;
    }

    public Handler handleCreate = (ctx) -> {
        AddressHelper ah = oma.readValue(ctx.body(), AddressHelper.class);

        System.out.println("Helloworld");

        ao = new Address(ah.lineOne, ah.city, ah.state, ah.zip, ah.country);

        PersonHelper ph = omp.readValue(ctx.body(), PersonHelper.class);
        ps.createPerson(ph.name, ph.age, ph.email, ph.socialsecurity, ao);

        ctx.status(201);
        ctx.result("Person Created");
    };
}
