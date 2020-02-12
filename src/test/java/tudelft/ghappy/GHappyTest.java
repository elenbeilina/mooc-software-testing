package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    private GHappy gHappy;

    @BeforeEach
    public void initialize() {
        this.gHappy = new GHappy();
    }

    @Test
    public void oneGIsHappy() {
        String str = "xxggxx";
        Assertions.assertTrue(gHappy.gHappy(str));
    }

    @Test
    public void notAllGHappy() {
        String str = "xxggyygxx";
        Assertions.assertFalse(gHappy.gHappy(str));
    }

    @Test
    public void gIsUnhappy() {
        String str = "xxgxx";
        Assertions.assertFalse(gHappy.gHappy(str));
    }
}
