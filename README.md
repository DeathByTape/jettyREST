jettyREST
=========

jettyREST is an example on how to use Jetty + JAX-RS + Jersey + Servlet 3.0 as a tech stack for a RESTful API. It is very basic and
only contains a simple setup scaffolding (i.e. it's not necessarily an example of building a real RESTful service). In any case,
you can read the accompanying blog post here:
http://deathbytape.com/2014/12/descriptor-less-servlet-3-0-jetty-jersey-jax-rs-i-e-no-web-xml.html

Compile
=======

```bash
mvn clean package
```

Usage
=====

Copy the compiled .war file to your Jetty server's "webapps" directory. Then start Jetty:

```bash
java -jar start.jar
```

If running on localhost, you can view an example here:
http://localhost:8080/MyService-1.0-SNAPSHOT/test/hello/YourName
