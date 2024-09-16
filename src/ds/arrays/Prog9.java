package ds.arrays;

public class Prog9 {
    public static void main(String[] args) {
        String s = "madam";
        if(checkPalandrom(s)){
            System.out.println("Its a planadrom ");
        }else{
            System.out.println("Its is not a palandrom ");
        }
        
    }

    public static boolean checkPalandrom(String s){
        char[] charArray = s.toCharArray();
        int start = 0 ;
        int end = charArray.length -1;
        while (start < end) {
            if(charArray[start] != charArray[end]){
                return false;
            }
            end--;
            start++;
            
        }
        return true;
    }
}
