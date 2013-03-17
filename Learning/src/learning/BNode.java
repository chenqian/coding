/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package learning;

/**
 * @Author chen qian
 * @Edit Time 6:38:46 PM
 */
public class BNode {
    public int data;
    public BNode left;
    public BNode right;
    
    BNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
    
    
    public static BNode BuildNodes(){
        BNode ret = new BNode(10);
        ret.left = new BNode(5);
        ret.right = new BNode(12);
//        ret.left.left= new BNode(4);
//        ret.left.right= new BNode(8);      
        ret.right.right = new BNode(14);
//        ret.right.left = new BNode(11);   
        ret.right.right.right = new BNode(18);
        return ret;
    }
}
