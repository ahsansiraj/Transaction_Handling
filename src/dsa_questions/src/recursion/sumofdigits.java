package dsa_questions.src.recursion;

public class sumofdigits {
    public static void main(String[] args) {
        int num = 123;
        sumofdigits obj = new sumofdigits();
        int sum = obj.find(num, 0);
        System.out.println(sum);
    }

    private int find(int num, int sum) {
        if (num == 0) {
            return sum;
        }
        int dig = num % 10;
        sum = sum + dig;
        return find(num / 10, sum);
    }
}
