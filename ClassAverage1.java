package ChristmasSnacks;

public class ClassAverage1 {

    private int numberOfStudents;
    private double average;


    public void setNumberOfStudents(int studentsNumber) {
        this.numberOfStudents = studentsNumber;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setAverage() {
        if (average > 0.0) {
            if (average <= 100) {
                average = 100;
            }
        }
    }

    public double getAverage(int average) {
        return average;
    }

}