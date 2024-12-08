import java.util.Scanner;
public class twentysix{
    int[] queue;
    int front, rear, capacity;
    public QueueUsingArray(int size) {
        capacity = size;
        queue = new int[capacity];
        front = 0;
        rear = -1;
    }
    public void enqueue(int value) {
        if (rear == capacity - 1) {
            System.out.println("Queue Overflow");
        } else {
            queue[++rear] = value;
            System.out.println(value + " added to the queue");
        }
    }
    public void dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(queue[front++] + " removed from the queue");
        }
    }
    public void peek() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element is: " + queue[front]);
        }
    }
    public boolean isEmpty() {
        return front > rear;
    }
    public boolean isFull() {
        return rear == capacity - 1;
    }
    public void display() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int size = sc.nextInt();
        QueueUsingArray queue = new QueueUsingArray(size);
        while (true) {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Check if Queue is Empty");
            System.out.println("5. Check if Queue is Full");
            System.out.println("6. Display Queue");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter a number to enqueue: ");
                    int value = sc.nextInt();
                    queue.enqueue(value);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.peek();
                    break;
                case 4:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.println("Queue is not empty");
                    }
                    break;
                case 5:
                    if (queue.isFull()) {
                        System.out.println("Queue is full");
                    } else {
                        System.out.println("Queue is not full");
                    }
                    break;
                case 6:
                    queue.display();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
