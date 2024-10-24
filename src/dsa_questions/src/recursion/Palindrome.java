package dsa_questions.src.recursion;

public class Palindrome {
    public static void main(String[] args) {
        int num = 121; // Replace with any number to test
        String s = Integer.toString(num);
        Palindrome obj = new Palindrome();
        int sum = obj.find(num, 0);
        if(sum == num) {
            System.out.println(num + " is an Palindrome number.");
        } else {
            System.out.println(num + " is not an Palindrome number.");
        }
    }

    private int find(int num, int rev) {
        if (num == 0) {
            return rev;
        }
        int dig = num % 10;
        rev= rev *10+dig;  // Raise digit to the power of the length
        return find(num / 10, rev);
    }
}