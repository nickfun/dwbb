package gs.nick;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class IndexResource {
    
    @GET
    @Produces("text/html")
    public String getPage() {
        return "Hello, world!";
    }

}
