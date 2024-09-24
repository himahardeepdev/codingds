package ds.linkedlists.singallinkedlist;

public class Prog12 {
    private NodeList head;

    private static class NodeList {
        private int data ; 
        private NodeList next ;

        public NodeList(int data){
            this.data = data;
            this.next = null;
        }
        
    }

    public NodeList detecloop(){
        NodeList fastprt = head;
        NodeList slowptr = head;
        while (fastprt != null && fastprt.next != null) {
            fastprt = fastprt.next.next;
            slowptr = slowptr.next;
            if(fastprt == slowptr){
                return getFirtLoop(slowptr);
            }
        }
        return null;
    }

    public NodeList getFirtLoop(NodeList slowPtr){
        NodeList temp = head;
        while (slowPtr != temp) {
            temp  = temp.next;
            slowPtr =  slowPtr.next;
        }
        return temp;
    }

    public static void main(String[] args) {
        Prog12 p12 = new Prog12();

        p12.head =  new NodeList(10);
        NodeList second = new NodeList(20);
        NodeList third = new NodeList(30);
        NodeList fourth = new NodeList(40);
        NodeList fifth = new NodeList(50);
        NodeList sixth =  new NodeList(60);

        p12.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;

        NodeList cehck =  p12.detecloop();
        System.out.println(cehck.data);

    }
}
