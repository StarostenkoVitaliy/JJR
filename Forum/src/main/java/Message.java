import java.time.LocalDateTime;

/**
 * Created by kriptozoyd on 27.07.2017.
 */
public class Message {
    private String textMessage;
    private LocalDateTime dateOfMessage;
    private String author;

    public String getTextMessage() {
        return textMessage;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    public void setDateOfMessage(LocalDateTime dateOfMessage) {
        this.dateOfMessage = dateOfMessage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
