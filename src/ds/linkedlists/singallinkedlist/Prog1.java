package ds.linkedlists.singallinkedlist;



public class Prog1 {
    
    private NodeList head;

    private static class NodeList{
        private int data;
        private NodeList next;

        public NodeList(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Prog1 p1 = new Prog1();
        p1.head = new NodeList(10);
        NodeList second = new NodeList(20);
        NodeList third = new NodeList(30);
        NodeList fourth = new NodeList(40);
        p1.head.next = second;
        second.next = third;
        third.next = fourth;

        p1.printSingalLinkedList();
        
    }

    public  void printSingalLinkedList(){
        NodeList current = head;
        while (current != null) {
            System.out.print(current.data+"---->");
            current = current.next;
        }
        System.out.println("null");
    }
}
