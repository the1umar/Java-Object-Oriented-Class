package chapter6.customerclassch6hw;
/** KOREDE AFOLAMI, JDK 2.1
 *  6/29/2024
 *  Customer Creator
 */
public class Customer {
    private String name = null;
    private double credit = 300;
    
    public Customer(String n, double cre) {
        setName(n);
        setCredit(cre);
    }
    public final void setName(String n) {
        name = n;
    }
    public final void setCredit(double cre) {
        if (cre >= 300) {
            credit = cre;
        } else {
            credit = 300;
        }
    }
    public String getName() {
        return name;
    }
    public double getCredit() {
        return credit;
    }
    public String getCreditRating() {
        String message;
        if (credit >= 200 && credit <= 629) {
            message = "Bad";
        } else if (credit >= 630 && credit <= 689) {
            message = "Fair";
        } else if (credit >= 690 && credit <= 719) {
            message = "Good";
        } else if (credit >= 720 && credit <= 850) {
            message = "Excellent";
        } else {
            message = "Your credit score is outside the range of evaluation.";
        }
        return message;
    }
} //no code outside class
