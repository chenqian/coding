/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package learning;

import java.util.ArrayList;
 import java.util.UUID; 

/**
 *
 * @author chen qian
 */
public class Learning {

    /**
     * @param args the command line arguments
     */
    static void Show(Object str) {
        System.out.println(str);
    }

    static void change(WrapInt i) {
        i.data++;
        Show(i.data);
    }

    public static Node DeleteNode(Node head, Object i) {
        Node tmp = head;
        if (tmp.data == i) {
            return head.next;
        }
        //in head and tmp they both contain like a collection of instance nodes
        //it is passing by reference, then change in tmp will not affect head
        //but change in Node instance itself will make head change too
        while (tmp.next != null) {
            if (tmp.next.data == i) {
                tmp.next = tmp.next.next;
                return head;
            }
            tmp = tmp.next;
        }

        return null;
    }

    public static void testarray(ArrayList<ArrayList<String>> s){
        ArrayList<String> k = new ArrayList<String>();
        k.add("test1");
        k.add("test2");
        s.add(k);
    }
    
    public static void main(String[] args) {
int [] n = new int[10];
int i = n.length;
  
      ArrayList<ArrayList<String>> test = new ArrayList<ArrayList<String>>();
      testarray(test);
      int k = 3;
      int kk=4;
      int kkk = 2;
      int t = k/2;
      int tt = k/2;
      
      int j = 5;
      
      String s = "abcde";
      String ss = s.substring(1, 1);
      String sss = s.substring(0, 1);
//    UUID uuid = UUID.randomUUID();
//    System.out.println(uuid.toString());
//    String s = uuid.toString();
//    UUID u = UUID.fromString(s);
//     System.out.println(u.toString());
//     if(u.equals(uuid))
//         System.out.println(u.toString());
        
//        SortStack.SortStackByStack(SortStack.BuildStack()).top.ShowNode();
        
//        QueueByStack qbs = new QueueByStack();
//        qbs.Enqueue(1);
//        qbs.Enqueue(2);
//        qbs.Enqueue(3);
//        qbs.Enqueue(4);
//        qbs.Enqueue(5);
//        qbs.Enqueue(6);
//        System.out.println("Dq  : "+qbs.Dequeue());
//        System.out.println("Dq  : "+qbs.Dequeue());
//        System.out.println("Dq  : "+qbs.Dequeue());
//                qbs.Enqueue(4);
//        qbs.Enqueue(5);
//        qbs.Enqueue(6);
//        System.out.println("Dq  : "+qbs.Dequeue());
//        System.out.println("Dq  : "+qbs.Dequeue());
//         System.out.println("Dq  : "+qbs.Dequeue());
//        System.out.println("Dq  : "+qbs.Dequeue());
//         System.out.println("Dq  : "+qbs.Dequeue());
//        System.out.println("Dq  : "+qbs.Dequeue());
//        System.out.println("Dq  : "+qbs.Dequeue());
        
        // test case
//        StackOfMin som = new StackOfMin();
//            try {
//                som.push(3);
//                System.out.println("Min is : "+som.GetMin());
//                som.push(5);
//                System.out.println("Min is : "+som.GetMin());
//                som.push(6);
//                System.out.println("Min is : "+som.GetMin());
//                som.push(8);
//                System.out.println("Min is : "+som.GetMin());
//                som.push(2);
//                                                System.out.println("Min is : "+som.GetMin());
//                som.push(1);
//                System.out.println("Min is : "+som.GetMin());
//                som.push(1);
//                System.out.println("Min is : "+som.GetMin());
//                som.push(10);
//                System.out.println("Min is : "+som.GetMin());
//                for(int i = 0;i<12;++i){
//                som.pop();
//                System.out.println("Min is 2 : "+som.GetMin());
//                }
//               
//                
//            } catch (Exception ex) {
//                System.out.println(ex.getMessage());
//            }



//  Test case for queue by array     
//        QueueByArray qba = new QueueByArray();
//        for (int i = 0; i < 12; i++) {
//            try {
//                qba.push(i, 0);  
//                qba.push(i * 2, 1);
//                 qba.push(i * 3, 2);
//            } catch (Exception ex) {
//                System.out.println(ex.getMessage());
//            }         
//        }
//        for (int i = 0; i < 3; i++) {
//            Object a = qba.pop(i);
//            while (a != null) {
//                System.out.println(a);
//                a = qba.pop(i);
//            }
//        }

        /*
         * // TODO code application logic here
         * Show(Hash_Map.buildMap("tbfghyreesstb"));
         *
         * BNode t = BNode.BuildNodes(); Show(BST.IsBST(t));
         *
         * Show(BST.IsBalance(t));
         */

        /*
         * Pass by reference WrapInt test = new WrapInt(); test.data = 0;
         * change(test); Show(test.data);
         */

        /*
         * Node Checking Node n = new Node(1); n.AddToTail(2); n.AddToTail(3);
         * n.AddToTail(4); n.AddToTail(5); n= DeleteNode(n,3); n.ShowNode(); n =
         * new Node(null); n.ShowNode();
         */

        /*
         * Implement Queue using LinkList
         *
         * Queue q = new Queue(); q.Enqueue(1); q.Enqueue(2); q.Enqueue(3);
         * q.Enqueue(4); q.Enqueue(5); q.ShowQueue(); q.Dequeue();
         * q.ShowQueue(); q.Dequeue(); q.ShowQueue(); q.Dequeue();
         * q.ShowQueue(); q.Dequeue(); q.ShowQueue(); q.Dequeue();
         * q.ShowQueue();
         */



    }
}
