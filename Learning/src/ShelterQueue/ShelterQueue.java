/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ShelterQueue;

import java.util.LinkedList;


/**
 * @Author chen qian
 * @Edit Time 10:38:37 PM
 */
public class ShelterQueue {
    LinkedList<Dog> dogs = new LinkedList<>();
    LinkedList<Cat> cats = new LinkedList<>();
    private int ts = 0;

    public void Enqueue(Animal a) throws Exception{
        a.SetIndex(ts);
        ++ts;
        if(a instanceof Dog){
            Dog d = (Dog)a;
            dogs.add(d);
        } else if(a instanceof Cat) {
            Cat c = (Cat)a;
            cats.add(c);
        } else {
            throw new Exception("UnKnown Animal Type !");
        }    
    }
    
    public Animal DequeueDog(){
        if(dogs.isEmpty())
            return null;
        Animal a = dogs.poll();
        return a;
    }
    
    public Animal DequeueCat(){
        if(cats.isEmpty())
            return null;
        Animal a = cats.poll();
        return a;
    }
    
    public Animal DequeueAny(){
        if(cats.isEmpty()){
            return DequeueDog();
        }else if(dogs.isEmpty()){
            return DequeueCat();
        } else if (dogs.peek().isOlderThan(cats.peek())){
            return DequeueDog();
        }
        return DequeueCat();     
    }
    
    public static void main(String[] args) throws Exception {
        ShelterQueue sq = new ShelterQueue();
         System.out.println(sq.DequeueAny()); // null
          System.out.println(sq.DequeueCat()); // null
           System.out.println(sq.DequeueDog()); // null
        sq.Enqueue(new Dog("a dog"));
        sq.Enqueue(new Cat("a cat"));
        sq.Enqueue(new Dog("b dog"));
        sq.Enqueue(new Cat("b cat"));
        sq.Enqueue(new Dog("c dog"));
        sq.Enqueue(new Dog("d dog"));
        sq.Enqueue(new Cat("c cat"));
        sq.Enqueue(new Cat("d cat"));
        System.out.println(sq.DequeueAny().name); // a dog
        System.out.println(sq.DequeueAny().name); // a cat
        System.out.println(sq.DequeueCat().name); // b cat
        System.out.println(sq.DequeueAny().name); // b dog
        System.out.println(sq.DequeueCat().name); // c cat
        System.out.println(sq.DequeueAny().name);
        System.out.println(sq.DequeueAny().name);
        System.out.println(sq.DequeueAny().name);
        System.out.println(sq.DequeueAny());

        
    }
}
