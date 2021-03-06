/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 16/01/20
 *   Time: 8:52 AM
 */

package recursion;

public class FactorialCalculator {
    public int calculateFactorial(int number) {
        // base condition
        if (number == 0 || number == 1) {
            return 1;
        }
        // call the method inside the body of the method while decreasing the input
        return number * calculateFactorial(number - 1);
    }
}
