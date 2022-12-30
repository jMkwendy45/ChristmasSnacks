package ChristmasSnacks;

import java.util.Scanner;

public class CalculatingSales {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

          int  productNumber = 0;
          int    counter = 0;
        while (productNumber!= 6) {

            System.out.println("1 - Product 1, $2.98");
            System.out.println("2 - Product 2, $4.50");
            System.out.println("3 - Product 3, $9.98");
            System.out.println("4 - Product 4, $4.49");
            System.out.println("5 - Product 5, $6.87");
            System.out.println("6 - Exit program");
            System.out.print("Enter product number: ");
            productNumber = input.nextInt();

            counter = counter + 1;
            System.out.println("Enter quantity sold");
            int quantity = input.nextInt();
            double productPrice;

            switch (productNumber) {
                case 1:

                    productPrice = 2.98 * quantity;
                    System.out.println("actual price is"+productPrice);
                    break;

                case 2:
                    productPrice = 4.50*quantity;
                    System.out.println("actual price is"+productPrice);
                    break;
                case 3:
                    productPrice = 9.98 * quantity;
                    System.out.println(productPrice);
                    break;
                case 4:
                    productPrice = 4.49*quantity;
                    System.out.println(productPrice);
                    break;
                case 5:
                    productPrice = 6.68*quantity;
                    System.out.println(productPrice);
                    break;
                default:








            }

        }

    }


}

