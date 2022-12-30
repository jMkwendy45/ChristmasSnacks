package ChristmasSnacks;

public class SalaryCalculator {
    private double numberOfHours;
    private double hourlyPay;
    private double overTime;

    public void setNumberOfHours(double hours) {
        this.numberOfHours = hours;
    }


    public void setOverTime(double overTime) {
        this.overTime = overTime;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public double getGrossPay() {
        double grossPay;
        if (numberOfHours <= 40) {
            grossPay = numberOfHours * hourlyPay;
        }
        else{
            overTime = numberOfHours / 2;
            grossPay = (numberOfHours + overTime) * hourlyPay;
        }
        return grossPay;
        }

    }
