/**
 * Jdk 2.1, 7/20/2024
 * @author Korede Afolami
 */
import java.util.Scanner;

public class CH9ASSIGNMENT {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        // status boolean for tracking
        boolean status;
        
        do { //prompt
            System.out.println("Enter email address: ");
            String input = keyboard.next();
            
            //nested ifs for triple, dependent validation
            if (input.length() >= 15 && input.length() <= 25) {
                status = true;
                if (input.contains("@")) {
                    status = true;
                    // for loop to loop through string
                    for (int i = 0; i<input.length(); i++) {
                        if (Character.isDigit(input.charAt(i))) {
                            status = true;
                            break;
                        } else {
                            status = false;
                        }
                    }
                } else {
                    status = false;
                } 
            } else {
                status = false;
            }
            if (status == true) {
                System.out.println("Valid.");
            } else
                System.out.println("Invalid!");
        } while (status == false);
    }
} //nested stuff get so disgusting so fast :( </3
