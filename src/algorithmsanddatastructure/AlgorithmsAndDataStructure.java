/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsanddatastructure;

import java.util.Scanner;
import algorithmsanddatastructure.DataStructure.LinkedList.LinkedList;

/**
 *
 * @author Nada Badr El Deen
 */
public class AlgorithmsAndDataStructure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        Scanner reader = new Scanner(System.in);  // Reading from System.in
//        System.out.println("Enter a number: ");
//        int n = reader.nextInt(); // Scans the next token of the input as an int.
////once finished
//        reader.close();
        // System.out.println("HI");
        LinkedList linkedList = new LinkedList();
        System.out.println(linkedList.isEmpty());
        linkedList.append(20);
        linkedList.append(30);
        linkedList.append(60);
        linkedList.append(90);
        //linkedList.append(50);
        System.out.println(linkedList.isEmpty());
        //System.out.println(linkedList.getLength());
        linkedList.print();
        //System.out.println("insert");
//        linkedList.insertAt(2, 2);
//        linkedList.insertAt(3, 3);
//        linkedList.insertAt(6, 6);
        //linkedList.insertAt(1, 15);
        //linkedList.print();

        System.out.println("delete");
        linkedList.deleteAt(3);
        linkedList.deleteAt(1);
        linkedList.print();

        System.out.println(linkedList.isExist(90));
    }

}
