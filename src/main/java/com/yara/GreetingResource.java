package com.yara;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello-resteasy")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello Time Series Data";
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String test() {
        return "Hello git format-patch";
    }

    
}