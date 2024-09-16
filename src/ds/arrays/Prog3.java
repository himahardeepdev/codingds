package ds.arrays;

public class Prog3 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6};
        printArray(a);
        System.out.println();
        revesrseArray(a, 0, a.length-1);
        printArray(a);

    }
    
    public static void printArray(int[] a){
        int n = a.length;
        for(int i = 0 ; i < n  ; i++){
            System.out.print(a[i]+"  ");
        }
    }

    public static void  revesrseArray(int a[] , int start , int end){
        int n = a.length;
        if(end < n){
            while (start < end) {
                int temp = a[start];
                a[start]  = a[end];
                a[end] = temp;
                end--;
                start++;
            }
        }else{
            System.out.println("Out of index");
        }
       
        
    }
}
