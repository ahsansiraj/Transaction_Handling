package dsa_questions.src;

public class Remove_outer_parenthesis {
    public static void main(String[] args) {
        String str="(()())(())(()(()))";
        String s=removeOuterParentheses(str);
        System.out.println(s);
    }
    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int balance = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                balance++;
            } else {
                balance--;
            }

            // When balance is zero, we found a primitive substring
            if (balance == 0) {
                // Append the substring without outermost parentheses
                result.append(s.substring(start + 1, i));
                start = i + 1;
            }
        }

        return result.toString();
    }
}