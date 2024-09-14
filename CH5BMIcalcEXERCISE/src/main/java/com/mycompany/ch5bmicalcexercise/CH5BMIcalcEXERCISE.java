package com.mycompany.ch5bmicalcexercise;
/**
 * KOREDE AFOLAMI, JDK 2.1
 * 6/21/2024
 * This program calculates BMI with a functional method
 */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class CH5BMIcalcEXERCISE {
    public static void main(String[] args) {
        String response = JOptionPane.showInputDialog(null,
                "Enter your height in inches");
        double height = Double.parseDouble(response);
        response = JOptionPane.showInputDialog(null,
                "Enter your weight in pounds");
        double weight = Double.parseDouble(response);
        double bmi = calculateBMI(height, weight);
        DecimalFormat pattern = new DecimalFormat("###.00");
        JOptionPane.showMessageDialog(null, "Height: " + height +
                "\nWeight: " + weight +
                "\nBMI: " + pattern.format(bmi));
    }
    
    public static double calculateBMI(double height, double weight) {
        return (weight*703)/(height*height);
    }
}
