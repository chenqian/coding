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
    }
}
