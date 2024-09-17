package ds.arrays;

public class Prog8 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,6,7};
        if(missingValue(a) == 0){
            System.out.println("No missing values");
        }else{
            System.out.println("Missing value"+ missingValue(a));
        }
    }
    public static int missingValue(int[] a){
        int n = a.length + 1;
        int sum = n * (n+1)/2;
        for(int i = 0 ; i < a.length ; i++){
            sum = sum - a[i];
        }

        return sum;
    }
}

/*
 * 
 * n =4 
 * =10 
 * 1,2,4
 * 10 -1c
 *9
 9 -2
 7 -4
 3 
 */
