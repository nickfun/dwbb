package gs.nick;

import gs.nick.dwbb.models.EmailEntry;
import gs.nick.dwbb.models.TestData;
import gs.nick.dwbb.views.BaseView;
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
    @Produces(MediaType.TEXT_HTML)
    public BaseView getPage() {
        BaseView v = new BaseView("index.ftl");
        oLog.debug("I made a BaseView :)");
        return v;
    }

    @GET
    @Path("/email")
    @Produces(MediaType.APPLICATION_JSON)
    public EmailEntry getEmail() {
        oLog.info("/email resource is being accessed");
        EmailEntry e = new EmailEntry();
        e.date = new Date(2014, 11, 4);
        e.name = "John Smith";
        e.email = "user@domain.com";
        return e;
    }

    @GET
    @Path("/test")
    @Produces(MediaType.APPLICATION_JSON)
    public TestData getData() {
        TestData d = new TestData();
        d.id = 123;
        d.name = "nick";
        d.email = "hello@nick.gs";
        d.favoriteNumber = 17.17;
        return d;
    }

}
