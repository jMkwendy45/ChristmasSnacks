package ChristmasSnacks;

import java.util.Scanner;

public class ClassAverageMain {
    public static void main(String[] args) {
        ClassAverage classAverage = new ClassAverage();
        classAverage.setAverage();
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 0;


        System.out.println("Enter a grade or -1 to quit");


        int grade = 0;
        while (grade != -1) {
            grade = input.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;


        }
        if (gradeCounter != 0) {
            System.out.println("students grade total is\n" + total);
            System.out.println(" classAverage is\n" + classAverage.getAverage(total / gradeCounter));
        } else {
            System.out.println("no grades entered");
        }

    }
}


