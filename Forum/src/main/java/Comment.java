import java.time.LocalDateTime;

/**
 * Created by kriptozoyd on 27.07.2017.
 */
public class Comment {
    private String textComment;
    private LocalDateTime dateOfComment;
    private String author;

    public String getTextComment() {
        return textComment;
    }

    public void setTextComment(String textComment) {
        this.textComment = textComment;
    }

    public void setDateOfComment(LocalDateTime dateOfComment) {
        this.dateOfComment = dateOfComment;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
