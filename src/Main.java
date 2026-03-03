public class Main {
    public static void main(String[] args) {
        // Linked List Practice

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node1.next=node2;
        node2.next=node3;


        Node n = new Node(5,node1);


        while(n!=null){
            System.out.println(n.data);
            n=n.next;
        }


    }
    static class Node{
        private int data;
        private Node next;

        public Node(int data,Node next){
            this.data= data;
            this.next = next;
        }
        public Node(int data){
            this.data= data;
        }

    }




}




