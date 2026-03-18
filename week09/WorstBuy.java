import java.util.Scanner;

public class WorstBuy {
    public static void main(String[] args) {
        SalesPerson bob = new SalesPerson();
        bob.setName("Bob");
        ElectronicDevice[] listOfStuff = {
                // TVs (10 items)
                new TV("Samsung", 499.99, 699.99, 365, 43),
                new TV("Samsung", 699.99, 899.99, 365, 50),
                new TV("Samsung", 1299.99, 1599.99, 365, 65),
                new TV("Samsung", 2499.99, 2999.99, 365, 85),
                new TV("LG", 449.99, 599.99, 365, 43),
                new TV("LG", 849.99, 1099.99, 365, 55),
                new TV("LG", 1799.99, 2199.99, 365, 70),
                new TV("Sony", 899.99, 1199.99, 365, 55),
                new TV("Sony", 1499.99, 1899.99, 365, 65),
                new TV("TCL", 299.99, 399.99, 365, 50),

                // Phones (12 items)
                new Phone("Apple", 999.99, 1099.99, 365, "Verizon"),
                new Phone("Apple", 1099.99, 1199.99, 365, "AT&T"),
                new Phone("Apple", 1199.99, 1299.99, 365, "T-Mobile"),
                new Phone("Apple", 899.99, 999.99, 365, "Unlocked"),
                new Phone("Samsung", 899.99, 999.99, 365, "Verizon"),
                new Phone("Samsung", 999.99, 1099.99, 365, "AT&T"),
                new Phone("Samsung", 799.99, 899.99, 365, "T-Mobile"),
                new Phone("Google", 699.99, 799.99, 365, "Unlocked"),
                new Phone("Google", 799.99, 899.99, 365, "Verizon"),
                new Phone("OnePlus", 599.99, 699.99, 365, "Unlocked"),
                new Phone("Motorola", 399.99, 499.99, 365, "AT&T"),
                new Phone("Nokia", 249.99, 299.99, 365, "T-Mobile"),

                // Computers & Laptops (18 items)
                new Laptop("Apple", 1299.99, 1499.99, 365, "M2", 18.0, 3.0),
                new Laptop("Apple", 1499.99, 1699.99, 365, "M2 Pro", 20.0, 3.5),
                new Laptop("Apple", 1999.99, 2299.99, 365, "M3 Max", 22.0, 4.7),
                new Laptop("Dell", 899.99, 1099.99, 365, "Intel i7", 8.0, 4.5),
                new Laptop("Dell", 1199.99, 1399.99, 365, "Intel i9", 10.0, 5.0),
                new Laptop("Dell", 699.99, 899.99, 365, "Intel i5", 7.0, 4.0),
                new Laptop("HP", 649.99, 799.99, 365, "AMD Ryzen 5", 8.0, 4.2),
                new Laptop("HP", 849.99, 999.99, 365, "AMD Ryzen 7", 9.0, 4.5),
                new Laptop("HP", 1099.99, 1299.99, 365, "Intel i7", 10.0, 4.8),
                new Laptop("Lenovo", 749.99, 899.99, 365, "Intel i5", 7.5, 3.8),
                new Laptop("Lenovo", 999.99, 1199.99, 365, "Intel i7", 9.0, 4.2),
                new Laptop("Lenovo", 599.99, 699.99, 365, "AMD Ryzen 3", 6.0, 3.5),
                new Laptop("ASUS", 1299.99, 1499.99, 365, "Intel i9", 6.0, 5.5),
                new Laptop("ASUS", 899.99, 1099.99, 365, "AMD Ryzen 9", 7.0, 5.0),
                new Computer("Microsoft", 499.99, 599.99, 365, "Intel i5"),
                new Computer("Microsoft", 699.99, 799.99, 365, "Intel i7"),
                new Computer("Apple", 599.99, 699.99, 365, "M1"),
                new Computer("Apple", 799.99, 899.99, 365, "M2"),

                // Gaming PCs (10 items)
                new GamingPC("Alienware", 1999.99, 2299.99, 365, "Intel i9", true),
                new GamingPC("Alienware", 2499.99, 2799.99, 365, "Intel i9", true),
                new GamingPC("Alienware", 1699.99, 1899.99, 365, "Intel i7", true),
                new GamingPC("MSI", 1499.99, 1699.99, 365, "AMD Ryzen 9", true),
                new GamingPC("MSI", 1799.99, 1999.99, 365, "AMD Ryzen 9", true),
                new GamingPC("ASUS ROG", 1899.99, 2199.99, 365, "Intel i9", true),
                new GamingPC("ASUS ROG", 2199.99, 2499.99, 365, "Intel i9", true),
                new GamingPC("Corsair", 1599.99, 1799.99, 365, "AMD Ryzen 7", true),
                new GamingPC("Corsair", 1899.99, 2099.99, 365, "AMD Ryzen 9", true),
                new GamingPC("Razer", 2299.99, 2599.99, 365, "Intel i9", true)
        };

        Inventory worstBuyStore001inventory = new Inventory(listOfStuff);

        Scanner keyboard = new Scanner(System.in);
        while(true) {
            System.out.println("Log in!");
            System.out.println("User name: ");
            //String name = keyboard.next();
            String name = "bob";
            System.out.println("Password: ");
            // String pw = keyboard.next();
            // for testing purposes:
            String pw = "password";
            if (pw.equals("password")) {
                // success!
                Order order = new Order();
                System.out.println(worstBuyStore001inventory);

                System.out.println("Should we order something? Which item?");
                int orderItemNum = keyboard.nextInt();

                ElectronicDevice device = worstBuyStore001inventory.getItemFromInventory(orderItemNum);
                order.buyDevice(device);

                order.setSalesPerson(bob);

                order.checkOut();

            } else {
                // wrong password
            }
        }
    }
}

