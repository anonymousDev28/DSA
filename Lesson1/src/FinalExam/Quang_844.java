package FinalExam;

import java.util.Stack;

public class Quang_844 {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c","ad#c"));
    }
    // time complexity: O(S.length+T.length)
    // space comlexity: O(S.length+T.length)
    public static boolean backspaceCompare(String S, String T) {
        return executeString(S).equals(executeString(T));
    }
    // duyệt qua các char trong input
    // nếu char khác '#' thì push vào stack
    // nếu char là '#' và stack không rỗng thì pop
    public static String executeString(String input) {
        Stack<Character> stack = new Stack();
        char[] arrChar = input.toCharArray();
        // duyệt input
        for (char c: arrChar) {
            // nếu c != # => push vào stack
            if (c != '#')
                stack.push(c);
            // nếu c == # và stack not empty => pop
            else if (!stack.empty())
                stack.pop();
        }
        // return result
        return String.valueOf(stack);
    }
}
