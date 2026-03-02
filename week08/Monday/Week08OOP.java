import java.util.Scanner;

public class Week08OOP {
    static Scanner keyboard = new Scanner(System.in);
    static int blah = 5;

    void hello() {
        System.out.println(blah);
        int num = keyboard.nextInt();
    }

    public static void main(String[] args) {
        System.out.println("Hello! " + args[0]);

        System.out.println(blah);
        // local var
        double costOfBurger;
        // System.out.println(costOfBurger); <-- local vars do not get a default value
        // so this is a syntax error

        /*
        function chaining
        Cat fifi = new Cat();
        fifi.setName(“Fifi”);

        fifi.getFavoriteFood().setBrand(“Awesome Cat Food”);
        this can be broken up into two steps
        Food fifiFaveFood = fifi.getFavoriteFood();
        fifiFaveFood.setBrand("Farmer's Dog");

        fifi.getFavoriteFood().setCost(“19.99”);
         */
        int[] grades = {90,80,70};
        Chair c1 = new Chair();
        System.out.println("How many people can sit in c1? " + c1.getNumSeats());

        Chair[] chairsForSale = new Chair[3];
        // chairsForSale[0].setPrice(50); // <- this is an error, because no object exists yet

//        chairsForSale[0] = new Chair();
//        chairsForSale[1] = new Chair();
//        chairsForSale[2] = new Chair();
        for (int i = 0; i < chairsForSale.length; i++) {
            chairsForSale[i] = new Chair();
        }

        // 2 ways of doing the same thing
        // option 1
        clearanceChair(chairsForSale[2]);
        System.out.println(chairsForSale[2].getPrice());

        // option 2
        Chair chair = chairsForSale[2];
        clearanceChair(chair);

        Chair[] warehouseInventory = {new Chair(), new Chair(), new Chair()};
        warehouseInventory[1].setPrice(75);
    }

    static void clearanceChair(Chair chair) {
        chair.setPrice(1);
    }
}

class Chair {
    private double price;
    private int numSeats;
    private String serialNumber;

    static int totalChairs;

    public Chair() {
        totalChairs++;
        serialNumber = "JaimesFurniture" + totalChairs + "2026";
    }

    // setters
    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumSeats(int seats) {
        numSeats = seats;
    }

    // getters
    public double getPrice() {
        return price;
    }

    public int getNumSeats() {
        return numSeats;
    }

}
