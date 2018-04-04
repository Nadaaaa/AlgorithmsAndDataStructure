/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsanddatastructure.DataStructure.Stack;

import algorithmsanddatastructure.Node;

/**
 *
 * @author Nada Badr El Deen
 */
public class LinkedStack<T> {

    int Length;
    Node<T> Head;

    LinkedStack() {
        Length = 0;
        Head = null;
    }

    boolean isEmpty() {
        return Length == 0;
    }

    void push(T Data) {
        Node tmp = new Node(Data);
        tmp.setNext(Head);
        Head = tmp;
        Length++;
    }
    
    void pop(){
        
    }
}
