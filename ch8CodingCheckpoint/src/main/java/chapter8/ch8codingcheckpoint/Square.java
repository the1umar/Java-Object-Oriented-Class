package chapter8.ch8codingcheckpoint;

/**
 *
 * @author Korede Afolami
 */
public class Square {
    private int lengthOfSide;
    
    public Square(int length) {
        setLenghtOfSide(length);
    }
    public void setLenghtOfSide(int length) {
        lengthOfSide = length;
    }
    public int getLengthOfSide() {
        return this.lengthOfSide;
    }
    public int calculateArea() {
        return lengthOfSide * lengthOfSide;
    }
    public String toString() {
        return "\nLength of side: " + this.lengthOfSide +
        "\nArea: " + calculateArea();
    }
    public boolean equals(Square square2) { 
        if (this.lengthOfSide == square2.getLengthOfSide()) {
            return true;
        } else {
            return false;
        }
    }
} //End of CLass
