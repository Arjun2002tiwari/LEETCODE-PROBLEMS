public class Leetcode75{
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next=null;
        }
    }
    Node head=null;
    void create(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    void reverse(){
        Node prev = null;
        Node node = head;

    while (node != null) {
        Node aux = node.next;
        node.next = prev;
        
        prev = node;
        node = aux;
    }
    
    }
    public static void main(String[] args) {
        Leetcode75 lc = new Leetcode75();
        lc.create(1);
        lc.create(2);
        lc.create(3);
        lc.create(4);
        lc.create(5);
        lc.print();
        //lc.reverse();
        //lc.print();
    }
}