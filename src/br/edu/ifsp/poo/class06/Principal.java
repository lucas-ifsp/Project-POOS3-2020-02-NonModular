package br.edu.ifsp.poo.class06;

import java.util.Optional;
import java.util.function.Predicate;

public class Principal {

    public static void main(String[] args) {
        StudentRepository repo = new StudentRepository();

        repo.findOne("Cerosi")
                .filter(isApproved())
                .map(Student::getAge)
                .ifPresent(System.out::println);
    }

    private static Predicate<Student> isApproved() {
        return student -> student.getGrade() >= 6;
    }
}
