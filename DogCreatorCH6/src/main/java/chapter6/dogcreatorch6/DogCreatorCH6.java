package chapter6.dogcreatorch6;

/**
 * KOREDE AFOLAMI, JDK 2.1
 * 6/29/2024
 * CH6 Exercise: Setters & Getters
 */
public class DogCreatorCH6 {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Zippy" , 69);
        Dog dog2 = new Dog("Bomboclaat", 55);
        Dog dog3 = new Dog("Gronk", 55);
        
        System.out.println("Name: " + dog1.getName());
        System.out.println("Weight: " + dog1.getWeight());
        System.out.println("Name: " + dog2.getName());
        System.out.println("Weight: " + dog2.getWeight());
        System.out.println("Name: " + dog3.getName());
        System.out.println("Weight: " + dog3.getWeight());
        System.out.println("\n");
        
        System.out.println(dog1.compare(dog2));
        System.out.println(dog3.compare(dog1));
        System.out.println(dog3.compare(dog2));
        System.out.println("\n");
        
        dog3.setWeight(23);
        System.out.println("Name: " + dog3.getName());
        System.out.println("Weight: " + dog3.getWeight());
        System.out.println(dog1.compare(dog3));
        System.out.println(dog3.compare(dog2));
    }
}
