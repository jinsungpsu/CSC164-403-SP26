import java.util.Scanner;

public class FunctionsReview2 {
    // "global" variable
    static int correctPin = 1234;
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(1);
        System.out.println("Hello World");
        System.out.println(2.2);

        while(true) {
            System.out.println(keyboard.nextInt());
            if (keyboard.nextInt() == 99) {
                break;
            }
        }

        int[][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,13}
        };
        System.out.println(sumOfRow(array, 3));

        int crazyExpression = sumOfRow(array, 2) + 5 - 99;

        System.out.printf("\nThe average of row %d is %.2f", 3, avgOfRow(array, 3));
    }

    /*
    Checks whether a pin number is correct or incorrect (as in a ATM machine or phone/tablet)

    some possibilities:
    password - meh
    passwordValidation
    if (validatePassword())
    checkPin
    validPin

    where is the correct pin???
    let's just assume it's coming from elsewhere
     */

    static boolean validPin(int pin) {
        // correct is in a variable called
        // correctPin
        if (pin == correctPin)
            return true;
        else
            return false;

        // alternatively... single line
        // return (pin == correctPin);
    }

    /*
    Write a method that does input validation - for example, an integer between 1 and 5

    return type?
    the value itself?  or boolean?

    possible names:
    getValueBetweenIntegers
    validInput
    inputIsValid

    getInputInRange
    getValidInput

     */

    static int getInputInRange(int min, int max) {
        int num = 0;
        do {
            System.out.printf("\nEnter a number between %d and %d (inclusive): ", min, max);
            num = keyboard.nextInt();
        } while (num < min || num > max);
        return num;
    }

    /*
    Write a method that adds up a specific row of values in a 2 dimensional array of integers.
     */

    static int sumOfRow(int[][] arr, int row) {
        int sum = 0;
        for (int col = 0; col < arr[row].length; col++) {
            sum += arr[row][col];
        }
        return sum;
    }

    static double avgOfRow(int[][] arr, int row) {
        //return sumOfRow(arr, row) / (arr[row].length + 0.0);
        return Double.valueOf(sumOfRow(arr, row)) / (arr[row].length);
    }

}
