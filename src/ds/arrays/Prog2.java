package ds.arrays;

public class Prog2 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6,7,8};
        printArray(removeEvenElements(a));
        
    }

    public static int[] removeEvenElements(int a[]){
        int n = a.length;
        int oddCount = 0 ;
        for(int i = 0 ; i < n ; i++){
            if(a[i] %2 != 0){
                oddCount++;
            }
        }
        int res[] = new int[oddCount];
        int oddindex  = 0 ;
        for(int i = 0 ; i < a.length ; i++){
            if(a[i] %2 != 0 ){
                res[oddindex] = a[i];
                oddindex++;
            }
        }
        return res;
    }

    public static void printArray(int a[]){
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(a[i]+"  ");
        }
    }
}
