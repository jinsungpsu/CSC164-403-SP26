import java.util.Scanner;

public class OOPWeek6 {
    public static void main(String[] args) {

        String name = null;
        // String is a class
        // name is an identifier/reference variable
        // null is a special literal value
        // that can only be used with ref vars

        Scanner keyboard = new Scanner(System.in);
        if (keyboard != null) {
            System.out.println("Convert this String to an int!");
            int num5 = Integer.parseInt(keyboard.next());
        }


        int num1 = 5;
        int num2;
        int[] numbers = {1,2,3};

        Food someFood; // <-- reference variable
        // short ref var

        Food menuItem1 = new Food(); // <-- explain later
        menuItem1.name = "Burger";
        menuItem1.allergens = "Wheat";
        menuItem1.cost = 5.99;

        Food menuItem2 = new Food();
        // menuItem2.name = "Salad";
        // menuItem2.allergens = "";
        // menuItem2.cost = 12.99;

        menuItem1.upcharge(.50);

        // initialize a 3rd food item
        double tax = 0.06;
        Food menuItem3 = new Food(99.99);

        System.out.println("Menu item 1: ");
        System.out.printf("\n%s %.2f and allergens: %s",
            menuItem1.name, menuItem1.cost, menuItem1.allergens
        );

        System.out.println("\n\nMenu item 2: ");
        System.out.printf("\n%s %.2f and allergens: %s",
                menuItem2.name, menuItem2.cost, menuItem2.allergens
        );

        Phone iphone = new Phone("Apple");

    }

    static void blahblah() {
        /*
        a lot of cool code
         */
    }
}

class Food {
    // instance variables/attributes/fields/properties
    String name;
    double cost;
    String allergens;

    Food() {
        // initialize this object
        // i am going to decide
        // what the default values for
        // the various data fields are...

        allergens = "may contain sesame.";
        cost = 5;
    }

    Food(double initialCost) {
        // overloaded constructor
        // that takes a specific value
        // for the initial cost of
        // this food
        if (initialCost < 0 )
            cost = initialCost;
        else
            cost = 5;
    }

    // not allowed, ambiguous overloaded method
//    Food(String initialName) {
//        name = initialName;
//    }

    Food(String initialAllergens) {
        allergens = initialAllergens;
    }

    Food(String initialName, double initialCost) {
        name = initialName;
        cost = initialCost;
    }

    void changeCost(double newCost) {
        cost = newCost;
    }

    void changeCost(String newCost) {
        cost = Double.parseDouble(newCost);
    }

    void printAllergens() {
        System.out.println(allergens);
    }

    void upcharge(double extra) {
        cost += extra;
    }
}

class Phone {
    String brand;
    int number;
    String carrier;

    /*
    as soon as ANY explicit constructor
    is defined
    there is now NO LONGER A DEFAULT CONSTRUCTOR
     */
    Phone(String phoneBrand) {
        brand = phoneBrand;
    }

    Phone() {

    }
}
