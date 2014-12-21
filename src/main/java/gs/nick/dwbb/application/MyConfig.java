
package gs.nick.dwbb.application;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;


public class MyConfig extends Configuration {

    @NotEmpty
    private String template;


    private Integer emailTimer;

    @JsonProperty
    public String getTemplate() {
        return template;
    }

    @JsonProperty
    public void setTemplate(String template) {
        this.template = template;
    }

    @JsonProperty
    public void setEmailTimer(Integer timer) {
        this.emailTimer = timer;
    }

    @JsonProperty
    public Integer getEmailTimer() {
        return this.emailTimer;
    }

}
