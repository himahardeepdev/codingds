package ds.linkedlists.doublyLinkedList;

public class Prog1 {
    
    private Node head;
    private Node tail;
    private int length;

    public static class Node{
        private int data;
        private Node next;
        private Node prev;

        public Node(int data){
            this.data = data;
        }
    }

    public boolean isEmpty(){
        return length ==0; // head == null;
    }

    public int length(){
        return length;
    }

    public void insertNodeAtLast(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
        }   
        tail = newNode;
        length++;
    }

    public void insertNodeAtFirst(int data){
        Node newNode  = new Node(data);
        if(isEmpty()){
            head = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void printListForward(){
        Node currrent = head;
        while (currrent != null) {
            System.out.print(currrent.data+"-->");
            currrent = currrent.next;
        }
        System.out.println("null");
    }

    public void printListBackward(){
        Node current = tail;
        while (current != null) {
            System.out.print(current.data+"-->");
            current = current.prev;
        }
        System.out.println("null");
    }

    public void deltefirstNode(){
        if(!isEmpty()){
            Node current = head;
        head = current.next;
        head.prev = null;
        current.next = null;
        }else{
            System.out.println("No element in list");
        }
    }

    public void deleteLastNode(){
        if(isEmpty()){
            System.out.println("Not element in list");
        }else{
            Node current = tail;
            tail = current.prev;
            tail.next = null;
            current.prev = null;
        }
    }

    public static void main(String[] args) {
        Prog1 p1 = new Prog1();
        p1.insertNodeAtLast(10);
        p1.insertNodeAtLast(20);
        p1.insertNodeAtLast(30);


        p1.printListForward();
        // p1.printListBackward();
        // p1.deltefirstNode();
        // p1.printListForward();
        // p1.printListBackward();
        // p1.deleteLastNode();
        // p1.printListForward();
        // p1.printListBackward();

        // p1.insertNodeAtFirst(100);
        // p1.insertNodeAtLast(200);
        // p1.printListForward();
        // p1.deltefirstNode();
        // p1.printListForward();
        p1.deleteLastNode();
        p1.printListForward();
    }
}
