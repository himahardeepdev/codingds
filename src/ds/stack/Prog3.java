package ds.stack;

import java.util.Stack;

public class Prog3 {
    public static void main(String[] args) {
        Prog3 p3 = new Prog3();
        String name = "hima";
        String revname = p3.reverse(name);
        System.out.println(name);
        System.out.println(revname);

        
    }
    public String reverse(String name){
        Stack<Character> stack = new Stack<>();
        char[] ch = name.toCharArray();
        for(char i :ch){
            stack.push(i);
        }
        for(int i = 0 ; i < name.length(); i++){
            ch[i] = stack.pop();
        }
        return new String(ch);
    }
}
