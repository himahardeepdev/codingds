package ds.arrays;

public class prog4 {
    public static void main(String[] args) {
        int[] a= new int[]{7,6,5,41,2,4,2};
        System.out.println(minVal(a));
        
    }

    public static int minVal(int[] a){
        int minVal = a[0];
        for(int i = 0 ; i < a.length ; i++){
            if(minVal > a[i]){
                minVal = a[i];
            }
        }
        return minVal;
    }
}
