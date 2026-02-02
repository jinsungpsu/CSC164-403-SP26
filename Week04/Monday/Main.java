//import java.util.Scanner;
import java.util.*;

public class Week04 {
    /*
    Let intelliJ work for YOU!!!
    Autocomplete is helpful

    you can press ctrl+space to ask for suggestions
    you can press tab or enter to accept the suggestion

    for main:
    try: "main" or "psvm"

    for System.out.println, use "sout"
     */
    public static void main(String[] args) {

        int[] cars = {9, 2, 3, 5, 1,35,3,2,3,5,1};

        // we can create arrays with
        // an explicit size
        boolean[] stuff = new boolean[5];
        stuff[0] = true;

        //implicit = not stated
        // define array AND
        // also initialize with stuff
        // implied size is HOW many thigns are in there...
        boolean[] stuff2 = {true,true};
        //  implicitly size 2

        String[] words = new String[15];
//        for(;1==1;) {
//
//        }

        System.out.println("This array is size: " + words.length);

        for (int i = 0; i < words.length; i++) {

        }


        //SITTING AROUND
        // Jamie's chair store
        Scanner keyboard = new Scanner(System.in);
        System.out.println();

        System.out.println("How many chairs are on display at store #1 today?");
        // int numChairsForSale = 99; //keyboard.nextInt();
        int numChairsForSale = keyboard.nextInt();

        // need to be greater than 0
        // also... the storefront is not THAT big
        // 1000
        if (numChairsForSale > 0 && numChairsForSale <= 1000) {
            // you entered a valid # of chairs
        }

        while (numChairsForSale > 0 && numChairsForSale <= 1000) {
            // you entered a valid # of chairs
        }

        do {

        } while (numChairsForSale > 0 && numChairsForSale <= 1000);

        System.out.println("What's the average price of the chairs on display?");
        double avgPrice = 75.99; // keyboard.nextDouble();

        System.out.println("Enter manager password: ");
        String pwEntered = "hello"; //keyboard.next();

        if (pwEntered.equals("secret")) {
        //this doesn't work... can't use == for String type
        // if (pwEntered == "secret") {
            System.exit(67);
        }

        System.out.println("Total price of everything on the floor is " + (numChairsForSale * avgPrice));

        //souf
        // you can use format specifiers...
        // format specifiers start with %
        // % is another escape character
        System.out.printf("I have so many chairs to sell... yay!");

        System.out.printf("\n\nAfter format specifier %s some stuff!!", "Hello World");

        System.out.printf("\n\nI have %d chairs!  On average, each chair costs: $%.2f", numChairsForSale, avgPrice);

        int[] chairs = {99, 9999, 999999, 1, 11};
        double[] prices = {134.134, 134.2343, 14.1243, 1.1, 1.2};
        for (int i = 0; i < chairs.length; i++) {
            System.out.printf("%n# of chairs: %-10d %10.2f", chairs[i], prices[i]);
        }



        // boolean review
        boolean sdf = true;
        sdf = false;
        sdf = (1 == 2);
        sdf = (1 < 5);
        sdf = (1 > 5 && true || false && 'a' == 'b');





        keyboard.close(); // optional

    }
}
