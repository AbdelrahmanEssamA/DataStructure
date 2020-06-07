/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Abdo
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Stack s = new Stack();
       s.push(3);
       s.push(5);
       s.push(7);
       s.push(4);
       s.push(29);
       s.push(13);
       s.push(3);
       s.push(2);
       s.showElement();
        
       
       System.out.println("Stack size is : " + s.size());
       s.pop();
       s.pop();
       s.pop();
       s.pop();
       s.push(89);
       s.peak();
       
       System.out.println("Stack size is : " + s.size());
       s.showElement();
    }
}
