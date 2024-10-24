import java.math.BigInteger;

public class FACTORIAL{
        public static void main(String[] args) {
            int number = 78659;
            String factorial = calculateFactorial(number);
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        public static String calculateFactorial(int n) {
            BigInteger result = BigInteger.ONE;
            for (int i = 1; i <= n; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            return result.toString(); // Convert BigInteger to String
        }
    }
