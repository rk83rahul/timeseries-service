package com.yara;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/api/v2/tags")
public class TagResource {
	
	
	private static final String validHistorianName= "xyz";
	
	private final Set<Tag> tags = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));
	
	public TagResource(){
		tags.add(new Tag("React5_temp001", "Reactor 5 - Cooling water temperature", "C", TagTypes.ANALOG));
		tags.add(new Tag("React5_press", "Reactor 5 - Top pressure", "", TagTypes.ANALOG));
		tags.add(new Tag("React5_phas", "Reactor 5 - Production Phases", "", TagTypes.STRING));
	}
	
 	@GET
 	@Path("{historianName}")
    public Response getTagMetadata(@PathParam("historianName") String historianName) {  
 		
 		if(historianName.equals(validHistorianName)) {
 			return Response.ok(tags).build();
 		}else {
 			return Response.serverError().entity("Historian name is invalid!").build();
 		}
 		
    }
 	
 	@GET
    public Response getTagMetadata() {        
 		return Response.status(Status.NOT_FOUND).entity("Historian name should be provided!").build();
    }

}
