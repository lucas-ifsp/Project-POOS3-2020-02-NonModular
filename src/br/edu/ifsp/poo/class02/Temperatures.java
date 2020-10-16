package br.edu.ifsp.poo.class02;

import java.util.Scanner;


public class Temperatures {

    public static void main(String[] args) {
        final int DAYS_IN_A_WEEK = 7;

        int[] temperatures = new int[DAYS_IN_A_WEEK];
        int sumOfTemperatures = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < DAYS_IN_A_WEEK; i++) {
            temperatures[i] = scanner.nextInt();
            sumOfTemperatures += temperatures[i];
        }
        double averageTemperature = (double) sumOfTemperatures / DAYS_IN_A_WEEK;

        int aboveAverage = 0;
        for (int t : temperatures) {
            if(t > averageTemperature){
                aboveAverage++;
            }
        }

        System.out.println(aboveAverage);
    }
}
