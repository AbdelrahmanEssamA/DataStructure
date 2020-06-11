package queue;

class Queue {

    int front, rear, size;
    int capacity;
    int queue[];

    public Queue(int capacity) {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        queue = new int[this.capacity];
    }

    public boolean isFull(Queue queue) {
        return (queue.size == queue.capacity);
    }

    public boolean isEmpty(Queue queue) {
        return (queue.size == 0);
    }

    public void enqueue(int item) {
        if (isFull(this)) {
            System.out.println("queue is full");
            return;
        }
        this.rear = (this.rear + 1)
                % this.capacity;
        this.queue[this.rear] = item;
        this.size = this.size + 1;
        System.out.println(item  + " enqueued to queue");
    }

    public void dequeue() {
        if (isEmpty(this)) {
            
            System.out.println("queue is empty");
        }

        int item = this.queue[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size - 1;
        System.out.println(item  + " was dequeued");
        
    }

    public int front() {
        if (isEmpty(this)) {
            System.out.println("queue is empty");
            return Integer.MIN_VALUE;
        }

        return this.queue[this.front];
    }

    public int rear() {
        if (isEmpty(this)) {
            System.out.println("queue is empty");
            return Integer.MIN_VALUE;
        }

        return this.queue[this.rear];
    }

    public void printQueue() {
        int count = (rear + capacity - front) % capacity + 1;
        System.out.print("queue:  ");
        if (isEmpty(this)) {
            System.out.println("queue is Empty");
        } else {
            for (int n = 0; n < size; n++) {
                int index = (front + n) % capacity;
                System.out.print(queue[index] + " ");
            }
            System.out.println("");
        }
    }

}
