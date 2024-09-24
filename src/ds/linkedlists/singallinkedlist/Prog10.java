package ds.linkedlists.singallinkedlist;

public class Prog10 {

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

    public int removeNode(int data){
        NodeList current = head;
        NodeList temp = null;
        while (current != null && current.data != data) {
            temp = current;
            current = current.next;
        }
        if(current == null){
            return 0;
        }
        temp.next = current.next;
        return current.data;
    }

    public static void main(String[] args) {
        Prog10 p10 = new Prog10();

        p10.head = new NodeList(10);
        NodeList second = new NodeList(20);
        NodeList third = new NodeList(30);
        NodeList fourth = new NodeList(40);

        p10.head.next = second;
        second.next = third;
        third.next = fourth;

        p10.printList();
        System.out.println(p10.removeNode(40));
        p10.printList();

    }
    
}
