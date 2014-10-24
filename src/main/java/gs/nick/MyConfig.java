package gs.nick;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

public class MyConfig extends Configuration {

    @NotEmpty
    private String template;

    @NotEmpty
    private int emailTimer;

    @JsonProperty
    public String getTemplate() {
        return template;
    }

    @JsonProperty
    public void setTemplate(String template) {
        this.template = template;
    }

    @JsonProperty
    public void setEmailTimer(int timer) {
        this.emailTimer = timer;
    }

    @JsonProperty
    public int getEmailTimer() {
        return this.emailTimer;
    }

}
