package com.company;

/**
 * Created by Daniel_D'AGE on 13.05.2018.
 */
public class SimpleCheckTemp {
    public static void main(String[] args) {

        int positiveTemp = 15;
        int negativeTemp = -15;

        isTempPositive(positiveTemp);
        isTempPositive(negativeTemp);

    }

    private static boolean isTempPositive(double temp){
        boolean isPositive = temp > 0;

        if (isPositive){
            System.out.println("Temperatura" + temp + " jest dodatnia!");
        }else{

            System.out.println("Temperatura" + temp + " jest ujemna!");
        }
        return isPositive;
    }

}
