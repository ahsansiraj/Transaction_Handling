package dsa_questions.src.recursion;

public class armstrong {
    public static void main(String[] args) {
        int num = 153; // Replace with any number to test
        String s = Integer.toString(num);
        int l = s.length();
        armstrong obj = new armstrong();
        int sum = obj.find(num, 0, l);
        System.out.println("Sum of digits raised to the power " + l + " is: " + sum);

        if(sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    private int find(int num, int sum, int l) {
        if (num == 0) {
            return sum;
        }
        int dig = num % 10;
        sum = sum + (int) Math.pow(dig, l);  // Raise digit to the power of the length
        return find(num / 10, sum, l);
    }
}
