package main.chapter_4_methods_encapsulation.lambda_example;

public class Student {

    private String name;
    private int grade;
    private boolean passed;


    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        assignPassValue(grade);
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public boolean isPassed() {
        return passed;
    }

    private void assignPassValue(int grade) {
        if (grade == 1) {
            this.passed = false;
        } else {
            this.passed = true;
        }
    }

}
