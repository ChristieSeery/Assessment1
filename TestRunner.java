import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {


    public static void main(String[] args) {
        // instance of result object
        Result result = JUnitCore.runClasses(TestDec2Hex.class);
        int fails = 0;
        // try to get failures
        try{
            for(Failure failure: result.getFailures()){
                //print failure
                System.out.println(failure.toString());
                fails++;

            }

		// if fails is greater than zero throw new exception
            if(fails>0)
                throw new Exception();
            System.out.println(result.wasSuccessful());
        } catch (Exception e) { //if there is fails print failures
            System.out.println("" + fails + " test failed");
            System.exit(1);
        }
        // print test information
        
            System.out.println("Test run count: " + result.getRunCount());
            System.out.println("Test failed count: " + result.getFailureCount());
            System.out.println("Test successful: " + result.wasSuccessful());


    }
}
