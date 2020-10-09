package br.edu.ifsp.poo.class01;

import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfBooks = scanner.nextInt();

        if(numberOfBooks <= 0){
            System.out.println("Erro");
            return;
        }

        double criterionA = 0.25 * numberOfBooks + 7.5;
        double criterionB = 0.5 * numberOfBooks + 2.5;

        if(criterionA < criterionB){
            System.out.println("Criterio A");
        }else if(criterionB < criterionA){
            System.out.println("Criterio B");
        } else {
            System.out.println("Indiferente");
        }
    }
}
