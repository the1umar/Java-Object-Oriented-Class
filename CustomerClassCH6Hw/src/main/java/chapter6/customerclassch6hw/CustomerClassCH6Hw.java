package chapter6.customerclassch6hw;

/**
 * KOREDE AFOLAMI, JDK 2.1
 * 6/9/2024
 * Customer Credit Creator
 */
public class CustomerClassCH6Hw {

    public static void main(String[] args) {
        Customer customer1 = new Customer("Kennedy Walker", 650);
        System.out.println("Name: " + customer1.getName());
        System.out.println("Credit Score: " + customer1.getCredit());
        System.out.println("Credit Rating: " + customer1.getCreditRating());
    }
}
