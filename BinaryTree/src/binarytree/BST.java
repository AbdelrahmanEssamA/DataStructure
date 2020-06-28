
package binarytree;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Node{
    int key;
    Node Left;
    Node right;
}
public class BST {
    public Node createNewNode(int x){
        Node n = new Node();
        n.key  =  x;
        n.Left = null;
        n.right =null;
        return n; 
    }
    ArrayList<Integer> l = new ArrayList<>();
    public void ClearList(){
        l = new ArrayList<>();
    }
    public Node insert(Node node, int val){
         if (node == null)
             return createNewNode(val);
         
         if( val > node.key)
             node.right = insert(node.right,val);
         
         else if(val< node.key)
             node.Left = insert(node.Left,val);
        
         return node;
    }
    public Node delete(Node node, int val){
        if (node == null)
            return null;
        
        if(val < node.key) 
            node.Left = delete(node.Left, val);
        
        else if(val > node.key)
            node.right = delete(node.right, val);
        
        else{
            if (node.Left == null || node.right == null){
                Node temp = null;
                temp = node.Left == null ? node.right : node.Left;
                if(temp == null)
                    return null;
                else 
                    return node;
            }
            else{
                Node n  = node.right;
                while (n.Left!=null){
                    n =n.Left;
                }
                node.key = n.key;
                node.right = delete(node.right, n.key);
            }
        }
        return node;
    }
    public String inorder(Node node){
        if(node == null)
            return null;    
        
        inorder(node.Left);
        l.add(node.key);
        inorder(node.right);
        
        return l.toString();
        
    }
    public String preorder(Node node){
         if(node == null)
            return null;
        l.add(node.key);
        preorder(node.Left);
        preorder(node.right);
        return l.toString();
    }
    public String postorder(Node node){
        if(node == null)
            return null;
        
        postorder(node.Left);
        postorder(node.right);
        l.add(node.key);
        return l.toString();
    }
    public boolean isPresent(Node node, int val){
        if(node == null){
            System.out.println("elment is present");
            return false;
        }
           
        boolean present = false;
        while(node!=null){
            
            if(val<node.key)
                node = node.Left;
            else if(val>node.key)
                node = node.right;
            else{
                present = true;
                System.out.println("elment is present");
                break;
            }
            
        }
        if(!present)
            System.out.println("elment is not present");
        return present;
    }
    public Node getParent(Node node, int val){
        if(node == null){
            System.out.println("tree is empty");
            return null ;
        }
        Node parent = null;
        while(node!=null){
           if(val<node.key){
               parent = node;
               node = node.Left;
           }
           else if(val>node.key){
               parent = node;
               node = node.right;
           }
           else
               break;
           
        }
        return parent;
        
    }
    public Node getSibllings(Node node, int val){
        if(node == null){
            System.out.println("tree is empty");
            return null ;
        }
        
        Node parent = null;
        while(node!=null){
           if(val<node.key){
               parent = node;
               node = node.Left;
           }
           else if(val>node.key){
               parent = node;
               node = node.right;
           }
           else
               break;
           
        }
        if(val > parent.key)
            return parent.Left;
        else if (val < parent.key)
            return parent.right;
        else
            return null;
        
        
    }
}

