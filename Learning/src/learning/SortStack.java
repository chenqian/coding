/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package learning;

/**
 * @Author chen qian
 * @Edit Time 9:31:40 PM
 */
public class SortStack{
     
    public static Stack SortStackByStack(Stack r){
        Stack s = new Stack();    
        while(!r.isEmpty()){
            int tmp = (int)r.pop();
            while(!s.isEmpty()&& (int)s.peek() > tmp){
                r.push(s.pop());
            }
            s.push(tmp);           
        }
        return s;
    }
    
    public static Stack BuildStack(){
        Stack ret = new Stack();
        ret.push(5);
        ret.push(2);
        ret.push(6);
        ret.push(7);
        ret.push(1);
        ret.push(3);
        return ret;
    }
}
