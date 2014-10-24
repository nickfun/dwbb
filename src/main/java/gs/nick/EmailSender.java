package gs.nick;

import org.slf4j.LoggerFactory;

public class EmailSender {

    public EmailSender() {
    }

    public boolean shouldSend() {
        return true;
    }

    public void send() {
        LoggerFactory.getLogger(EmailSender.class).info("Sending Email...");
    }
}
