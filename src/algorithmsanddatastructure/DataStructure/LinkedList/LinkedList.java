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

    public int Length() {
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
        if (Index == 0 | Index > Length) {
            System.out.println("The Range of the list is From 1 to " + Length);
        } else {
            Node TempNode = Head;
            Node ToBeInsertedNode = new Node(Value, null);
            Index -= 1;
            if (Index == 0) {
                ToBeInsertedNode.Next = TempNode;
                Head = ToBeInsertedNode;
            } else {
                int Cnt = 0;
                while (Cnt < Index - 1) {
                    TempNode = TempNode.Next;
                    Cnt++;
                }
                ToBeInsertedNode.Next = TempNode.Next;
                TempNode.Next = ToBeInsertedNode;
            }
            Length++;
        }
    }

    public boolean isExist(int Value) {
        Node TempNode = Head;
        boolean isExist = false;
        for (int i = 0; i < Length; i++) {
            if (TempNode.Data == Value) {
                isExist = true;
                break;
            } else {
                TempNode = TempNode.Next;
            }
        }
        return isExist;
    }

    public void print() {
        Node TempNode = Head;
        for (int i = 0; i < Length; i++) {
            System.out.println(TempNode.Data);
            TempNode = TempNode.Next;
        }
    }

    public void deleteAt(int Index) {
        if (Index <= 0 | Index > Length) {
            System.out.println("This Element Cannot be Deleted, The Length of the list is " + Length);
        } else {
            Node TempNode = Head;
            Node ToBeDeletedNode;
            Index--;
            if (Index == 0) {
                Head = TempNode.Next;
            } else {
                int Cnt = 0;
                while (Cnt < Index - 1) {
                    TempNode = TempNode.Next;
                    Cnt++;
                }
                ToBeDeletedNode = TempNode.Next;
                TempNode.Next = ToBeDeletedNode.Next;
            }
            Length--;
        }

    }

    public void clear() {
        while (Length > 0) {
            deleteAt(1);
        }
    }
}
