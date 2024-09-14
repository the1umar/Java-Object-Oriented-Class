package com.mycompany.ch5codingcheckpoint;

/**
 *KOREDE AFOLAMI
 * JDK2.1
 * 6/22/2024
 * CHAPTER 5 CODING CHECKPOINT
 */

import java.util.Scanner;

public class CH5CODINGCHECKPOINT {

    public static void main(String[] args) {
        System.out.println("What is the lenght of one side of a square?");
        Scanner input = new Scanner(System.in);
        int side = input.nextInt();
        
        int area = calculateArea(side);
        int perimeter = calculatePerimeter(side);
        
        System.out.println("The area is: " + area);
        System.out.println("The perimeter is: " + perimeter);
    }
    
    public static int calculateArea(int side) {
        return side * side;
    }
    
    public static int calculatePerimeter(int side) {
        return side * 4;
    }
    
}
