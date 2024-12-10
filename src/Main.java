public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Creating nodes manually
        Node firstNode = new Node(56);
        Node secondNode = new Node(30);
        Node thirdNode = new Node(70);

        // Linking the nodes
        list.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;

        // Display the linked list
        System.out.println("Linked List:");
        list.display();
    }
}
