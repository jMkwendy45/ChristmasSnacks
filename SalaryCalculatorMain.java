package ChristmasSnacks;


import java.util.Scanner;

public class SalaryCalculatorMain {
    public static void main(String[] args) {
        SalaryCalculator salaryCalculator = new SalaryCalculator();


         salaryCalculator.setOverTime(1.5);
         salaryCalculator.setNumberOfHours(40.0);
        Scanner input = new Scanner(System.in);

        for (int i=1; i<=3;i++){
            System.out.printf("Employee %d weekly hours: ", i);
            salaryCalculator.setNumberOfHours(input.nextDouble());

            System.out.printf("Employee %d hourly pay: ", i);
            salaryCalculator.setHourlyPay(input.nextDouble());

            System.out.printf("Employee %d gross pay: %.2f\n", i, salaryCalculator.getGrossPay());

        }










    }
}




