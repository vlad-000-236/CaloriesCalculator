package org.calclulator;

import lombok.Getter;

public class Calculator {

    @Getter
    private double calories;
    private void calculator(double foodCalories, double foodWeight){
        calories = (foodCalories/100)*foodWeight;
    }
}