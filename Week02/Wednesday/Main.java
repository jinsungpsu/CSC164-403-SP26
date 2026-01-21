import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
comments!
 */

public class Main {
    public static void main(String[] args) {

        int numberOfWeekdays = 5;

        // user input
        // the "type" (or class name) is
        // going to be Scanner
        // similar to #include <iostream>
        // I need to import Scanner...
        // up top above the class
        // the "thing" we're going to assign to
        // this is the standard system input
        Scanner keyboard = new Scanner(System.in);

        // THE DELAWARE SNOW APP
        int[] snowDaysWilmington = {2, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int totalSnowDays = 0;
        for (int i = 0; i < 12; i++) {
            totalSnowDays += snowDaysWilmington[i];
        }

        double avgSnowDays = (double) totalSnowDays / 12;
        System.out.println("Average # of snow days is: " + (avgSnowDays + 1));
        // cout << "Average # of snow days is: " + avgSnowDays;

        System.out.println("Which month do you want to view? (1-12)");
        int monthNumber = keyboard.nextInt();

        if (monthNumber < 1 || monthNumber > 12) {
            // that month is not valid
        } else {
            System.out.println("In that month, there were " + snowDaysWilmington[monthNumber] + " snow days!");
        }

        int anotherNumber = keyboard.nextInt();

        int someOtherNumber = keyboard.nextInt();









        int small = 5;
        double big = 50.50;

        big = small;

        small = (int)big;

        // computers can only do operations
        // on LIKE/same numeric types


        System.out.println("Hi, my name is Jin");
        int numberOfHotDogs; // <-- camelCase!!!

        // const int MAX = 5;
        final int NUM_ROUNDS = 18;

        for (int i = 0; i < NUM_ROUNDS; i++) {
            if (++i%2 == 0) {
                // i is divisible by 2, AKA, i is even
            }else {
                // i is NOT divisible by 2, AKA, i is odd
            }
        }

        for (int i = 0; i < 500; i++) {
            System.out.print("*");
            if (i % 10 == 0) {
                System.out.println();
            }
        }


    }
}
