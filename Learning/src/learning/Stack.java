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
        Node tmp = top;
        while(tmp.next!=null){
            tmp = tmp.next;
        }
        return tmp;
    }
    
    public Object peek(){
        return this.top.data;
    }
}
