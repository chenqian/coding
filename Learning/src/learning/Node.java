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
    
    public Node DeleteNode(Node head, Object i){
        Node tmp = head;
        if(tmp.data==i){
            return head.next;
        }
        
            while(tmp.next!=null){
                if(tmp.next.data == i){
                    tmp.next = tmp.next.next;
                    return head;
                }
                head = head.next;
            }
        
        return null;
    }
}
