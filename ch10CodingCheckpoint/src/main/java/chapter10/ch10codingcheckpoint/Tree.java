/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter10.ch10codingcheckpoint;

/**
 *
 * @author Elite
 */
public class Tree {
    private String height;
    private String name;
    
    public Tree(String n, String h) {
        name = n;
        height = h;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String n) {
        name = n;
    }    
    
@Override    
    public String toString() {
        return "Name: " + this.name + "\nHeight in feet: " + this.height;
    }
}
