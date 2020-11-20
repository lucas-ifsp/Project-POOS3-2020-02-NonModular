package br.edu.ifsp.poo.class06;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class StudentRepository {

    private Map<String, Student> pooStudents = new LinkedHashMap<>();

    public StudentRepository() {
        pooStudents.put("Bleiner", new Student("Bleiner", 20, 7.1, true));
        pooStudents.put("Lamas", new Student("Lamas", 29, 5.1, true));
        pooStudents.put("Larissa", new Student("Larissa", 19, 2.1, true));
        pooStudents.put("Cerosi", new Student("Cerosi", 22, 9.2, true));
        pooStudents.put("Rivelli", new Student("Rivelli", 48, 0.0, false));
    }

    public Optional<Student> findOne(String name){
        Optional<Student> student = Optional.ofNullable(pooStudents.get(name));
        return student;
    }
}
