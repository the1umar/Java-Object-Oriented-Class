package chapter10.ch10assignment;

/**
 *
 * @author Elite
 */
public class Person {
    private String name;
    private String number;
    private String email;
    
    public Person() {
        name = null;
        number = null;
        email = null;
    }
    
    public Person(String n, String num, String em) {
        name = n;
        number = num;
        email = em;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public String getNumber() {
        return number;
    }
    
    public void setNumber(String num) {
        number = num;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String em) {
        email = em;
    }
    
    @Override
    public String toString() { //toString to print allthe stuff
        return "Name: " + this.getName() +
               "\nPhone: " + this.getNumber() +
               "\nEmail: " + this.getEmail();
    }
} //Class end
