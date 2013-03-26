/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package LeetCode;

/**
 * @Author chen qian
 * @Edit Time 12:40:14 AM
 */
public class Add_Two_Numbers {
     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        // base case
        int c = 0;
        int m = 0;
        int n = 0;
        int sum = 0;
        ListNode ret = null;
        ListNode tmp = null;
        while(l1 !=null || l2 !=null){                       
            if(l1!=null){
                m = l1.val;
            } else {
                m = 0;
            }
            
            if(l2!=null){
                n= l2.val;
            } else {
                n = 0;
            }
            
            sum = m + n + c;
            
            if(sum >= 10){
                sum = sum%10;
                c = 1;
            } else {
                c = 0;
            }
            if(ret == null){
                ret = new ListNode(sum);
                tmp = ret;
            } else {
                tmp.next = new ListNode(sum);
                tmp = tmp.next;
            }            
          
            if(l1!=null){
                l1 = l1.next;
            }
            
            if(l2!=null){
                l2 = l2.next;
            }
        }  
        if(c == 1){
            tmp.next = new ListNode(c);
            tmp = tmp.next;
        }
        return ret;
    }
}
