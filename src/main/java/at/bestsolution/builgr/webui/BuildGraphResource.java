package at.bestsolution.builgr.webui;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

@Path("/graphs")
public class BuildGraphResource {
    @Inject
    Template graphs;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get() {
        return graphs.instance();  
    }
}