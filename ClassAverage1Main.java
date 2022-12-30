package ChristmasSnacks;

import java.util.Scanner;

public class ClassAverage1Main {
    public static void main(String[] args) {
    ClassAverage1 classAverage1 = new ClassAverage1();
    Scanner input = new Scanner(System.in);
    classAverage1.setNumberOfStudents(10);
        classAverage1.setAverage();

    int sum = 0;

    int gradeCounter=1;
    while (gradeCounter<=10) {
        System.out.println("Enter a grade");
        int grade = input.nextInt();

        sum = sum + grade;
        gradeCounter = gradeCounter + 1;
    }
        System.out.println("the total of the students is " +classAverage1.getAverage(sum));
    System.out.println("average of the students is"+classAverage1.getAverage(sum/classAverage1.getNumberOfStudents()));



    }





    }





