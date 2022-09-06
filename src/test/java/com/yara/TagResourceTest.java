package com.yara;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class TagResourceTest {
	
	@Test
    public void testTagEndpointSuccessCase() throws JsonProcessingException {
		Set<Tag> tags = new LinkedHashSet<>();
		
		tags.add(new Tag("React5_temp001", "Reactor 5 - Cooling water temperature", "C", TagTypes.ANALOG));
		tags.add(new Tag("React5_press", "Reactor 5 - Top pressure", "", TagTypes.ANALOG));
		tags.add(new Tag("React5_phas", "Reactor 5 - Production Phases", "", TagTypes.STRING));
		
        given()
          .when().get("/api/v2/tags/xyz")
          .then()
             .statusCode(200)
             .body(is(new ObjectMapper().writeValueAsString(tags)));
    }
	
	@Test
    public void testTagEndpointFailedCase() throws JsonProcessingException {
		
        given()
          .when().get("/api/v2/tags")
          .then()
             .statusCode(404)
             .body(is("Historian name should be provided!"));
    }

}
