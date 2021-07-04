
/**
 * Class provides method to print all permutations of a string.
 * This class defines 'main' method to which we can pass a single
 * string argument, whose all permutations will be permitted.
 *
 * ASSUMPTIONS:
 * Since program is expected to accept String as input argument, two
 * strings separated by space in input, will be treated as two arguments.
 * Hence user cannot provide space separate string as single argument.
 *
 * Example Test cases:
 * (1) Input = "GOD",         Output = "GOD", "GDO", "OGD", "ODG", "DGO", "DOG"
 * (2) Input = "G",           Output = "G"
 * (3) Input = "",            Output = "INVALID arguments. Expected Arg1 = Input string."
 * (4) Input = "GOD1 GOD2",   Output = "INVALID arguments. Expected Arg1 = Input string."
 * (5) Input = "123",         Output = "123", "132", "213", "231", "312", "321"
 *
 * @author Kaustubh Naniwadekar
 */
public class PrintPermutations {

    /**
     * Entry point 'main'
     *
     * @param args array of command line arguments.
     */
    public static void main(String[] args) {
        // As per requirements, expect only single argument, which is String
        if (args == null || args.length == 0) {
            System.out.println("INVALID arguments. Expected Arg1 = Input string.");
            return;
        }
        if (args.length > 1) {
            System.out.println("INVALID arguments. Expected Arg1 = Input string.");
            return;
        }
        PrintPermutations printPermutations = new PrintPermutations();
        printPermutations.printPermutations(args[0]);
    }

    /**
     * Prints all the permutations of given {@code inputString}
     *
     * @param inputString String for which we want to print permutations.
     */
    public void printPermutations(String inputString) {
        printPermutationsRecur("", inputString);
    }

    private void printPermutationsRecur(String prefix, String val) {
        int len = val.length();
        if (len == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < len; i++) {
                printPermutationsRecur(prefix + val.charAt(i), val.substring(0, i) + val.substring(i+1, len));
            }
        }
    }
}
