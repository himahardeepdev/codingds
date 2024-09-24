package ds.linkedlists.singallinkedlist;

public class Prog9 {
    private NodeList head ;


    private static class NodeList {
        private int data ;
        private NodeList next;
        
        public NodeList(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void printList(){
        NodeList currentNode =head ; 
        while (currentNode != null) {
            System.out.print(currentNode.data+"-->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public NodeList insertNode(NodeList newNode){
        NodeList current = head;
        NodeList temp = null;
        while (current != null && current.data < newNode.data) {
            temp = current;
            current = current.next;
            
        }
        newNode.next = current;
        temp.next = newNode;
        return newNode;
    }
    public static void main(String[] args) {
        Prog9 p9 = new Prog9();
        p9.head = new NodeList(10);
        NodeList second = new NodeList(20);
        NodeList third = new NodeList(30);
        NodeList fourth = new NodeList(50);

        p9.head.next = second;
        second.next = third;
        third.next = fourth;
        p9.insertNode(new NodeList(40));
        p9.printList();



    }
}
