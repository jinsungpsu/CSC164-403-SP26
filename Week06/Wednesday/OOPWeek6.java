import java.util.Scanner;

public class OOPWeek6 {

    static void printFoodData(Dog food) {
        System.out.printf("\n%s %.2f and allergens: %s",
                food.name, food.cost, food.allergens
        );
    }

    public static void main(String[] args) {
        Dog food1 = new Dog("Fruity Pebbles", 5.49);
        Dog food2 = new Dog("Special K", 7.50);

        food1 = food2; // shallow copy

        // make a deep copy of food2 into food3
        Dog food3 = new Dog();
        food3.name = food2.name;
        food3.allergens = food2.allergens;
        food3.cost = food2.cost;

        food2.name = "Lucky Charms";
        System.out.printf("\n\nFood1: %s, Food2: %s\n\n", food1.name, food2.name);

        food1.name = "Coco Pebbles";
        System.out.printf("\n\nFood1: %s, Food2: %s\n\n", food1.name, food2.name);


        int num1 = 10;
        int num2 = 20;
        num1 = num2;

        num2 = 30;

        System.out.printf("\n\nNum1: %d, Num2: %d\n\n", num1, num2);

        // implicit things in java
        String myname = "adf";

        int[] array = new int[2];

        Dog food;

        Dog nofood;
        // nofood.name = "salad";
        // previous line wouldn't work
        // because the nofood reference variable
        // is not pointing to an object
        // therefore, no object ... no name


        Scanner keyboard = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        String name = null;
        // String is a class
        // name is an identifier/reference variable
        // null is a special literal value
        // that can only be used with ref vars

        //Scanner keyboard = new Scanner(System.in);
        if (keyboard != null) {
            System.out.println("Convert this String to an int!");
            int num5 = Integer.parseInt(keyboard.next());
        }


        int num10 = 5;
        int num20;
        int[] numbers = {1,2,3};

        Dog someFood; // <-- reference variable
        // short ref var

        Dog menuItem1 = new Dog(); // <-- explain later
        menuItem1.name = "Burger";
        menuItem1.allergens = "Wheat";
        menuItem1.cost = 5.99;

        Dog menuItem2 = new Dog();
        // menuItem2.name = "Salad";
        // menuItem2.allergens = "";
        // menuItem2.cost = 12.99;

        menuItem1.upcharge(.50);
        menuItem2.upcharge(.75);

        // initialize a 3rd food item
        double tax = 0.06;
        Dog menuItem3 = new Dog(99.99);

        System.out.println("Menu item 1: ");
        printFoodData(menuItem1);

        System.out.println("\n\nMenu item 2: ");
        System.out.printf("\n%s %.2f and allergens: %s",
                menuItem2.name, menuItem2.cost, menuItem2.allergens
        );

        Phone iphone = new Phone("Apple");

        String response = "yes";
        do {

        } while (response.equals("yes"));

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

    private void changeCost(String newCost) {
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

class Human {
    String name;
    int age;
    double height;

    Human bioMom, bioDad;
}
