package ds.queue;

public class Prog1 {
    private Node front;
    private Node rear;
    private int length;

    private static class Node {
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0 ;
    }

    public void enqueue(int data){
        Node newNode =  new Node(data);
        if(isEmpty()){
            front = newNode;
        }else{
            rear.next = newNode;
        }
        rear = newNode;
        length++;
    }

    public void display(){
        Node current = front;
        while (current != null) {
            System.out.print(current.data +"-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public Integer dequeue(){
        
        if(isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }else{
            int result = front.data;
            front = front.next;
            if(front == null){
                rear = null;
            }
            length--;
            return result;
        }
    }

    public Integer first(){
        if(isEmpty()){
            return null;
        }
        return front.data;
    }

    public Integer last(){
        if(isEmpty()){
            return null;
        }
        return rear.data;
    }

    public Prog1(){
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    public static void main(String[] args) {
        Prog1 p1  = new Prog1();
        p1.enqueue(10);
        p1.display();
        System.out.println(p1.dequeue());
    }
}
