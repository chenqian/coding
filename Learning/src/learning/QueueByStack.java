/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package learning;

/**
 * @Author chen qian
 * @Edit Time 6:01:34 PM
 */
public class QueueByStack{
    Stack s = new Stack();
    Stack t = new Stack();
    int Size = 0;
    
    public void Enqueue(Object o){
        if(!t.isEmpty()){
            while(!t.isEmpty())
            s.push(t.pop());
        }
        s.push(o);
        ++Size;
    }
    
    public Object Dequeue(){
        if(Size == 0){
            return null;
        } else if (!t.isEmpty()){
            --Size; 
            return t.pop();
        }
            
        while(!s.isEmpty())
        t.push(s.pop());
        Object ret = t.pop();
        --Size; 
        return ret;
    }
}
