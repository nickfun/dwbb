package gs.nick;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
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
        // nothing
    }

    public void run(MyConfig config, Environment env) {
        env.jersey().register(new IndexResource());
        env.lifecycle().manage(new TimerManager());
    }

}

