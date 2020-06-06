package linkedlist;

public class lList {
    Node head;

    
    public static lList insert(lList list ,int data){
        
        Node newNode = new Node(data);
        
        newNode.next =null;
        
        //if the list is empty assign as head
        if(list.head == null)     
           list.head = newNode;
         
        else{
            Node currentNode = list.head;
            
            while(currentNode.next !=null)
                currentNode = currentNode.next;
            
            currentNode.next = newNode;     
        }
        return list;
        
    }
    public static void printList(lList list) { 
        Node currNode = list.head; 
   
        System.out.print("LinkedList: "); 
   
        // Traverse through the LinkedList 
        while (currNode != null) { 
            // Print the data at current node 
            System.out.print(currNode.data + " "); 
   
            // Go to next node 
            currNode = currNode.next; 
        } 
        System.out.println("");
    } 
    public static int size(lList list) {
        Node currentNode = list.head;
        int count =1;
        while(currentNode.next != null){
            currentNode =  currentNode.next;
            count++;
        }
        return count;
        
    }
    public static lList deleteNode(lList list, int data){
        //if it is the head
        if(list.head.data == data)
        {
            list.head = list.head.next;
            return list;
        }
        
        Node currentNode = list.head;
        Node prevNode = null;
       
        while(currentNode!= null && currentNode.data!=data){
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        //if it is at the middle or the end
        if(currentNode!=null){
            prevNode.next = currentNode.next;
            return list;
        }
        // if it does not exist
        else{
            System.out.println("Node does not exist");
            return list;
        }
      
    }
    public static lList deleteNodeAtPos(lList list, int pos){
        if(pos == 0){
            list.head = list.head.next;
            return list;
        }
        else if( pos > lList.size(list)-1 || pos < 0){
            System.out.println(pos + " position element not found"); 
            return list;
                    
        }
        else{
            Node currentNode = list.head;
            Node prevNode = null;
            int count =0;
            for(int i = 0; i<pos; i++){
                prevNode =currentNode;
                currentNode = currentNode.next;
            }
            prevNode.next = currentNode.next;
        }
        return list;
    }
    public static void findNodeAtPos(lList list, int pos){
        if(pos == 0){
            
            System.out.println(pos + " position element is the head: "+list.head.data ); 
        }
        else if( pos > lList.size(list)-1 || pos < 0){
            System.out.println(pos + " position element not found"); 
            
        }
        else{
            Node currentNode = list.head;
            
            int count =0;
            for(int i = 0; i<pos; i++){
                
                currentNode = currentNode.next;
            }
             System.out.println(pos + " position element is the head: "+currentNode.data );
        }
        
    }
    public static void findPos(lList list, int data){
        //if it is the head
        if(list.head.data == data)
        {
            list.head = list.head.next;
             System.out.println(data + "element is the head at pos 0" );
        }
        
        Node currentNode = list.head;
        int count = 0;
        while(currentNode!= null && currentNode.data!=data){
            count++;
            currentNode = currentNode.next;
        }
        //if it is at the middle or the end
        if(currentNode!=null){
             System.out.println(data + " position element is the head: "+count );
        }
        // if it does not exist
        else{
            System.out.println("Node does not exist");
        }
      
    }    
    public static boolean isEmpty(lList list){
       if(list.head == null)
            return true;
       
       else
           return false;
    }
    public static lList iterativeReverse(lList list){
        Node currentNode = list.head;
        Node prevNode = null, nextNode = null;
        while(currentNode !=null){
            //save elnext
            nextNode = currentNode.next;
            //reverse current arrow
            currentNode.next =prevNode;
            //jump forward
            prevNode = currentNode;
            //jump forward
            currentNode = nextNode;   
        }
        list.head = prevNode;
        return list;
    }
    public static Node recursiveReverse(Node head){
        if(head == null || head.next == null){
            return head;
            
        }
        Node reveresedListHead = recursiveReverse(head.next);
        head.next.next =head;
        head.next = null;
        return reveresedListHead;
    }
}
