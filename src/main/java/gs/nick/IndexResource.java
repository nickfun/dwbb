package gs.nick;

import gs.nick.data.EmailEntry;
import java.util.Date;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/")
public class IndexResource {

    private Logger oLog;

    public IndexResource() {
	oLog = LoggerFactory.getLogger(IndexResource.class);
    }
    
    @GET
    @Produces("text/html")
    public String getPage() {
	oLog.info("/ resource is being accessed");
        return "Hello, world!";
    }
    
    @GET
    @Path("/email")
    @Produces("application/json")
    public EmailEntry getEmail() {
	oLog.info("/email resource is being accessed");
        return new EmailEntry("user@domain.com", "John Smith", new Date(2014, 11, 4));
    }

}
