package gs.nick.data;

import java.util.Date;

public class EmailEntry {

    private final String email;
    private final String name;
    private final Date date;

    public EmailEntry(String email, String name, Date date) {
        this.email = email;
        this.name = name;
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }
    
    public String getDateStr() {
        return date.toString();
    }

}
