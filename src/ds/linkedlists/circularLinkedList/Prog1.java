package ds.linkedlists.circularLinkedList;

public class Prog1 {
    private Node tail;
    private int length;

    private static class Node {
        private int data ;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = next;
        }
        
    }

    public Prog1(){
        this.tail = null;
        this.length = 0 ;
    }

    public void insertAtLast(int data){
        Node newNode = new Node(data);
        if(tail == null){
            tail = newNode;
        }else{
            newNode.next = tail.next;
        }
        tail.next = newNode;
        tail = newNode;
        length++;
    }

    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            tail = newNode;
        }else{
            newNode.next = tail.next;
        }
        tail.next = newNode;
        length++;
    }

    public boolean isEmpty(){
        return tail == null;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Empty list");
        } else{
            Node first = tail.next;
            while (first != tail) {
                System.out.print(first.data+"-->");
                first = first.next;
            }
            System.out.print(first.data+"-->");
            System.out.println("null");
        }

    }

    public void deleteFirstELement(){
        if(isEmpty()){
            System.out.println("The list is empty ");
        }else{
            Node temp = tail.next;
            if(tail.next == tail){
                tail = null;
            }else{
                tail.next = temp.next;
            }
            temp.next = null;
            length--;

        }
    }
    
    public static void main(String[] args) {
        Prog1 p1 = new Prog1();
        p1.insertAtLast(10);
        p1.insertAtLast(20);
        p1.insertAtLast(30);
        p1.insertAtLast(40);
        p1.insertAtFirst(100);
        p1.deleteFirstELement();
        p1.display();
        
    }
}
