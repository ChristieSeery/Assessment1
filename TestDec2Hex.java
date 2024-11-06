import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestDec2Hex{
    public TestDec2Hex() {}

    Dec2Hex dec2Hex;

    @Before
    public void setUp(){
        dec2Hex = new Dec2Hex();
    }

    @Test
    public void testInteger(){
        assertEquals("Number conversion should  work", "F", dec2Hex.convertToHex("15"));

    }
    @Test
    public void testNull(){
        assertEquals("Input was null, enter a number", "", dec2Hex.convertToHex(null));
    }

    @Test
    public void testString(){
        assertEquals("Please enter an Integer", dec2Hex.convertToHex("abc"));
    }


}


