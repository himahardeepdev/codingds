package ds.arrays;

public class Prog1 {
    public static void main(String[] args) {
        int[] a = new int[5];
       
        addData(a);
        printArray(a);
        System.out.println();
        updateData(a, 0, 100);
        System.out.println();
        printArray(a);


    }

    public static void addData(int[] a){
        for(int i = 0 ; i < a.length ; i++){
            a[i] = i* 10;
        }
    }
    public static void printArray(int a[]){
        int n = a.length;
        for (int i = 0 ; i < n ; i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void updateData(int a[] ,int index , int val){
       if(index < a.length){
            a[index] = val;
       }else{
        System.out.println("Pls enter the valid index ");
       }
    }
}
