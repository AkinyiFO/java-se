import java.util.ArrayList;
import java.util.List;

public class ValueOfDemo {
    public static void main(String[] args) {

        // this program requires two
        // arguments on the command line
        if (args.length == 2) {
            // convert strings to numbers
            // parseFloat()
            float a = Float.parseFloat(args[0]);
            // valueOf() and floatValue()
            float b = (Float.valueOf(args[1])).floatValue();
            // Autoboxing / Unboxing - Java automatically inserts .floatValue() on the created object.
            float c = (Float.valueOf(args[1]));

            // Example: When valuOf() is preferred:
            List<Float> values = new ArrayList<>();
            values.add(Float.valueOf("3.14"));

            // do some arithmetic
            System.out.println("a + b = " +
                    (a + b));
            System.out.println("a - b = " +
                    (a - b));
            System.out.println("a * b = " +
                    (a * b));
            System.out.println("a / b = " +
                    (a / b));
            System.out.println("a % b = " +
                    (a % b));
        } else {
            System.out.println("This program " +
                    "requires two command-line arguments.");
        }
    }
}
