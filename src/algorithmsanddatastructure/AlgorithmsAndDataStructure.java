/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsanddatastructure;

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
        LinkedList<Integer> linkedList;
        linkedList = new LinkedList<>();
        System.out.println(linkedList.isEmpty());
        linkedList.append(10);
        linkedList.append(20);
        linkedList.append(30);
        linkedList.append(40);
        //linkedList.append(50);
        System.out.println(linkedList.isEmpty());
        //System.out.println(linkedList.getLength());
        linkedList.print();

        System.out.println("Test insert At Function");
        linkedList.insertAt(0, 2);
        linkedList.insertAt(4, 3);
        linkedList.insertAt(5, 6);
        linkedList.insertAt(12, 15);
        linkedList.print();

        System.out.println("Test delete At Function");
        linkedList.deleteAt(3);
        linkedList.deleteAt(1);
        linkedList.deleteAt(0);
        linkedList.deleteAt(7);
        linkedList.print();
        
        System.out.println("Test Clear Function");
        linkedList.clear();
        linkedList.print();
        System.out.println(linkedList.Length());

        System.out.println("Test Is Exist Function");
        System.out.println(linkedList.isExist(10));
        System.out.println(linkedList.isExist(20));
        System.out.println(linkedList.isExist(30));
        System.out.println(linkedList.isExist(40));
        System.out.println(linkedList.isExist(50));
    }

}
