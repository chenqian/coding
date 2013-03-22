/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package learning;

import java.util.ArrayDeque;

/**
 * @Author chen qian
 * @Edit Time 4:05:43 PM
 */

public class StackOfMin extends Stack{
    ArrayDeque MinList;
    int Min;
    
    public StackOfMin(){
        this.MinList = new ArrayDeque(); 
        Min = Integer.MAX_VALUE;      
    }
    
    @Override
    public Object pop(){ 
       Object ret = super.pop();
       if(ret!=null){
           if((int)ret == Min){
               MinList.pop();
               Min = (int)MinList.peek();
           }
       }
       return ret;
    }
    
    @Override
    public void push(Object o) {
        if((int)o <= Min){
            MinList.push((int)o);
            Min = (int)o;        }
        super.push(o);
    }
    
    public int GetMin(){
        return this.Min;
    }
    
    
   
}
//public class StackOfMin {
//    Node top;
//    ArrayDeque MinList;
//    int Min;
//    
//    public StackOfMin(){
//        this.top = null;
//        this.MinList = new ArrayDeque(); 
//        Min = Integer.MAX_VALUE;      
//    }
//    
//    public Object pop(){
//       if(top!=null){
//           Object ret = top.data;
//           top = top.next;
//           ClearList();
//           return ret;
//       }
//       return null;
//    }
//    
//    public void push(Object o) throws Exception{
//    
//        Node n =  new Node(o);
//        n.next = this.top;
//        this.top = n;
//        SetList(o);
//    }
//    
//    public int GetMin(){
//        return this.Min;
//    }
//    
//    private void ClearList() {
//        MinList.pop();
//        Min = (int)MinList.peek();
//    }
//    private void SetList(Object o)throws Exception {
//        try{
//            MinList.push(Math.min((int)o,Min));
//            Min = Math.min((int)o,Min);
//        }catch(Exception ex){
//        throw new Exception(ex.getMessage());
//        }
//    }
//    
//    public Object peek(){
//        return this.top.data;
//    }
//}
