/*
 * Copyright (C) 2014 Dennis J. McWherter, Jr.
 *
 * This software may be modified and distributed under the terms of the MIT License.
 */
package com.deathbytape.jettyREST;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Hello-world servlet to show and example usage of Jersey and Jetty
 * with pure Servlet 3.0.
 */
@Path("hello")
public class HelloServlet {
  @GET
  @Path("{name}")
  @Produces(MediaType.TEXT_HTML)
  public Response helloName(@PathParam("name") String name) {
    if(name != null) {
      return Response.status(200)
              .entity("Hello, " + name)
              .build();
    }
    return Response.status(404).build();
  }
}
