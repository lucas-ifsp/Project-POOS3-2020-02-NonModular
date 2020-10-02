package br.edu.ifsp.poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/***
 * Example got from LaunchCode class
 */
public class Debugging {

    public static void main(String[] args) {

        List<String> students = new ArrayList<>();
        List<Double> grades = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String newStudent;

        System.out.println("Entre com os estudantes (ou ENTER para encerrar):");

        do {
            newStudent = in.nextLine();
            if (!newStudent.equals(""))
                students.add(newStudent);
        } while (!newStudent.equals(""));

        for (String s : students) {
            System.out.print("Notas do aluno " + s + ": ");
            grades.add(in.nextDouble());
        }

        System.out.println("Notas da classe: ");
        double sum = 0.0;

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + " (" + grades.get(i) + ")");
            sum += grades.get(i);
        }

        double avg = sum / students.size();
        System.out.println("Média da turma = " + avg);
    }
}

