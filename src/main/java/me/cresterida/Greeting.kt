package me.cresterida

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
class Greeting {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello(): String? {
        return "THis is kotlin,a major update"
    }
    @GET
    @Path("/kotlin")
    @Produces(MediaType.APPLICATION_JSON)
    fun kotlin() =
    mapOf<String,String>("hola" to "asa",
    "kiquetal" to "nowodays")
}
