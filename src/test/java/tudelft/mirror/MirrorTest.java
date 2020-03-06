package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MirrorTest {
    private Mirror mirror;

    @BeforeEach
    public void initialize() {
        this.mirror = new Mirror();
    }

    @Test
    public void testTwoLetterEnd() {
        String expected = "ab";
        String given = "abXYZba";
        Assertions.assertEquals(expected, mirror.mirrorEnds(given));
    }

    @Test
    public void testOneLetterEnd() {
        String expected = "a";
        String given = "aba";
        Assertions.assertEquals(expected, mirror.mirrorEnds(given));
    }

    @Test
    public void testNoLetterEnd() {
        String expected = "";
        String given = "abc";
        Assertions.assertEquals(expected, mirror.mirrorEnds(given));
    }

    @ParameterizedTest(name = "given={0}, expected={1}")
    @CsvSource({"abc,''", "aba,a", "abXYZba,ab"})
    public void parameterizedTest(String given, String expected) {
        Assertions.assertEquals(expected, mirror.mirrorEnds(given));
    }
}
