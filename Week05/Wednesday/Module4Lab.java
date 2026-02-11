import java.util.Scanner;

public class Module4Lab {
    public static void main(String[] args) {
        int[] carSales = {5, 10, 12, 11, 3, 5, 1, 3, 5, 1, 3, 23};

        Scanner keyboard = new Scanner(System.in);

        int choice=0;
        do {
            System.out.println("What you wanna do? (1-4)");
            choice = keyboard.nextInt();

            switch (choice) {
                case 1:
                    showAllSales(carSales);
                    break;
                case 2:
                    // prompt user for what month
                    // call the function
                    int month = 5; // whatever they entered
                    showSalesByMonth(carSales, month);
                    break;
            }
        } while(choice != 4);
    }

    /*
    &nbsp;showAllSales
should display all the monthly sales
showSalesByMonth
should display the sales for a specific month
calculateCommissionByMonth
should calculate the commission earned, which is $500 per car sold
for every car after the first 20, the commission is $550 per car
Examples:
if the sales for a month were 15, the commission would be $500 * 15, or $7,500
if the sales for a month were 25, the commission would be $500 * 20 + $550 * 5, or $10,250
this method should return a value rather than just display it to the console
     */
    static void showAllSales(int[] salesData) {

    }

    static void showSalesByMonth (int[] salesData, int month) {
        System.out.printf("In month # %d, %d cars were sold", month, salesData[month-1]);
        //int[] carSales = {5, 10, 12, 11, 3, 5, 1, 3, 5, 1, 3, 23};
    }

    static double calculateCommissionByMonth(int[] salesData, int month) {
        return 99;
    }
}
