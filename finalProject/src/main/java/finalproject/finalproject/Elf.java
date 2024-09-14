package finalproject.finalproject;

/**
 *
 * @author Korede Afolami, JDK 2.1
 */
public class Elf extends Hero {
    // Field
    private String special;
    
    //Constructor
    public Elf(double hp, String specs) throws HitPointException {
        super(hp);
        special = specs;
    }
    
    //Setter, Getter, ToString
    public void setSpecial(String specs) {
        special = specs;
    }
    public String getSpecial() {
        return this.special;
    }
    
    @Override
    public String toString() {
        return super.toString() + " My special power is " + this.special;
    }
    
    
}
