package tutorial4;
import java.util.Scanner;

public class MainQueue {
    public static void main(String[] args) {
        Queue queue = new Queue(5); // Capacity of the queue
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter student name (enter 'quite' to exit the program): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("quite")) {
                break;
            }
            queue.enqueue(input);
        }

        System.out.println("Dequeue process starts:");
        while (!queue.isEmpty()) {
            queue.dequeue();
        }

        scanner.close();
    }
}