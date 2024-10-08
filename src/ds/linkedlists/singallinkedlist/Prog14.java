package ds.linkedlists.singallinkedlist;

public class Prog14 {

    private Node head;

    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
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

    public static Node merge(Node a, Node b) {
        Node dummy = new Node(0);  // Dummy node to help simplify the merge process
        Node tail = dummy;  // Tail node to build the merged list

        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;  // Move tail forward
        }

        // Attach the remaining nodes from either list
        if (a == null) {
            tail.next = b;
        } else {
            tail.next = a;
        }

        return dummy.next;  // Return the merged list (skipping the dummy node)
    }

    public static void main(String[] args) {
        // First list: 10 -> 30 -> 50
        Prog14 p14 = new Prog14();
        p14.head = new Node(10);
        Node second = new Node(30);
        Node third = new Node(50);
        p14.head.next = second;
        second.next = third;

        System.out.print("First List: ");
        p14.displayList();

        // Second list: 20 -> 40
        Prog14 p141 = new Prog14();
        p141.head = new Node(20);
        Node fourth = new Node(40);
        p141.head.next = fourth;

        System.out.print("Second List: ");
        p141.displayList();

        // Merge two sorted lists
        System.out.println("Merge two sorted arrays:");

        Prog14 result = new Prog14();
        result.head = merge(p14.head, p141.head);

        // Display the merged list
        System.out.print("Merged List: ");
        result.displayList();
    }
}
