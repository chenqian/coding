/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package learning;

/**
 *
 * @author Administrator
 */
public class Stack {
    Node top;
    
    public Object pop(){
       if(top!=null){
           Object ret = top.data;
           top = top.next;
           return ret;
       }
       return null;
    }
    
    public void push(Object o){
        Node n =  new Node(o);
        n.next = this.top;
        this.top = n;
        
    }
    
    public Object peek(){
        return this.top.data;
    }
}
