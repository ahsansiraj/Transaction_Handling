package dsa_questions.src.ISCPrograms;

import java.util.*;

public class NumberInWords {

    private String numberToWords(long num) {
        if (num == 0) {
            return "Zero";
        }
        String result = helper(num);
        return result.trim();
    }

    private String helper(long num) {
        String result = "";
        String[] belowTen = {
                "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
        };
        String[] belowTwenty = {
                "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
        };
        String[] belowHundred = {
                "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
        };

        if (num < 10) {
            result = belowTen[(int) num];
        } else if (num < 20) {
            result = belowTwenty[(int) (num - 10)];
        } else if (num < 100) {
            result = belowHundred[(int) (num / 10)] + " " + helper(num % 10);
        } else if (num < 1000) {
            result = helper(num / 100) + " Hundred " + helper(num % 100);
        } else if (num < 1000000) { // Less than one million or ten lakh
            result = helper(num / 1000) + " Thousand " + helper(num % 1000);
        } else if (num < 1000000000) { // Less than one billion or hundred crore
            result = helper(num / 1000000) + " Million " + helper(num % 1000000);
        } else {
            result = helper(num / 1000000000) + " Billion " + helper(num % 1000000000);
        }
        return result.trim();
    }

    public static void main(String[] args) {
        NumberInWords obj = new NumberInWords();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number=");
        long num=sc.nextLong();
        System.out.println(obj.numberToWords(num));
    }

}
