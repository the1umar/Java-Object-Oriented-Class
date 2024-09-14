package finalproject.finalproject;

/**FINAL PROJECT (WOW I'M EMOTIONAL WHAT A RIDE)
 * 8/6/2024
 * @author KOREDE AFOLAMI, JDK 2.1
 */
public class FinalProject { //THIS WAS FUN TO MAKE

    public static void main(String[] args) {
        //TRY/CATCH SETUP BECAUSE OF EXCEPTIONS
        try {
            Hero[] shadowWizardMoneyGang = new Hero[3];
            shadowWizardMoneyGang[0] = new Hero(777);
            shadowWizardMoneyGang[1] = new Hero(519);
            shadowWizardMoneyGang[2] = new Elf(1250, "Flight");
            //LOOP TO PRINT:
            for(Hero aHero: shadowWizardMoneyGang) {
                System.out.println(aHero.toString());
            }
        } catch(HitPointException e) {
            System.out.println(e.getMessage());
        }
        //ERROR HANDLING TRIAL:
        try {
            Hero jonSnow = new Hero();
        } catch (HitPointException e) {
            System.out.println(e.getMessage());
        }
    }
}
