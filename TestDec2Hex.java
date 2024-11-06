import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestDec2Hex{
    public TestDec2Hex() {}

    // create Dec2Hex object
    Dec2Hex dec2Hex;

    @Before
    public void setUp(){

        // new instance of Dec2Hex object
        dec2Hex = new Dec2Hex();
    }
    // Test if the value is an integer
    @Test
    public void testInteger(){
        assertEquals("Number conversion should  work", "F", dec2Hex.convertToHex("15"));

    }

    //Test if the value is null
    @Test
    public void testNull(){
        assertEquals("Input was null, enter a number", "", dec2Hex.convertToHex(null));
    }
    //Test if the value is a String
    @Test
    public void testString(){
        assertEquals("Please enter an Integer", dec2Hex.convertToHex("abc"));
    }


}

