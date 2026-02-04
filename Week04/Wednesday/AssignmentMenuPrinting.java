        String[] foodNames = {"Burger", "Salad", "Pizza", "Soup", "Pasta"};
        double[] foodPrices = {5.99, 4.49, 8.99, 3.99, 7.49};
        String[] foodAllergens = {"Gluten, Dairy", "Nuts", "Gluten, Dairy", "None", "Gluten, Dairy"};

        for (int i = 0; i < foodNames.length; i++) {
            System.out.printf("%nItem #%2d is %-8s costs $%5.2f, which has allergens: %s", (i+1), foodNames[i], foodPrices[i], foodAllergens[i]);
            //System.out.println("\nWhich is stored in index " + i + " of all 3 parallel arrays!");
        }
