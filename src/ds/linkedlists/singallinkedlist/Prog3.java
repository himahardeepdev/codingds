package ds.linkedlists.singallinkedlist;

public class Prog3 {
    
    private NodeList head;

    private static class NodeList {
        private int data;
        private NodeList next;

        public NodeList(int data){
            this.data = data;
            this.next = null;
        }
        
    }

    public void addDataAtBegin(int data){
        NodeList newnode = new NodeList(data);
        newnode.next = head;
        head= newnode;
    }

    public void printSingalLinkedList(){
        NodeList current = head;
        while (current != null) {
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Prog3 p3 = new Prog3();
        p3.head = new NodeList(10);
        NodeList second = new NodeList(20);
        NodeList third = new NodeList(30);
        NodeList fourth = new NodeList(40);

        p3.head.next = second;
        second.next = third;
        third.next = fourth;
        p3.addDataAtBegin(50);
        p3.printSingalLinkedList();
        p3.addDataAtBegin(60);
        p3.printSingalLinkedList();
    }
}
