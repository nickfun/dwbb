package gs.nick.dwbb.application;

import gs.nick.IndexResource;
import gs.nick.TimerManager;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;
import org.slf4j.LoggerFactory;

public class MyApplication extends Application<MyConfig> {

    public static void main(String[] args) throws Exception {
        LoggerFactory.getLogger(MyApplication.class).info("pre-start");
        new MyApplication().run(args);
    }

    @Override public String getName() {
        return "dwbb";
    }

    public void initialize(Bootstrap<MyConfig> bootstrap) {
        bootstrap.addBundle(new ViewBundle());
    }

    public void run(MyConfig config, Environment env) {
        env.jersey().register(new IndexResource());
        env.lifecycle().manage(new TimerManager());
    }

}

