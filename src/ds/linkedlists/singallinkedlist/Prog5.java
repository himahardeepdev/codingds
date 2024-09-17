package ds.linkedlists.singallinkedlist;

public class Prog5 {
    
    private NodeList head;
    private static class NodeList{
        private int data;
        private NodeList next;

        public NodeList(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(){
        NodeList current = head;
        while (current != null) {
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public boolean searchElement(int data){
        NodeList current = head;
        while (current != null) {
            if(current.data == data){
                return true;
            }

            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Prog5 p5 = new Prog5();
        p5.head = new NodeList(10);
        NodeList second = new NodeList(20);
        NodeList third = new NodeList(30);
        NodeList fourth = new NodeList(40);

        p5.head.next = second;
        second.next = third;
        third.next = fourth;

        p5.display();

        System.out.println(p5.searchElement(100));

    }
}
