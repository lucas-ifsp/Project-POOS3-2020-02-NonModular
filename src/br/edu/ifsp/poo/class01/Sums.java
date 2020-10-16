package br.edu.ifsp.poo.class01;

import java.util.Scanner;

public class Sums {

    static int sums = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            sums = sums + scanner.nextInt();
        }
        System.out.println("sums = " + sums);
    }
}
