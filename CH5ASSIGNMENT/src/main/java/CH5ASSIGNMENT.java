/**
 * KOREDE AFOLAMI
 * JDK2.1
 * 6/22/2024
 * METHODS GAME ASSIGNMENT
 */


import java.util.Scanner;
        
public class CH5ASSIGNMENT {

    public static void main(String[] args) {
        String answer;
        do {
            int rand = (int) (Math.random() * 10 + 1); //generate random no.
            boolean planetFact = switchPlanet(rand); // collect switchPlanet ans
            System.out.println("True or False?");//prompt user
            Scanner input = new Scanner(System.in);
            answer = input.next();//collect user input
            compare(answer, planetFact);//compare answer and display
            
            System.out.println("Play again? (yes/no)");
            answer = input.next();
            answer = answer.toLowerCase(); //strings being immutable not fun
        } while (answer.equals("yes"));
    }
    
    public static boolean switchPlanet(int rand) {
        switch(rand) {
            case 1:
                System.out.println("The earth is NOT flat.");
                return true;
            case 2:
                System.out.println("The earth is actually flat.");
                return false;
            case 3:
                System.out.println("The earth is the 3rd planet from the sun.");
                return true;
            case 4:
                System.out.println("The earth is 90% water and 10% land.");
                return false;    
            case 5:
                System.out.println("The earth is the only planet in the solar"
                        + " system that supports life.");
                return true;
            case 6:
                System.out.println("The earth is younger than 3 billion "
                        + "years old.");
                return false; 
            case 7:
                System.out.println("Earth is home to approximately 8 billion"
                        + " human beings.");
                return true;
            case 8:
                System.out.println("Earth is the hottest in the Milkyway");
                return false; 
            case 9:
                System.out.println("71% of earth's surface is covered by "
                        + "water.");
                return true;
            case 10:
                System.out.println("Earth is home to shapeshifting Skrulls");
                return false;
            default: //default invalid in case the random range somehow bugs out
                System.out.println("Invalid value: " + rand);
                return false;
        }
    }
    
    public static void compare(String answer, boolean planetFact) {
        answer = answer.toLowerCase(); //nested ifs
        if (planetFact == true) {
            if (answer.equals("true")) 
                System.out.println("Correct");
            else if (answer.equals("false"))
                System.out.println("Incorrect");
            else
                System.out.println("Invalid input");
        } else if (planetFact == false) {
            if (answer.equals("false")) 
                System.out.println("Correct");
            else if (answer.equals("true"))
                System.out.println("Incorrect");
            else
                System.out.println("Invalid input");
        }
    }
}