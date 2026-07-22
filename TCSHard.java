import java.util.HashSet;
import java.util.Set;

public class TCSHard {

    public static boolean isHappy(String number) {

        Set<Integer> visited = new HashSet<>();

        while (true) {

            int sum = 0;

            // Calculate sum of squares of digits
            for (int i = 0; i < number.length(); i++) {
                int digit = number.charAt(i) - '0';
                System.out.println(digit);
                sum = digit * digit + sum;
            }

            if (sum == 1) {
                return true;
            }

            // Cycle detected
            if (visited.contains(sum)) {
                return false;
            }

            visited.add(sum);

            // Continue with new number
            number = String.valueOf(sum);
        }
    }

    public static void main(String[] args) {

        //System.out.println(isHappy("19"));   // true
        System.out.println(isHappy("1"));    // false
        //System.out.println(isHappy("100"));  // true
        //System.out.println(isHappy("999999999999999999999999999999"));
    }
}
