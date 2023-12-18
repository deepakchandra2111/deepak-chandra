public class doublylinkedlist {
    public static class node{
        int val;
        node next;
        node prev;
        node(int val){
            this.val = val;
        }
    }
    public static node insert(node head , int val){
         node temp = new node(val);
         temp.next = head;
         head.prev = temp;
         head = temp;
         return head;
        }
    public static void display(node head){
        node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        node a = new node(4);
        node b = new node(10);
        node c = new node(2);
        node d = new node(99);
        node e = new node(13);
        a.next = b;
        b.prev = a;
        b.next = c ;
        c.prev = b;
        c.next = d ;
        d.prev = c;
        d.next = e;
        e.prev = d;
        node newhead = insert(a, 43);
        display(newhead);

    }
}
