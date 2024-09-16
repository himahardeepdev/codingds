package ds.arrays;

public class Prog5 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6,7};
        System.out.println(secondMaxValue(a));
    }

    public static int secondMaxValue(int[] a ){
        int n = a.length;
        int maxValue =a[0];
        int secondMaxValue = a[0];
        for(int i = 0 ; i < n ; i++){
            if(maxValue < a[i]){
                secondMaxValue = maxValue;
                maxValue = a[i];
            }else if(a[i] > secondMaxValue && a[i]!= maxValue){
                secondMaxValue = a[i];
            }
        }
        return secondMaxValue;
    }
}
