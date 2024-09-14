package finalproject.finalproject;

/**
 *
 * @author Elite
 */

//THE NAME ISN'T THE SAME AND THE MESSAGE ISN'T THE SAME BECAUSE I MADE THIS
//EXCEPTION BEFORE I READ THE EXCEPTION PART AND I DONT WANNA MAKE TWO.
public class HitPointException extends Exception {
    public HitPointException() {
        super("Error: Your hero was not assigned valid healthpoints");
    }
}
