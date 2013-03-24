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
    int Capacity;
    int Size;
    
    public Stack(){
        Capacity = Integer.MAX_VALUE;
        top = null;
        Size = 0;
    }
    
    public Stack(int c){
        Capacity = c;
        top = null;
        Size = 0;
    }
    
    public Object pop(){
       if(top!=null){
           Object ret = top.data;
           top = top.next;
           --this.Size;
           return ret;
       }
       return null;
    }
    
    public void push(Object o){
        Node n =  new Node(o);
        n.next = this.top;
        this.top = n; 
        ++this.Size;
    }
    
    public Object peek(){
        return this.top.data;
    }
    
    public Boolean isEmpty(){
        if(top==null)
            return true;
        return false;
    }
    
    public Boolean isFull(){
        if(this.Size >= this.Capacity)
            return true;
        return false;
    }
    
}
