package ds.basic;

public class Prog7 {

    public static void main(String[] args) {
        int a = -10;
        int b = -200;
        int c = 1;

        if(a < b){
            if(a < c){
                System.out.println(a+" is the smallest number");
            }else{
                System.out.println(c+" is the largest number");
            }
        }
        else if(b < c){
            System.out.println(b+" is the smallest number");
        }else{
            System.out.println(c+" is the smallest number ");
        }
    }
}