import java.util.*;

public class QueueDequeMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> queue = new ArrayDeque<>();
        int choice, value;

        do {
            System.out.println("\n--- Queue using Deque (Menu Driven) ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    value = sc.nextInt();
                    queue.addLast(value);   // enqueue
                    System.out.println("Element added to queue.");
                    break;

                case 2:
                    if(queue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Dequeued element: " + queue.removeFirst());
                    }
                    break;

                case 3:
                    if(queue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Front element: " + queue.peekFirst());
                    }
                    break;

                case 4:
                    if(queue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Queue elements: " + queue);
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while(choice != 5);

        sc.close();
    }
}
