package ds.arrays;

/**
 * Prog6
 */
public class Prog6 {

    public static void main(String[] args) {
        int[] a = new int[]{0,0,0,1,0,3};
        printArray(moveZeroToLast(a));
        
    }

    public static void printArray(int[] a ){
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(a[i]+" ");
        }
    }

    public static int[] moveZeroToLast(int[] a ){
        int[] res = a;
        int j = 0 ;
        for(int i = 0 ; i < a.length ; i++){
            if(a[i] !=0 && a[j] == 0){
                int temp = a[j];
                a[j]  = a[i];
                a[i] = temp;
            }
            if(a[j]!= 0){
                j++;
            }
        }
        return res;
    }
}