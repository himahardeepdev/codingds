package ds.linkedlists.singallinkedlist;


public class Prog11 {
    private NodeList head;
    private static class NodeList {
        private int data;
        private NodeList next;

        public NodeList(int data){
            this.data = data;
            this.next = null;
        }
        
    }

    public void printList(){
        NodeList current = head;
        while (current != null) {
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public boolean detecLoopInSingalList(){
        NodeList fastPrt = head;
        NodeList slowPtr = head;
        while (fastPrt != null && fastPrt.next != null) {
            fastPrt = fastPrt.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr == fastPrt){
                return true;
            }
            
        }
        return false;
    }

    public static void main(String[] args) {
        Prog11 p11 = new Prog11();

        p11.head = new NodeList(10);
        NodeList second = new NodeList(20);
        NodeList third = new NodeList(30);
        NodeList fourth = new NodeList(40);
        NodeList fifth = new NodeList(50);
        NodeList sixth = new NodeList(60);
        NodeList seventh = new NodeList(70);
        NodeList eigth = new NodeList(80);

        p11.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eigth;
        eigth.next = second;

        // p11.printList();
        boolean cehck = p11.detecLoopInSingalList();
        System.out.println(cehck);

    }
}
