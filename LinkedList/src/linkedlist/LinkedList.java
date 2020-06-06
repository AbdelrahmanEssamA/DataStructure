
package linkedlist;
/**
 *
 * @author Abdo
 */
public class LinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        /*
        
        lList.insert(list, 1);
        lList.insert(list, 20);
        lList.printList(list);
        System.out.println("size: "+lList.size(list));
        */
        lList list2 = new lList();
        lList.insert(list2, 1);
        lList.insert(list2, 20);
        lList.insert(list2, 9);
        lList.insert(list2, 15);
        //lList.deleteNode(list2, 1);
        //lList.deleteNodeAtPos(list2, 6);
        lList.findNodeAtPos(list2, 2);
        lList.findPos(list2, 9);
        lList.printList(list2);
        //lList list = new lList();
//        if(lList.isEmpty(list)){
//            System.out.println("true");
//        }
//        else
//            System.out.println("false");
        lList.iterativeReverse(list2);
        lList.printList(list2);
        list2.head = lList.recursiveReverse(list2.head);
        lList.printList(list2);
    }
    
}
