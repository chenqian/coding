/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package learning;

/**
 * @Author chen qian
 * @Edit Time 3:23:08 PM
 */
public class Queue {//FIFO
    Node First, Last;
    
    public Queue(){
        this.First = null;
        this.Last = null;
    }
      public void Enqueue(Object item){
        Node tmp = new Node(item);
        if(this.First == null){
             this.First = tmp;
             this.Last = tmp;
        }else{
           this.Last.next = tmp;
           this.Last = this.Last.next;
        }
    }
    
    public Object Dequeue(){
        if(this.First == null)
        return null;       
        Object ret = this.First.data;
        this.First = this.First.next;
        return ret;
    }
/*
 *  My method is so complicated.
 */
//    public void Enqueue(Object item){
//         Node tmp = new Node(item);
//        if(this.First == null){
//             this.First = tmp;
//             this.Last = tmp;
//        }else{
//            Node f = this.First;
//            while(f.next!=null){
//                f = f.next;
//            }
//            f.next = tmp;
//            //this.First.addToTail(item);
//            this.Last = tmp;
//        }
//    }
//    
//    public Object Dequeue(){
//         if(this.First == null){          
//               return null;
//        }
//        if(this.First == this.Last){
//              Node ret = this.First;
//              this.First = null;
//              this.Last = null;
//              return ret.data;
//        }
//
//        
//        Object ret = this.Last.data;
//        Node f = this.First;
//        Node la = this.Last;
//        while(true){
//            if(f.next == la)
//            break;
//            f = f.next;
//        }
//        this.Last = f;
//        f.next = null;
//        return ret;
//    }
    
    public void ShowQueue(){
        if(this.First!=null){
            First.ShowNode();
        }else{
            System.out.println("NULL QUEUE!");
        }
    }
}
