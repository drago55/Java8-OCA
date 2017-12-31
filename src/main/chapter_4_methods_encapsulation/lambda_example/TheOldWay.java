package main.chapter_4_methods_encapsulation.lambda_example;

public class TheOldWay implements CheckIfPass {

    @Override
    public boolean isPassed(Student s) {
        return s.isPassed();
    }
}
