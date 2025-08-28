public class Singly_LinkedList {
    
    class Node {
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node start = null, end = null;

    void insert(int n) {
        Node newnode = new Node(n);     //insert
        if(start == null){
            start = newnode;
            end = newnode;      
        } else {
            end.next = newnode;
            end = newnode;
        }
    }

    void insert_begin(int n){
        Node newnode = new Node(n);
        if(start == null){
            start = newnode;
            end = newnode;
        } else {
            newnode.next = start;
            start = newnode;
        }
    }
    void display(){
        Node i = start;
        while(i != null){
            System.out.print(i.data + " ");
            i = i.next;
        }
        System.out.println();
    }
    void insert_mid(int n, int pos){
        Node newnode = new Node(n); 
        if(start == null){
            start = newnode;
            end = newnode;
        } else {
            if(pos == 1){
                newnode.next = start;
                start = newnode;
                return;
            }
            Node c = start;
            int count = 1;
            while(count != pos - 1 && c != null){
                c = c.next;
                count++;
            }
            if(c == null){
                end.next = newnode;
                end = newnode;
                return;
            }
            newnode.next = c.next;
            c.next = newnode;
        }
    }

    void search(int n){
        Node i = start;
        while(i != null){
            if(i.data == n){
                System.out.println("Match found!");
                return;
            }
            i = i.next;
        }
        System.out.println("No match found.");
    }

    void delete(int n){
        if(start == null) return;

        if(n == start.data){
            start = start.next;
            if(start == null) end = null; //delete at start position
            return;
        }

        Node c = start, p = null;
        while(c != null && c.data != n){    //search at middle and delete
            p = c;
            c = c.next;
        }

        if(c == null) return; // not found

        p.next = c.next;
        if(p.next == null){
            end = p;
        }
    }

    void reverse(){
        Node n = null, c = start, p = null;
        while(c != null){
            n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        end = start;
        start = p;
    }

    public static void main(String[] args) {
        Singly_LinkedList m = new Singly_LinkedList();
        m.insert(10);
        m.insert(20);
        m.insert(30);
        m.insert(40);

        m.display();

        m.reverse();
        m.display();

        m.insert_begin(5);
        m.display();

        m.insert_mid(25, 3);
        m.display();

        m.search(30);
        m.search(100);

        m.delete(10);
        m.display();
    }
}
