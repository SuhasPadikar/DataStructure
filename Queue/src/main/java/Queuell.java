
    import java.util.Scanner;

    public class Queuell {
        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        Node f = null;
        Node r = null;

        public void enqueue(Scanner sc) {
            System.out.println("Enter data ");
            int data = sc.nextInt();
            Node new_node = new Node(data);
            if (f == null) {
                f = new_node;
                r = new_node;
            } else {
                r.next = new_node;
                r = new_node;
            }
        }

        public void dequeue() {
            if (f == null) {
                System.out.println("underflow");
            } else {
                f = f.next;
            }
        }

        public void display() {
            Node temp = f;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }


    }