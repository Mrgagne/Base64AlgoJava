import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

    @Test
    public void testEncoding() {
       String encoding = Main.encode("My name is Michael");
       assertEquals(encoding, "TXkgbmFtZSBpcyBNaWNoYWVs");
    }

}
