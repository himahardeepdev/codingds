package ds.linkedlists.singallinkedlist;

public class Prog2 {
    private NodeList head;
    private static class NodeList {
        private int data;
        private NodeList next;
        public NodeList(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void printSingalLinkedList(){
        NodeList current = head;
        while (current != null) {
            System.out.println(current.data+"-->");
            current = current.next;
        }
        System.out.println("null");
    }


    public int lengthOfSingaleLinekedList(){
        NodeList current  = head;
        int count = 0 ;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Prog2 p2  = new Prog2();
        p2.head = new NodeList(10);
        NodeList second = new NodeList(20);
        NodeList third = new NodeList(30);
        NodeList fourth = new NodeList(40);

        p2.head.next = second;
        second.next= third;
        third.next = fourth;

        p2.printSingalLinkedList();

       System.out.println( p2.lengthOfSingaleLinekedList());


    }
}
