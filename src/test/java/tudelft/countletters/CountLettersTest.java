package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWordsWithS() {
        int words = new CountLetters().count("cats|dollar");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats!dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void allWordsDoesNotMatch() {
        int words = new CountLetters().count("cat|dog");
        Assertions.assertEquals(0, words);
    }
}