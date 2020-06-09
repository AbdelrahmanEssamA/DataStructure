
package queue;

/**
 *
 * @author Abdo
 */
public class Queue {

    int front;
    int rear;
    int size;
    int capacity;
    int data;
    int queue[];
    
    public Queue(){
        this.capacity = 5;
        this.size = 0;
        this.rear = -1;
        this.front = -1;   
        this.queue =  new int[capacity];
    }
    
    public boolean isEmpty(){
        return(size==0);
    }
    
    public boolean isFull(){
        return(capacity == 0);
    }
    
    public void enqueue(int data){
        
        if(isFull()){
            System.out.println("queue is full");
        }
        
        else if(isEmpty()){
            front = 0;
            rear =0;
            size++;
            queue[rear]=data;
            capacity--;
            System.out.println(data+": was enqueued");
        }
        else{
            rear++;
            size++;
            System.out.println(data+": was enqueued");
            queue[rear]=data;
            capacity--;
        }
        
    }
    
    public void deque(){
        if(isEmpty()){
            System.out.println("queue is empty");
        }
        else if(front == rear){
           System.out.println(queue[front-1]+": was dequed");
            front =-1;
            rear = -1;
            
            size--;
        }
        else{
            front++;
            System.out.println(queue[front-1]+": was dequed");
            size--;
        }
    }
    
    public void front(){
        System.out.println("the item in the front of the queue is: "+queue[front]);
    }
    public void rear(){
        System.out.println("the item in the end of the queue is: "+queue[rear]);
    }
    
    public void printQueue(){
        System.out.print("queue:  ");
        if(isEmpty()){
            System.out.println("queue is Empty");
        }
        else{
            for(int n = front ; n<size; n++){
                System.out.print(queue[n]+" ");
            }
            System.out.println("");  
        }
    }
}
