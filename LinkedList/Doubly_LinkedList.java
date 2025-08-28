public class Doubly_LinkedList {

    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null, tail = null;

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Insert at beginning
    public void insertBegin(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Insert at specific position (1-based index)
    public void insertAt(int pos, int data) {
        if (pos <= 1) {
            insertBegin(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        int count = 1;

        while (current != null && count < pos - 1) {
            current = current.next;
            count++;
        }

        if (current == null || current.next == null) {
            insert(data); // Insert at end
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
    }

    // Display forward
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Display reverse
    public void reverseDisplay() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }

    // Delete a node by value
    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;

        // Deleting head
        if (current.data == data) {
            head = head.next;
            if (head != null)
                head.prev = null;
            else
                tail = null; // List is now empty
            return;
        }

        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Value not found");
            return;
        }

        if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    // Search a node
    public void search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                System.out.println("Match found: " + data);
                return;
            }
            current = current.next;
        }
        System.out.println("Match not found");
    }

    // Reverse the list
    public void reverse() {
        Node current = head;
        Node temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }
    }

    // Find the middle element
    public void findMid() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle Element: " + slow.data);
    }

    // MAIN METHOD
    public static void main(String[] args) {
        Doubly_LinkedList dll = new Doubly_LinkedList();

        dll.insert(10);
        dll.insert(20);
        dll.insert(30);
        dll.insert(40);
        dll.insert(50);

        dll.display();
        dll.reverseDisplay();

        dll.insertBegin(5);
        dll.display();

        dll.insertAt(3, 15);
        dll.display();

        dll.delete(30);
        dll.display();

        dll.search(20);
        dll.search(100);

        dll.findMid();

        System.out.println("Reversing the entire list:");
        dll.reverse();
        dll.display();
    }
}
