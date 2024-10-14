package ds.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Prog2 {

    public static String[] getAllBinaryValues(int n){
        String[] result = new String[n];

        Queue<String> q = new LinkedList<>();
        q.offer("1");
        for(int i = 0 ; i < n ; i++){
            result[i] = q.poll();
            String n1 = result[i]+"0";
            String n2 = result[i]+"1";
            q.offer(n1);
            q.offer(n2);
        }

        return result;
    }
    
    public static void main(String[] args) {
        String[] res = getAllBinaryValues(4);
        for(int i = 0 ; i < res.length ;i++){
            System.out.print(res[i]+"  ");
        }
        System.out.println();
    }
}
