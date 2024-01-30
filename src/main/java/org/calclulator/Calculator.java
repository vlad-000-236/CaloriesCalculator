package org.calclulator;

public class Calculator {
    private double calories;
    private void calculator(double foodCalories, double foodWeight){
        calories = (foodCalories/100)*foodWeight;
    }

    public double getCalories(){
        return calories;
    }
}