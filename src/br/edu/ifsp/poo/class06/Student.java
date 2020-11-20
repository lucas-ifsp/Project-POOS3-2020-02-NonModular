package br.edu.ifsp.poo.class06;

public class Student {

    private String name;
    private Integer age;
    private Double grade;
    private Boolean enrolled;

    public Student(String name, Integer age, Double grade, Boolean enrolled) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.enrolled = enrolled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public Boolean getEnrolled() {
        return enrolled;
    }

    public void setEnrolled(Boolean enrolled) {
        this.enrolled = enrolled;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", enrolled=" + enrolled +
                '}';
    }
}
