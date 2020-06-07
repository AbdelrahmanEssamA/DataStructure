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
public class Node { 
  
    int data; 
    Node next, prev; 
  
         
    Node(int data){ 
        this.data = data; 
        this.next = null; 
        this.prev = null;
    } 
} 
