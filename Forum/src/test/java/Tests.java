import org.junit.Test;
import static org.junit.Assert.*;

public class Tests {
    @Test
    public void shouldTestAddTOTopicSection(){
        Section section = new Section();
        assertTrue(section.getTopics().isEmpty());
        section.addToTopics(new Topic());
        assertNotEquals(1,section.getTopics().size());
    }

}
