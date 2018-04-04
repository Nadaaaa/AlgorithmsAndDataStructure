/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsanddatastructure;

/**
 *
 * @author Nada Badr El Deen
 */
public class Node<T> {

    protected T Data;
    protected Node Next;

    public Node() {
        Data = null;
        Next = null;
    }

    public Node(T Data) {
        this.Data = Data;
    }

    public Node(T Data, Node Next) {
        this.Data = Data;
        this.Next = Next;
    }

    public T getData() {
        return Data;
    }

    public void setData(T Data) {
        this.Data = Data;
    }

    public Node getNext() {
        return Next;
    }

    public void setNext(Node Next) {
        this.Next = Next;
    }

}
