import java.util.Scanner;

public class FunctionsReview {
    /*
    adding the word "static" in front of a variable in this section
    inside of class but outside of any functions

    essentially makes it into a "global" variable
     */
    static Scanner keyboard = new Scanner(System.in);


    static void changer(int num) {
        num = 99;
        System.out.println("Value inside of changer function is " + num);
    }

    static void arrChanger(int[] nums) {
        nums[0] = 9999;
    }

    /*
    in C++
    you can do something like this:
    pass by reference
    means don't create another copy of number
    instead we are receiving the reference
    or memory location of the variable number
    void changer(int& number) {
    }
     */

    public static void main(String[] args) {
        /*
        pass by value example
         */
        int blah = 500;
        System.out.println("Before function call: " + blah);
        changer(blah);
        System.out.println("After function call: " + blah);

        int[] arr = {1, 2, 3};
        arrChanger(arr);
        System.out.println(arr[0]);

        int chairsForSale;
        double avgPriceOfChairs = 59.99;
        int chairsSoldToday = 400;
        String storeName = "Jamie's original #1 store!";
        int storeNumber = 1;
        printMenu(storeName, storeNumber);

        printMenu(99);

        chairsForSale = setupInventory();
        dailySales(chairsForSale, chairsSoldToday, avgPriceOfChairs);
        printReport();
    }

    static void printReport() {
        /*
        do some stuff
         */
        double profit = calculateProfit(); // <-- calling another function
        /*
        do some other stuff
         */
        return;
    }

    /*
    This function calculates the profits of the
    chair store
    ... more description ...
     */
    static double calculateProfit() {
        return 99.99;
    }


    /*
    Daily sales:
    This function will print out
    a report of
    how many chairs were sold
    and how many chairs are left in inventory
    and what the gross revenue
     */
    static void dailySales(int chairsAvailable, int chairsSold, double avgPrice) {
        System.out.printf("Daily Sales Report: \n");
        System.out.printf("Chairs sold: %d", chairsSold);
        System.out.printf(" out of %d chairs available.", chairsAvailable);
        System.out.printf("\nThe total revenue today was $%.2f", chairsSold*avgPrice);
    }

    static int setupInventory() {
        int chairsForSale;
        do {
            System.out.println("How many chairs are in inventory?");
            chairsForSale = keyboard.nextInt();
        } while (chairsForSale < 0);
        return chairsForSale;

    }

    static void printMenu(String name, int number) {
        System.out.println("###################");
        System.out.println("###################");
        System.out.println("#### welcome to ###");
        System.out.printf("## %s #\n", name);
        System.out.printf("## store number: %d\n", number);
        System.out.println("###################");
        System.out.println("###################");
        return;
    }
    static void printMenu(int number) {
        System.out.println("###################");
        System.out.println("###################");
        System.out.println("#### welcome to ###");
        System.out.printf("## nameless store... #");
        System.out.printf("## store number: %d", number);
        System.out.println("###################");
        System.out.println("###################");
        return;
    }


    static int sum (int num1, int num2) {
        return num1+num2;
    }
}
