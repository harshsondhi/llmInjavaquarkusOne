package org.acme.getting.started.llmservice.rest;


import jakarta.inject.Inject;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.acme.getting.started.llmservice.services.PoemAiService;
import org.jboss.resteasy.reactive.RestQuery;


@Path("/poem")
@Produces(MediaType.TEXT_PLAIN)
public class PoemController {
    @Inject
    PoemAiService poemAiService;

    @GET
    public String writeSimplePoem(@RestQuery String topic, @RestQuery @DefaultValue("10") int lines) {
        return poemAiService.writePoem(topic,lines);
    }
}
