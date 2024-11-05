import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestDec2Hex{
    public TestDec2Hex() {}

    @Test
    public void testInteger(){
        assertEquals("Expected output F", "F", Dec2Hex.convertToHex(new String[]{"15"}));

    }
    @Test
    public void testIsEmpty(){
        assertEquals("Cannot be empty", "", Dec2Hex.convertToHex(new String[]{}));
    }


}

