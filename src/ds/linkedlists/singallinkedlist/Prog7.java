package ds.linkedlists.singallinkedlist;

public class Prog7 {
    
    private NodeList head;

    private static class NodeList {
        private int data;
        private NodeList next ;

        public NodeList(int data){
            this.data = data;
            this.next = null;
        }
        
    }

    public void display(NodeList head){
        NodeList current = head;
        while (current != null) {
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public NodeList reverse(NodeList head) {
        NodeList current = head;
        NodeList next = null;
        NodeList previous = null;
    
        while (current != null) {
            next = current.next;  // Store the next node
            current.next = previous;  // Reverse the current node's pointer to the previous node
            previous = current;  // Move previous one step forward to current
            current = next;  // Move current one step forward to next
        }
    
        return previous;  // Previous will be the new head of the reversed list
    }
    
    public static void main(String[] args) {
        Prog7 p7 = new Prog7();
        p7.head = new NodeList(10);
        NodeList second = new NodeList(20);
        NodeList third = new NodeList(30);
        NodeList fourth = new NodeList(40);

        p7.head.next = second;
        second.next = third;
        third.next = fourth;

        p7.display(p7.head);
        
        NodeList reverseListHead = p7.reverse(p7.head);
        p7.display(reverseListHead);




    }

}
