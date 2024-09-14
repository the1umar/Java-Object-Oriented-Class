/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package chapter7.ch7assignment;

/**
 *
 * @author Elite
 */
import java.util.Scanner;

public class CH7Assignment {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many types of soda do you want to sell?");
        int numSodas = keyboard.nextInt();
        
        while(numSodas <= 0) {
            System.out.println("How many types of soda do you want to sell?");
            numSodas = keyboard.nextInt();
        }
        
        String[] sodaNames = new String[numSodas];
        int[] sodaSold = new int[numSodas];
        
        for(int i = 0; i < numSodas; i++) {
            System.out.println("Enter the name of soda type " + (i+1) + ": ");
            sodaNames[i] = keyboard.next();
        }
        for(int i = 0; i <numSodas; i++) {
            int bottlesSold;
            System.out.println("Enter the number of " + sodaNames[i] + 
                    " bottles sold: ");
            bottlesSold = keyboard.nextInt();
            while (bottlesSold < 0) {
                System.out.println("Enter the number of " + sodaNames[i] + 
                    " bottles sold: ");
                bottlesSold = keyboard.nextInt();
            }
            sodaSold[i] = bottlesSold;
        }
        int totalSales = 0;
        int highestSold = 0;
        int lowestSold = 0;
        
        for(int i = 0; i < numSodas; i++) {
            totalSales += sodaSold[i];
            if(sodaSold[i] > sodaSold[highestSold]) {
                highestSold = i;   
            }
            if(sodaSold[i] < sodaSold[highestSold]) {
                lowestSold = i;
            }
        }
        System.out.println("\n");
        System.out.println("Total Sold: " + totalSales);
        System.out.println("Highest Sold: " + sodaNames[highestSold]);
        System.out.println("Lowest Sold: " + sodaNames[lowestSold]);
    }
}
