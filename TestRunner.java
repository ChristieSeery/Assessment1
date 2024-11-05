import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestDec2Hex.class);


        System.out.println("Test run count: " + result.getRunCount());
        System.out.println("Test failed count: " + result.getFailureCount());
        System.out.println("Test successful: " + result.wasSuccessful());

        // Print details of each failure, if any
        if (!result.wasSuccessful()) {
            System.out.println("Failed test cases:");
            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }
        }
    }
}
