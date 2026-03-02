import java.util.Scanner;

public class ChairStoreApp {
    // driver class
    // it's sometimes to use the word App or Program or Driver
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // App app = new App();
        // app.run();
        // App.run(); (if it's static)

        // ask customer for name
        String name = keyboard.next();
        Order order = new Order();
        order.setCustomerName(name);
        // ask if they want to order 1 or 2 sofas
        // which sofas do you want to buy

        Sofa[] sofasForSale = {new Sofa(), new Sofa(), new Sofa()};

        // this works but it's very confusing looking
        Sofa[] sofasIWantToOrder = {sofasForSale[1], sofasForSale[2]};
        order.setSofas(sofasIWantToOrder);

        // this works, and it's a lot less confusing
        order.buySofa(sofasForSale[0]);

        order.buySofa(sofasForSale[2]);

        // add up the cost of the sofas
        // print a receipt
        order.printReceipt();

    }
}

class Order {
    private String name;
    private double total;

    private Sofa[] sofas = new Sofa[2];

    public void setCustomerName(String name) {
        this.name = name;
    }

    // "normal" setter
    public void setSofas(Sofa[] sofas) {
        this.sofas = sofas;
    }

    // this is kind of like a setter
    // but customized

    public void buySofa(Sofa sofa) {
        if (sofas[0] == null) {
            // I don't have any sofas in my order yet
            sofas[0] = sofa;
        } else if (sofas[1] == null) {
            // I have 1 sofa, so I can buy a second
            sofas[1] = sofa;
        } else {
            // I already have my two sofa slots taken can't order anymore
            System.out.println("You can't carry that many sofas fool!");
        }
    }

    public void printReceipt() {
        double totalCost = 0;
        for (int i = 0; i < sofas.length; i++) {
            if (sofas[i] != null)
                totalCost += sofas[i].getPrice();
        }
        System.out.println("Your name is: ");
        System.out.println("You ordered this stuff!");
        System.out.println("Your total is: " + total);
    }
}

class Sofa {
    private double price;
    private int numSeats;
    private String serialNumber;

    static int totalChairs;

    public Sofa() {
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

class App {
    public static void run() {
        // all the code to run
        //
    }
}
