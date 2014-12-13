/*
 * Copyright (C) 2014 Dennis J. McWherter, Jr.
 *
 * This software may be modified and distributed under the terms of the MIT License.
 */
package com.deathbytape.jettyREST;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * TestApplication to configure our jersey container
 */
@ApplicationPath("test")
public class TestApplication extends ResourceConfig {
  public TestApplication() {
    packages("com.deathbytape.jettyREST");
  }
}
