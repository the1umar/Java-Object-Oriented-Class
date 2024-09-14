package finalproject.finalproject;

/**
 *
 * @author Elite
 */
public class Hero {
    //FIELD:
    private double hitPoints;
    
    //CONSTRUCTORS:
    public Hero() throws HitPointException{
        throw new HitPointException();
    }
    
    public Hero(double hp) throws HitPointException {
        if (hp < 0) {
            throw new HitPointException();
        } else 
            hitPoints = hp;
    }
    
    //SETTER, GETTER, TOSTRING
    public void setHitPoints(double hp) throws HitPointException {
        if (hp < 0) {
            throw new HitPointException();
        } else 
            hitPoints = hp;
    }
    
    public double getHitPoints() {
        return this.hitPoints;
    }
    
@Override
    public String toString() {
        return "I am a hero. I have " + this.hitPoints + " hit points!";
    }
}
