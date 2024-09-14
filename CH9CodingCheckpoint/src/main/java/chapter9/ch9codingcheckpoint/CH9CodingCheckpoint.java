package chapter9.ch9codingcheckpoint;

/**
 * 7/21/2024
 * @author Korede Afolami :)
 */

// PLEASE HELP ME DEBUG WHY THIS IS RETURNING INVALID ONLY. I FEEL LIKE I GRASP
// THE CONCEPT HERE AND HAVE MADE A SILLY MISTAKE...

import java.util.Scanner;
public class CH9CodingCheckpoint {

    public static void main(String[] args) {
        System.out.print("Enter a sentence: ");
        
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.next();
        int uppers = 0;
        int lowers = 0;
        if (input.length() >= 3 && input.length() <= 50) {
            if (input.contains(".") || input.contains("?") 
                    || input.contains("!")) {
                for (int i = 0; i < input.length(); i++) {
                    if (Character.isUpperCase(input.charAt(i))) {
                        uppers++;
                    } else if (Character.isLowerCase(input.charAt(i))) {
                        lowers++;
                    }    
                }
                if (uppers > 0 && lowers >0) {
                    System.out.println("Valid");
                } else
                    System.out.println("Invalid");
            } else
                System.out.println("Invalid");
        } else
            System.out.println("Invalid");
    }
}
