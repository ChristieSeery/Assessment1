import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestDec2Hex{
    public TestDec2Hex() {}


    @Test
    public void testInteger(){
        assertEquals("Number conversion should  work", "F", Dec2Hex.convertToHex(new String[]{"15"}));

    }
    @Test
    public void testNull(){
        assertEquals("Input was null, this must be a number", "", Dec2Hex.convertToHex(new String[]{null}));
    }

    @Test
    public void testString(){
        assertEquals("Not a number", Dec2Hex.convertToHex(new String[]{"abc"}));
    }


}


