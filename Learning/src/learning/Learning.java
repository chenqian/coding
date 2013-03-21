/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package learning;

/**
 *
 * @author chen qian
 */
public class Learning {

    /**
     * @param args the command line arguments
     */
    static void Show(Object str){
        System.out.println(str);
    }
    
    static void change(WrapInt i)
    {
      i.data++;
      Show(i.data);
    }
    
     public static Node DeleteNode(Node head, Object i){
        Node tmp = head;
        if(tmp.data==i){
            return head.next;
        }
        //in head and tmp they both contain like a collection of instance nodes
        //it is passing by reference, then change in tmp will not affect head
        //but change in Node instance itself will make head change too
            while(tmp.next!=null){
                if(tmp.next.data == i){
                    tmp.next = tmp.next.next;
                    return head;
                }
                tmp = tmp.next;
            }
        
        return null;
    }
     
    public static void main(String[] args) {
        // TODO code application logic here
        Show(Hash_Map.buildMap("tbfghyreesstb"));
        
        BNode t = BNode.BuildNodes();
        Show(BST.IsBST(t));
        
        Show(BST.IsBalance(t));
        
        WrapInt test = new WrapInt();
        test.data = 0;
        change(test);
        Show(test.data);
        
        Node n  = new Node(1);
        n.AddToTail(2);
        n.AddToTail(3);
        n.AddToTail(4);
        n.AddToTail(5);
        n= DeleteNode(n,3);
        n.ShowNode();
        n = new Node(null);
        n.ShowNode();
    }
}
