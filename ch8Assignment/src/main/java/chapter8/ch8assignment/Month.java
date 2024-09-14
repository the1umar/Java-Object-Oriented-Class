
package chapter8.ch8assignment;

/**
 *
 * @author KOREDE AFOLAMI
 */
public class Month {
    private int monthNumber; 
    
    private static final String[] MONTH_NAMES = { //static to share across all
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };
    
    public Month(int m) { //constructor
        if (m >= 1 && m <= 12) {
            this.monthNumber = m;
        } else {
            this.monthNumber = 1;
        }
    }
    public void setMonthNumber(int m) { //month number setter
        if (m >= 1 && m <= 12) {
            this.monthNumber = m;
        } else {
            this.monthNumber = 1;
        }
    }
    public int getMonthNumber() { // month number getter
        return this.monthNumber;
    }
    public String getMonthName() { //month name getter using month number
        return MONTH_NAMES[this.monthNumber - 1];
    }
    public String getSeason() {
        switch (this.monthNumber) {
            case 12: case 1: case 2:
                return "Winter";
            case 3: case 4: case 5:
                return "Spring";
            case 6: case 7: case 8:
                return "Summer";
            case 9: case 10: case 11:
                return "Fall";
            default:
                return "Unknown"; // This should never happen
        }
    }
    public String toString() { //toString to print allthe stuff
        return "Month Number: " + this.monthNumber +
               "\nMonth Name: " + this.getMonthName() +
               "\nSeason: " + this.getSeason();
    }
    public boolean equals(Month month2) { //equals method to equalize
        if (this.monthNumber == month2.getMonthNumber())
            return true;
        else 
            return false;
    }
} //END OF CLASS
