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
public class LinkedList {

    Node Head;
    Node Tail;
    int Length;

    public LinkedList() {
        this.Head = new Node(0, null);
        this.Tail = new Node(0, null);
        this.Length = 0;
    }

    public int getLength() {
        return Length;
    }

    public boolean isEmpty() {
        return Length == 0;
    }

    public void append(int Value) {
        Node NewNode = new Node(Value, null);
        if (Length == 0) {
            Head = NewNode;
        } else {
            Node TempNode = Head;
            while (TempNode.Next != null) {
                TempNode = TempNode.Next;
            }
            TempNode.Next = NewNode;
        }
        Length++;
    }

    public void insertAt(int Index, int Value) {
        Node TempNode = Head;
        Node ToBeInsertedNode = new Node(Value, null);
        if (Index == 0) {
            ToBeInsertedNode.Next = TempNode;
            Head = ToBeInsertedNode;
        } else {
            int Cnt = 1;
            while (Cnt < Index - 1) {
                TempNode = TempNode.Next;
                Cnt++;
            }
            ToBeInsertedNode.Next = TempNode.Next;
            TempNode.Next = ToBeInsertedNode;
        }
        Length++;
    }

    public boolean isExist(int Value) {
        Node TempNode = Head;
        boolean isExist = false;
        while (TempNode.Data != Value) {
            TempNode = TempNode.Next;
            isExist = true;
            break;
        }
        return isExist;
    }

    public int findIndex(int Value) {
        Node TempNode = Head;
        int Cnt = 1;
        while (TempNode.Data != Value) {
            TempNode = TempNode.Next;
            Cnt++;
        }
        return Cnt;
    }

    public int findValue(int Index) {
        Node TempNode = Head;
        for (int i=0;i<Length ;i++){
            
        }
        return 0;
    }

    public void print() {
        Node TempNode = Head;
        for (int i = 0; i < Length; i++) {
            System.out.println(TempNode.Data);
            TempNode = TempNode.Next;
        }
    }

}
