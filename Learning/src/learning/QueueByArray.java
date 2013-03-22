/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package learning;

/**
 * @Author chen qian
 * @Edit Time 4:37:03 PM
 */
public class QueueByArray {
    int StackSize = 10;
    Object[] Buffer = new Object[3*StackSize];
    int[] Pointer = { -1 , -1 , -1};
    
    public void push(Object item, int StackNum) throws Exception{
        //StackNum should be 0,1,2
        if(StackNum <0 || StackNum >=3){
            System.out.println("StackNum is Invalid!");
            return;
        }
        if(Pointer[StackNum]== (StackSize-1)){
            System.out.println("The Stack is full!");
            return;
        }
        ++Pointer[StackNum];
        Buffer[StackNum*StackSize + Pointer[StackNum] ] = item;
    
    }
    
    public Object pop(int StackNum){
        if(StackNum <0 || StackNum >=3){
            System.out.println("StackNum is Invalid!");
            return null;
        }
        if(Pointer[StackNum]== -1){
            System.out.println("The Stack is Empty!");
            return null;
        }
         --Pointer[StackNum];
        return Buffer[StackNum*StackSize + Pointer[StackNum] +1 ];               
    }
    
    public Object peek(int StackNum){
           if(StackNum <0 || StackNum >=3){
            System.out.println("StackNum is Invalid!");
            return null;
        }
        if(Pointer[StackNum]== -1){
            System.out.println("The Stack is Empty!");
            return null;
        }
        return Buffer[StackNum*StackSize + Pointer[StackNum] ];     
    }
}
