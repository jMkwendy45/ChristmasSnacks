package ChristmasSnacks;

public class ClassAverage {
    private double average;

    public void setAverage() {
        
        if (average > 0.0) {
            if (average <= 100) {
                average = 100;
            }
        }
    }

    public double getAverage(double average) {
        return average;

    }
}