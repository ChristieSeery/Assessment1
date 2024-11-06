import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {


    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestDec2Hex.class);
        int fails = 0;

        try{
            for(Failure failure: result.getFailures()){
                System.out.println(failure.toString());
                fails++;

            }
            if(fails>0)
                throw new Exception();
            System.out.println(result.wasSuccessful());
        } catch (Exception e) {
            System.out.println("" + fails + " tess failed");
            System.exit(1);
        }

        System.out.println("Test run count: " + result.getRunCount());
        System.out.println("Test failed count: " + result.getFailureCount());
        System.out.println("Test successful: " + result.wasSuccessful());


    }
}
