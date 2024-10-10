package ds.stack;

public class Prog1 {
    private Node top;
    private int length;


    private static class Node {
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }
    public Prog1(){
        this.length = 0;
        this.top = null;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0 ;
    }

    public void push(int data){
        Node temp = new Node(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public Integer pop(){
        if(isEmpty()){
            System.out.println("List is empty ");
            return null;
        }
        else{
            int result = top.data;
        top = top.next;
        length--;
        return result;
        }
        
    }

    public Integer peek(){
        if(isEmpty()){
            return null;
        }else{
            return top.data;
        }
        
    }

    public static void main(String[] args) {
        Prog1 p1 = new Prog1();
        p1.push(10);
        p1.push(15);
        p1.push(30);
        System.out.println(p1.peek());
        p1.pop();
        System.out.println(p1.peek());
        p1.pop();
        System.out.println(p1.peek());
        p1.pop();
        System.out.println(p1.peek());
    }
}
