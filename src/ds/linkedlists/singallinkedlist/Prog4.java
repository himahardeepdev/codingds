package ds.linkedlists.singallinkedlist;

public class Prog4 {
    private NodeList head;

    private static class NodeList {
        private int data;
        private NodeList next;
        

        public NodeList(int data){
            this.data = data;
            this.next = null;
        }
    }

    public NodeList deleteFirstElement(){
        if(head == null){
            return null;
        }

        NodeList temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public void display(){
        NodeList current = head;
        while (current != null) {
           System.out.print(current.data+"-->");
           current = current.next; 
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Prog4 p4 = new Prog4();
        p4.head = new NodeList(10);
        NodeList second = new NodeList(20);
        NodeList third = new NodeList(30);
        NodeList fourth = new NodeList(40);

        p4.head.next = second;
        second.next = third;
        third.next =fourth;
        p4.display();
        p4.deleteFirstElement();
        p4.display();



    }
}
