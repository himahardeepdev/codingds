package ds.stack;

import java.util.Stack;

public class Prog4 {
    
    public static int[] getNextGreatestElement(int arr[]){
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[arr.length];
        for(int i = arr.length-1 ; i >=0 ; i--){
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i] = -1;
            }else{
                res[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{4,7,3,4,8,1};
        int[] res = getNextGreatestElement(arr);
        for(int i : res){
            System.out.print(i+"  ");
        }

    }
}
