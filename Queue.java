package tutorial4;
public class Queue {
    private String[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        queue = new String[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(String student) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + student);
            return;
        }
        queue[rear] = student;
        rear = (rear + 1) % capacity;
        size++;
        System.out.println("Enqueue " + student);
        printQueue();
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return;
        }
        String dequeuedStudent = queue[front];
        queue[front] = null;
        front = (front + 1) % capacity;
        size--;
        System.out.println("Dequeue " + dequeuedStudent);
        printQueue();
    }

    public void printQueue() {
        System.out.print("[");
        for (int i = 0; i < capacity; i++) {
            System.out.print(queue[i]);
            if (i < capacity - 1) System.out.print(", ");
        }
        System.out.println("] [front = " + front + ", rear = " + rear + ", length = " + size + "]");
    }
}