import java.time.LocalDateTime;

/**
 * Created by kriptozoyd on 27.07.2017.
 */
public class Section {
    private String name;
    private LocalDateTime creationDate;
    private String author;

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

    public void setAuthor(String author) {
        this.author = author;
    }

    public void getTopics() {
    }

    public void addToTopics(Topic topic) {
    }
}
