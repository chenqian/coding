/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ShelterQueue;

/**
 * @Author chen qian @Edit Time 10:40:39 PM
 */
public class Node<T> {

    public T data;
    Node<T> next;
    int count = 0;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public Node() {
        this.data = null;
        this.next = null;
        count = 100;
    }

    public void AddToTail(Object d) {
        Node end = new Node(d);
        Node now = this;
        while (now.next != null) {
            now = now.next;
        }
        now.next = end;

    }

    public void AddToTail(Node<T> node) {
        if (count != 100) {

            Node now = this;
            while (now.next != null) {
                now = now.next;
            }
            now.next = node;
        } else {
            count --;
            this.data = node.data;
            this.next = node.next;
        }

    }

    public Boolean isEmpty() {
        if (this.data == null && this.next == null) {
            return true;
        }
        return false;
    }

    public void ShowNode() {
        Node now = this;
        if (now.data == null) {
            System.out.println("Null Node !");
            return;
        }
        while (now.next != null) {
            System.out.println("Node : " + now.data.toString());
            now = now.next;
        }
        System.out.println("Node : " + now.data.toString());
    }
}
