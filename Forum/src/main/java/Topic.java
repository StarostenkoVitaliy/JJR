import java.time.LocalDateTime;


public class Topic {
    private String name;
    private LocalDateTime creationDate;
    private String author;
    private int numberOfMessenger;
    private LocalDateTime lastMessage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDateTime getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(LocalDateTime lastMessage) {
        this.lastMessage = lastMessage;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfMessenger() {
        return numberOfMessenger;
    }

    public void setNumberOfMessenger(int numberOfMessenger) {
        this.numberOfMessenger = numberOfMessenger;
    }
}