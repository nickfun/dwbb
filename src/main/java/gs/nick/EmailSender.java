package gs.nick;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class EmailSender {

    private Logger log;

    public EmailSender() {
        log = LoggerFactory.getLogger(EmailSender.class);
    }

    public boolean shouldSend() {
        return true;
    }

    public void send() {
        log.info("Sending Email...");
    }
}
