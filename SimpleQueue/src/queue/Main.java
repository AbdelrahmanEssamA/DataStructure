package queue;

/**
 *
 * @author Abdo
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.front();
        q.rear();
        
        q.printQueue();
        q.deque();
        q.deque();
        q.front();
        q.rear();
        q.deque();
        q.printQueue();
    }
}
