package ds.linkedlists.singallinkedlist;

public class SIngalyLinkedList {

    private ListNode   head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SIngalyLinkedList sll  = new SIngalyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth  = new ListNode(40);
        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        
    }
}
