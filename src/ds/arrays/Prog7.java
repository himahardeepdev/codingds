package ds.arrays;

public class Prog7 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4};
        printArray(a);
        a = resize(a, 10);
        System.out.println();
        printArray(a);

    }

    public static int[] resize(int[] a , int capcity){
        int[] res = new int[capcity];
        for(int i = 0 ; i < a.length ; i++){
            res[i] = a[i];

        }
        a = res;
        return a;
    }
    public static void printArray(int[] a ){
        System.out.println(a.length);
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(a[i]+" ");
        }
    }
}
