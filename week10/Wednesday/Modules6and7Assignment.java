import java.util.ArrayList;

public class Modules6and7Assignment {
    public static void main(String[] args) {
        Menu restaurant1Menu = new Menu();
        // anonymous object
        restaurant1Menu.addMenuItem(new Food("Hot Dog", 1.5D, "sesame, gluten"));
        restaurant1Menu.addMenuItem(new Food("Burger", 5.5D, "sesame, gluten"));
        restaurant1Menu.addMenuItem(new Food("Fries", 2.5D, ""));


        Menu dinner = new Menu();

        Menu restaurant2menu = new Menu();
        System.out.println(restaurant1Menu);

    }
}

class RestaurantItem {
    private String name;
    private double price;

    public RestaurantItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "RestaurantItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

class Food extends RestaurantItem {
    private String allergens;

    public Food(String name, double price, String allergens) {
        super(name, price);
        this.allergens = allergens;
    }

    @Override
    public String toString() {
        return "Food{" +
                "allergens='" + allergens + '\'' +
                "} " + super.toString();
    }
}



class Menu {
    private ArrayList<RestaurantItem> menuItems = new ArrayList<>();

    public void addMenuItem(RestaurantItem item) {
        menuItems.add(item);
    }

    public RestaurantItem getItem(int index) {
        return menuItems.get(index);
    }

    @Override
    public String toString() {
        if (menuItems.isEmpty()) {
            return "Menu is empty.";
        }

        StringBuilder output = new StringBuilder("Menu:\n");
        for (int i = 0; i < menuItems.size(); i++) {
            output.append(String.format("%d: %s%n", (i + 1), menuItems.get(i).toString()));
        }

        return output.toString();
    }
}
