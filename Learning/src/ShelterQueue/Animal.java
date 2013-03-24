/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ShelterQueue;

/**
 * @Author chen qian
 * @Edit Time 10:37:28 PM
 */
public abstract class Animal{
    private int index;
    protected String name;
    
    public Animal(String n){
     this.name = n;
    }
    
    public void SetIndex(int o){
        this.index = o;
    }
    
    public int GetIndex(){
        return this.index;
    }
    
    public Boolean isOlderThan(Animal a){
        return this.index < a.GetIndex();
    }
}
