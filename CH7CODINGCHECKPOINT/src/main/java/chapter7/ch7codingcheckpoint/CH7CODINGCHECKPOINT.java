package chapter7.ch7codingcheckpoint;

/** KOREDE AFOLAMI UMAR, JDK2.1
 *  7/7/2024
 *  Coding Checkpoint 7
 */

public class CH7CODINGCHECKPOINT {

    public static void main(String[] args) {
        int[] scores = {90, 100, 80, 85, 63, 73, 80, 92, 90};
        int sum = 0;
        int average = 0;
        int largestScore = 0;
        int lowestScore = 0;
        
        for(int i = 0; i < scores.length; i++) {
            sum += scores[i];
            if (scores[i] > scores[largestScore]) {
                largestScore = i;
            }
            if (scores[i] < scores[lowestScore]) {
                lowestScore = i;
            }
        }
        average = (sum/(scores.length));
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;
        
        //loop through and add to counter for grades
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] <= 100 && scores[i] >= 90) {
                a++;
            } else if (scores[i] <= 89 && scores[i] >= 80) {
                b++;
            } else if (scores[i] <= 79 && scores[i] >= 70) {
                c++; //haha c++
            } else if (scores[i] <= 69 && scores[i] >= 60) {
                d++;
            } else if (scores[i] <= 59 && scores[i] >= 0) {
                f++;
            } else {
                System.out.println("Invalid test score.");
            }
        }
        //Output results
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
        System.out.println("The largest score is: " + scores[largestScore]);
        System.out.println("The lowest score is: " + scores[lowestScore]);
        System.out.println("The number of students with an A is: " + a);
        System.out.println("The number of students with a B is: " + b);
        System.out.println("The number of students with a C is: " + c);
        System.out.println("The number of students with a D is: " + d);
        System.out.println("The number of students with an F is: " + f);
    }
}
