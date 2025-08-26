public class deleteNafterM {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    Node head;

    void deleteNAfterM(Node head, int m, int n) {
        Node curr = head;

        while (curr != null) {
            // Skip M nodes
            for (int i = 1; i < m && curr != null; i++) {
                curr = curr.next;
            }
            if (curr == null) return;

            // Start from next node and delete N nodes
            Node t = curr.next;
            for (int i = 1; i <= n && t != null; i++) {
                t = t.next;
            }

            // Link back
            curr.next = t;
            curr = t;
        }
    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}

