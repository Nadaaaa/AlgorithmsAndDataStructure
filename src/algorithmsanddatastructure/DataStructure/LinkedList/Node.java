/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsanddatastructure.DataStructure.LinkedList;

/**
 *
 * @author Nada Badr El Deen
 */
public class Node {

    protected int Data;
    protected Node Next;

    public Node() {
        Data = 0;
        Next = null;
    }

    public Node(int Data) {
        this.Data = Data;
    }

    public Node(int Data, Node Next) {
        this.Data = Data;
        this.Next = Next;
    }

    public int getData() {
        return Data;
    }

    public void setData(int Data) {
        this.Data = Data;
    }

    public Node getNext() {
        return Next;
    }

    public void setNext(Node Next) {
        this.Next = Next;
    }

}
