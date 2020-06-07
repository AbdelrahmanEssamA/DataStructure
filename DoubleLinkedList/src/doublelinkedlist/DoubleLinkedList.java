/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelinkedlist;

/**
 *
 * @author Abdo
 */
public class DoubleLinkedList {

    public static void main(String[] args) {
        
        Dlist list2 = new Dlist();
        list2.insertLast(list2, 5);
        list2.insertLast(list2, 20);
        list2.insertLast(list2, 9);
        list2.insertLast(list2, 15);
        
        list2.printList(list2);
        
        //Dlist.insertFirst(list2, 1);
        //Dlist.insertAfterNode(list2, 44, 1);
        //Dlist.insertBeforeNode(list2,33,2);
        //Dlist.deleteatPos(list2, 3);
        //Dlist.deletNode(list2,5);
        list2.recursiveReverse();
        
        list2.printList(list2);
    }
    
}