class SalesPerson {
    private String name;
    private double commission;

    public void setName(String name) {
        this.name = name;
    }

    public void payCommission(double commission) {
        this.commission += commission;
    }
}

class Inventory {
    private ElectronicDevice[] inventory;

    public Inventory(ElectronicDevice[] inventory) {
        this.inventory = inventory;
    }

    public ElectronicDevice getItemFromInventory(int itemIndex) {
        return inventory[itemIndex-1];
    }

    @Override
    public String toString() {
        String o = "";
        o += "\n=================== INVENTORY ================== ";
        for (int i = 0; i < inventory.length; i++) {
            o += "\n" + (i+1) + ": " + inventory[i];
        }
        o += "\n=========== end     INVENTORY ================== ";
        return o;
    }
}

class Order {
    private String customerName;
    private SalesPerson salesPerson;
    private double totalPrice;
    private double commission;

    private ElectronicDevice[] orderedItems = new ElectronicDevice[2];

    public void setSalesPerson(SalesPerson salesPerson) {
        this.salesPerson = salesPerson;
    }

    public void buyDevice(ElectronicDevice deviceOrdered) {
        if (deviceOrdered instanceof Phone) {
            System.out.println("Will you sign your life away?");
        }
        orderedItems[0] = deviceOrdered;
    }

    private void paySalesPerson() {
        salesPerson.payCommission(commission);
    }

    public void checkOut() {
        commission = orderedItems[0].getRetailPrice() * .1;
        paySalesPerson();
        printReceipt();
    }

    private void printReceipt() {
        System.out.println("You ordered: ");
        System.out.println(orderedItems[0]);
        System.out.println("that cost: $" + orderedItems[0].getRetailPrice());
        System.out.println("Your total is: $....");
    }
}

class ElectronicDevice {
    private String brand;
    private double price;
    private double retailPrice;
    private int daysLeftInWarranty;

    public ElectronicDevice(String brand, double price, double retailPrice, int daysLeftInWarranty) {
        this.brand = brand;
        this.price = price;
        this.retailPrice = retailPrice;
        this.daysLeftInWarranty = daysLeftInWarranty;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    @Override
    public String toString() {
        return  brand +
                ", $" + retailPrice;
    }
}

class Phone extends ElectronicDevice {
    private String carrier;

    public Phone(String brand, double price, double retailPrice, int daysLeftInWarranty, String carrier) {
        super(brand, price, retailPrice, daysLeftInWarranty);
        this.carrier = carrier;
    }

    @Override
    public String toString() {
        return "Phone: " + carrier + '\'' +
                super.toString();
    }
}

class TV  extends ElectronicDevice{
    private int screenSize;

    public TV(String brand, double price, double retailPrice, int daysLeftInWarranty, int screenSize) {
        super(brand, price, retailPrice, daysLeftInWarranty);
        this.screenSize = screenSize;
    }
}

class Computer extends ElectronicDevice {
    private String cpu;

    public Computer(String brand, double price, double retailPrice, int daysLeftInWarranty, String cpu) {
        super(brand, price, retailPrice, daysLeftInWarranty);
        this.cpu = cpu;
    }
}

class Laptop  extends Computer{
    private double batteryLife;
    private double weight;

    public Laptop(String brand, double price, double retailPrice, int daysLeftInWarranty, String cpu, double batteryLife, double weight) {
        super(brand, price, retailPrice, daysLeftInWarranty, cpu);
        this.batteryLife = batteryLife;
        this.weight = weight;
    }

    /*
    when generating a constructor (or setters/getters)
    when the generate pop up comes up
    you can select multiple instance variables by:
    using ctrl + click to add more variables
    ctrl+a to select all
    or pick one... then pick another while pressing shift... to select everything in between
     */
}

class GamingPC extends Computer{
    private boolean discreteGPU;

    public GamingPC(String brand, double price, double retailPrice, int daysLeftInWarranty, String cpu, boolean discreteGPU) {
        super(brand, price, retailPrice, daysLeftInWarranty, cpu);
        this.discreteGPU = discreteGPU;
    }
}
