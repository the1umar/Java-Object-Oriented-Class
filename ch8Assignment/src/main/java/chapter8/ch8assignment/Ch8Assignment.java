package chapter8.ch8assignment;

/**
 *
 * @author Elite
 */
public class Ch8Assignment {

    public static void main(String[] args) {
        //create months
        Month month1 = new Month(10);
        Month month2 = new Month(11);
        
        //toStrings to print the stuff
        System.out.println(month1.toString());
        System.out.println(month2.toString());
        
        //conditionals and equals method to check if months are same
        if (month1.equals(month2)) {
            System.out.println(month1.getMonthName() + " is equal to " + month2.getMonthName());
        } else {
            System.out.println(month1.getMonthName() + " is not equal to " + month2.getMonthName());
        }
    }
}
