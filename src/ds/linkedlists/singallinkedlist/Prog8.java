package ds.linkedlists.singallinkedlist;

public class Prog8 {
    
    private NodeList head;

    private static class NodeList{
        private int data;
        private NodeList next;

        public NodeList(int data){
            this.data = data;
            this.next = null;
        }

    }

    

    public void printList(NodeList head){
        NodeList current = head;
        while (current != null) {
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("null");
    }


    public int findElementFromLast(NodeList head , int c){
        NodeList mainRefPtr = head;
        NodeList refPtr = head;
        int count = 0 ;
        while (count < c) {
            refPtr = refPtr.next;
            count++;
        }
        while (refPtr != null) {
            refPtr = refPtr.next;
            mainRefPtr= mainRefPtr.next;
        }
        return mainRefPtr.data;
    }

    public void removeDuplicateElements(){
        NodeList currentNode = head;
        while (currentNode != null && currentNode.next != null) {
            if(currentNode.data == currentNode.next.data){
                currentNode.next = currentNode.next.next;
            }else{
                currentNode = currentNode.next;
            }
        }
    }

    public static void main(String[] args) {
        Prog8 p8 = new Prog8();
        p8.head = new NodeList(10);
        NodeList second = new NodeList(10);
        NodeList third = new NodeList(20);
        NodeList fourth = new NodeList(20);
        NodeList fifth = new NodeList(30);
        NodeList sixth = new NodeList(30);
        p8.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        // p8.printList(p8.head);
        // System.out.println(p8.findElementFromLast(p8.head, 2));
        p8.removeDuplicateElements();
        p8.printList(p8.head);


    }
}
