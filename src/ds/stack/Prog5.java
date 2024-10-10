package ds.stack;

import java.util.Stack;

public class Prog5 {

    public static boolean validParanthies(String str) {
        Stack<Character> stack = new Stack<>();
        for (char s : str.toCharArray()) {
            if (s == '(' || s == '{' || s == '[') {
                stack.push(s);
            } else {

                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.peek();

                    if ((s == ')' && top == '(') || (s == '}' && top == '{') || (s == ']' && top == '[')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }

            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "()";
        System.out.println(validParanthies(str));

    }
}
