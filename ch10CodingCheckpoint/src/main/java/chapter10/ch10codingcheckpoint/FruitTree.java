/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter10.ch10codingcheckpoint;

/**
 *
 * @author Elite
 */
public class FruitTree extends Tree{
    private String fruitType;
    
    FruitTree(String n, String h, String type) {
        super(n, h);
        fruitType = type;
    }
    
    public void setFruitType(String type) {
        fruitType = type;
    }
    
    public String getFruitType() {
        return fruitType;
    }
    
    @Override    
    public String toString() {
        return super.toString() + "\nFruit Type: " + this.fruitType;
    }
}
