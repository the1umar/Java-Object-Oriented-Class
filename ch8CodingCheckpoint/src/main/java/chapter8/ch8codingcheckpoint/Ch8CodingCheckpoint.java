/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package chapter8.ch8codingcheckpoint;

/**
 * CODING CHECKPOINT
 * @author KOREDE AFOLAMI
 */
public class Ch8CodingCheckpoint {

    public static void main(String[] args) {
        Square square1 = new Square(2);
        Square square2 = new Square(4);
        
        //pardon my output spacing :)
        System.out.println("Square 1: \n" + square1.toString() + "\n");
        System.out.println("Square 2: \n" + square2.toString());
        
        if (square1.equals(square2)) {
            System.out.println("The squares are equal");
        } else {
            System.out.println("The squares are not equal");
        }
    }
}
