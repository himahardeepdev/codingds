package ds.linkedlists.singallinkedlist;

public class Prog6 {

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
        Prog6 p6 = new Prog6();
        p6.head = new NodeList(10);
        NodeList second = new NodeList(20);
        NodeList third = new NodeList(30);
        NodeList fourth = new NodeList(40);

        p6.head.next = second;
        second.next = third;
        third.next = fourth;

        p6.printSingalLinkedList();

        System.out.println(p6.searchElement(100));
        
    }

    public void printSingalLinkedList(){
        NodeList current = head;
        while (current != null) {
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("null");
    }


    public boolean searchElement(int data){
        NodeList currentNode = head;
        while (currentNode != null) {
            if(currentNode.data == data){
                return true;
            }

            currentNode = currentNode.next;
        }
        return false;
    }
}
