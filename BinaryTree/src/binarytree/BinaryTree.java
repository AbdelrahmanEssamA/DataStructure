/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author Abdo
 */
public class BinaryTree {

    
    public static void main(String[] args) {
        BST i = new BST();
        Node root = null;
        root = i.insert(root, 8);
        root = i.insert(root, 3);
        root = i.insert(root, 6);
        root = i.insert(root, 10);
        root = i.insert(root, 4);
        root = i.insert(root, 7);
        root = i.insert(root, 1);
        root = i.insert(root, 14);
        root = i.insert(root, 13);
        // root = i .delete(root, 6);
        //i.inorder(root);
        i.preorder(root);
        i.isPresent(root, 1);
        Node p = i.gerParent(root, 14);
        Node s = i.getSibllings(root, 3);
        System.out.println(s.key);
        //System.out.println(p.key);
        
    }
    
}
