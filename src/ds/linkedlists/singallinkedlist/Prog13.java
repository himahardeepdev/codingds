package ds.linkedlists.singallinkedlist;

public class Prog13 {
    private NodeList head;
    private static class NodeList {
        private int data;
        private NodeList next;
        public NodeList(int data){
            this.data = data;
            this.next = null;
        }
    }

        public boolean loopDetect(){
            NodeList fastptr = head;
            NodeList slowptr = head;
            while (fastptr != null && fastptr.next != null) {
                fastptr = fastptr.next.next;
                slowptr = slowptr.next;
                if(slowptr == fastptr){
                    removeLoop(slowptr);
                    return true;
                }
            }
            return false;
        }

        public void removeLoop(NodeList slowprt){
            NodeList temp = head;

            while (temp.next != slowprt.next) {
                temp = temp.next;
                slowprt = slowprt.next;
            }
            slowprt.next = null;

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
        Prog13 p13 = new Prog13();
        p13.head =new NodeList(10);
        NodeList second = new NodeList(20);
        NodeList third  = new NodeList(30);
        NodeList fourth = new NodeList(40);
        NodeList fifth = new NodeList(50);
        NodeList sixth = new NodeList(60);

        p13.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;

        System.out.println(p13.loopDetect());
        p13.display();

    }
}
