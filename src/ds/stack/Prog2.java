package ds.stack;

public class Prog2 {
    private int top;
    private int[] arr;

    public Prog2(int capacity){
        this.top = -1;
        this.arr = new int[capacity];
    }

    public Prog2(){
        this. top = -1 ;
        this.arr = new int[10];
    }

    public void push(int data){
        if(isFull()){
            System.out.println("Is full");
        }else{
            top++;
            arr[top] = data;
        }
    }

    public boolean isFull(){
        return arr.length == size();
    }
    public boolean isEmpty(){
        return top< 0;
    }

    public int size(){return top+1;}
    public Integer peek(){
        if(isEmpty()){
            return null;
        }else{
            return arr[top];
        }
    }

    public Integer pop(){
        if(isEmpty()){
      
            return null;
        }else{
            int result = arr[top];
            top--;
            return result;
        }
    }

    public static void main(String[] args) {
        Prog2 p2 = new Prog2(3);
        p2.push(10);
        p2.push(20);
        p2.push(30);
        p2.push(40);
        System.out.println(p2.peek()+"peek");
        System.out.println(p2.pop());
        System.out.println(p2.pop());
        System.out.println(p2.pop());
        System.out.println(p2.pop());
    }

}
