package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {

    private CaesarShiftCipher caesarShiftCipher;

    @BeforeEach
    public void initialize() {
        this.caesarShiftCipher = new CaesarShiftCipher();
    }

    @Test
    public void encryptWithShift3() {
        String str = "abc";
        String expectedEncryptedStr = "def";
        Assertions.assertEquals(expectedEncryptedStr,caesarShiftCipher.CaesarShiftCipher(str,3));
    }

    @Test
    public void encryptWithShift16() {
        String str = "aqua";
        String expectedEncryptedStr = "qgkq";
        Assertions.assertEquals(expectedEncryptedStr,caesarShiftCipher.CaesarShiftCipher(str,16));
    }

    @Test
    public void encryptWithShift16AndSpace() {
        String str = "aqua len";
        String expectedEncryptedStr = "qgkq bud";
        Assertions.assertEquals(expectedEncryptedStr,caesarShiftCipher.CaesarShiftCipher(str,16));
    }
}
