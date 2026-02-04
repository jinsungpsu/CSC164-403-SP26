import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Assignment help!
         */
        String[] foodNames = {"Burger", "Salad", "Pizza", "Soup", "Pasta"};
        double[] foodPrices = {5.99, 4.49, 8.99, 3.99, 7.49};
        String[] foodAllergens = {"Gluten, Dairy", "Nuts", "Gluten, Dairy", "None", "Gluten, Dairy"};

        for (int i = 0; i < foodNames.length; i++) {
            System.out.printf("Item #%d is %s costs $%.2f, which has allergens: %s", (i+1), foodNames[i], foodPrices[i], foodAllergens[i]);
            System.out.println("\nWhich is stored in index " + i + " of all 3 parallel arrays!");
        }

        int[] nums = {1,2,3,4,99,75,69,67,13};
        String[] names = {"Elan", "Ethan", "Armand"};
        String[] group1 = {"Elan", "Ethan", "Armand"};
        String[] group2 = {"David", "Aerionna", "Freweini"};

        String[][] projectTeams = {group1, group2};
        System.out.println(projectTeams[1][1]); // group2, 2nd name

        String[][] anotherProject = {
                {"Carter", "Anthony"},
                {"Josh", "Michael"},
                {"Max", "Kyle"}
        };

        System.out.println(anotherProject[2][0]);

        for (int i = 0; i < anotherProject.length; i++) {
            System.out.println("The group #: " + i);
            for (int j = 0; j < anotherProject[i].length; j++) {
                System.out.println("Team member: " + anotherProject[i][j]);
            }
        }




        for (int i = 0; i < nums.length;i++) {
            System.out.println(nums[i]);
        }

        // inside () for enhanced for loop
        // we define a variable
        // NOT a counter
        for (int each : nums) {
            System.out.println(each); // instead of nums[each]
        }

        for (String name : names) {
            System.out.println("Student's name is : " + name);
        }

        System.out.println(nums[nums.length-1]);

        Scanner keyboard = new Scanner(System.in);

        int choice;
        boolean running = true;
        do {
            System.out.println("1. Dispatch truck");
            System.out.println("2. Dispatch shovelers");
            System.out.println("3. Exit");


            // alt+enter
            // accepts the top suggestion by autocomplete

            while(true) {
                System.out.println("What do you want to do?  (1-3)");
                choice = keyboard.nextInt();
                if (choice > 0 && choice < 4) {
                    // this is a VALID choice
                    /*
                    Test test test!
                    bad values
                    -5 500, result is false

                    good values
                    1,2,3, result is true

                    boundary values
                    0,1,3,4
                     */
                    break;
                }
            }

            switch (choice) {
                case 1:
                    // dispatch
                    System.out.println("Dispatch truck...");
                    break;
                case 2:
                    // dispatch shovelers
                    break;
                case 3:
                    // exit
                    running = false;
                    // System.exit(0);
                    break;
                default:
                    // not required
                    // obviously very useful
            }

            // this is purely for classroom example!!!
            if (!running) {
                break;
            } else {
                continue;
            }

            // this is one option }while(choice != 3);
        } while (running);
        /*

         */

//        if (choice == 1) {
//            // dispatch
//        } else if (choice == 2) {
//            // exit
//        } else {
//            // anything else
//        }
        /*
        select multiple lines of code
        can press ctrl + / (to comment/uncomment)

        can also
        tab or shift+tab for indenting and unindenting
         */
//        char blah = 'a';
//
//        if (blah == 'a' || blah == 'A') {
//
//        }


        System.out.println(true?"yes":"no");

        String player1 = "bob";
        String player2 = "alex";

        int p1score = 10;
        int p2score = 25;

        System.out.println("The winner of this game is!" + (p1score > p2score?player1:player2));
    }
}
