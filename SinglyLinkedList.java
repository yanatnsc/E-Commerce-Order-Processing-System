public class SinglyLinkedList {
    Node head;

    static class Node {
        Order order;
        Node next;

        Node(Order order) {
            this.order = order;
            this.next = null;
        }
    }

    public SinglyLinkedList() {
        head = null;
    }

    // Add a new order to the end of the list.
    public void append(Order order) {
        Node newNode = new Node(order);
        // If the Linked List is empty,
        // then make the new node as head
        if (head == null) {
            head = newNode;
        }
        else {
            // Else traverse till the last node and insert the new_node there
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    // Print out the list of orders from the first to the last.
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.order);
            current = current.next;
        }
    }

    // Reverse the linked list so that the last order becomes the first and vice versa.
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next; // Store the next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev and current pointers one step forward
            current = next;
        }
        head = prev; // Update the head pointer
    }
}
