package chapter6.dogcreatorch6;

/**
 * KOREDE AFOLAMI, JDK 2.1
 * 6/29/2024
 * CH6 Exercise: setters & getters
 */
public class Dog {
    private String name;
    private double weight; 
    
    public Dog(String n, double w) {
        setName(n);
        setWeight(w);
    }
    
    public final void setName(String n) { //final is for safe coding:overriding
        name = n;
    }
    
    public final void setWeight(double w) {//final is for safe coding:overriding
        if (w > 0) {
            weight = w;
        } else {
            System.out.println("Weight cannot be zero or less");
        }
    }
    
    public String getName() {
        return name;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public String compare(Dog dogCompare) {
        String message;
        if (dogCompare.weight > this.weight) {
            message = dogCompare.name + " weighs more than " + this.name;
        } else if (dogCompare.weight < this.weight){
            message =  this.name + " weighs more than " + dogCompare.name; 
        } else {
            message = this.name + " and " + dogCompare.name +" weigh the same.";
        }
        return message;
    }
} //end of class, do not cross
