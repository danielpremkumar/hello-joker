package com.nerdylegend.hello_joker;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("hello")
public class HelloResource {

    @Inject
    Greeting greeting;

    @GET
    public String hello() {

        return greeting.hello();
    }
}
