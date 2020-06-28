/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


/**
 *
 * @author Abdo
 */
public class BSTTest {
    BST i = new BST();
    Node root = null;
    
    public BSTTest() {
    }
    
    @Before
    public void beforeTestes(){
        
        root = i.insert(root, 8);
        root = i.insert(root, 3);
        root = i.insert(root, 6);
        root = i.insert(root, 10);
        root = i.insert(root, 4);
        root = i.insert(root, 7);
        root = i.insert(root, 1);
        root = i.insert(root, 14);
        root = i.insert(root, 13);
    }
    
    @Test
    public void testCreateNewNode() {
        BST i = new BST();
        int x = 8;
        int expected = 8;
        int actual = i.createNewNode(x).key;
        assertEquals(expected, actual);
        
    }

 
    @Test
    public void testInsert() {
        BST b = new BST();
        int x = 8;
        Node node = b.createNewNode(x);
        int expected = 3;
        node = b.insert(node, 3);
        
        int actual = node.Left.key;
        assertEquals(expected, actual);
    }
    
    
    
    @Test
    public void testInorder(){
        i.ClearList();
        String actual = i.inorder(root);
        String expected = "[1, 3, 4, 6, 7, 8, 10, 13, 14]";
      
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPreorder(){
        i.ClearList();
        String actual = i.preorder(root);
        String expected = "[8, 3, 1, 6, 4, 7, 10, 14, 13]";
      
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPstorder(){
        i.ClearList();
        String actual = i.postorder(root);
        String expected = "[1, 4, 7, 6, 3, 13, 14, 10, 8]";
      
        assertEquals(expected, actual);
    }
    
    @Test
    public void testIsPresentPosstive(){
        boolean expected = true;
        boolean actual = i.isPresent(root, 1);
        assertEquals(expected, actual);     
    }
    
    @Test
    public void testIsPresentNeative(){
        boolean expected = false;
        boolean actual = i.isPresent(root, 200);
        assertEquals(expected, actual);     
    }  
    
    @Test
    public void testGetParent(){
        int expected = 10;
        int actual = i.getParent(root, 14).key;
        assertEquals(expected, actual);
        
    }
    
    @Test 
    public void testGetSibling(){
        int expected = 7;
        int actual = i.getSibllings(root, 4).key;
        assertEquals(expected, actual);
    }
    
    
}
