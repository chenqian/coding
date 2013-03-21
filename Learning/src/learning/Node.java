/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package learning;

/**
 *
 * @author Administrator
 */
public class Node {
    public Object data;
    Node next;
    
    public Node(Object data){
        this.data = data;
        this.next = null;
    }
    
    public void AddToTail(Object d){
        Node end = new Node(d);
        Node now = this;
        while(now.next!=null){
            now = now.next;
        }
        now.next = end;
        
    }
    
    public void AddToTail(Node node){
        Node now = this;
        while(now.next!=null){
            now = now.next;
        }
        now.next = node;
    }
    
   public void ShowNode(){
       Node now = this;
       if(now.data==null){
           System.out.println("Null Node !" );
           return;
       }
       while(now.next!=null){
           System.out.println("Node : "+ now.data.toString() );
           now = now.next;
       }
       System.out.println("Node : "+ now.data.toString() );
   }
}
