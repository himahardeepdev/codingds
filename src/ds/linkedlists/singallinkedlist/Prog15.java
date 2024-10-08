package ds.linkedlists.singallinkedlist;

public class Prog15 {
    private Node head;
    private static class Node {
        
        private int data;
        private Node next;

        public Node(int data){
            this.data =data;
            this.next = null;
        }
        
    }

    public void displayList() {
        Node current = this.head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static Node sumOfTwoList(Node a , Node b){
        Node dummy = new Node(0);
        Node tail = dummy;
        int carry = 0 ;
        while (a != null || b != null) {
            int x = a != null ? a.data : 0;
            int y = b != null ? b.data : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            tail.next = new Node(sum %10);
            tail = tail.next;
            if(a!= null) a = a.next;
            if(b!= null) b = b.next;
        }
        if(carry > 0){
            tail.next = new Node(carry);
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        Prog15 p15 = new Prog15();
        p15.head = new Node(7);
        Node second = new Node(4);
        Node third = new Node(9);
        p15.head.next = second;
        second.next = third;

        p15.displayList();

        Prog15 p151 = new Prog15();

        p151.head = new Node(5);
        Node fourth = new Node(6);


        p151.head.next = fourth;
        

        p151.displayList();

        Prog15 result = new Prog15();
        result.head = sumOfTwoList(p15.head, p151.head);

        result.displayList();

    }
}
