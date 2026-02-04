        /*
        Assignment help!
         */
        String[] foodNames = {"Burger", "Salad", "Pizza", "Soup", "Pasta"};
        double[] foodPrices = {5.99, 4.49, 8.99, 3.99, 7.49};
        String[] foodAllergens = {"Gluten, Dairy", "Nuts", "Gluten, Dairy", "None", "Gluten, Dairy"};

        for (int i = 0; i < foodNames.length; i++) {
            System.out.printf("%nItem #%2d is %-8s costs $%5.2f, which has allergens: %s", (i+1), foodNames[i], foodPrices[i], foodAllergens[i]);
            //System.out.println("\nWhich is stored in index " + i + " of all 3 parallel arrays!");
        }

        String[] orderedNames = new String[2];
        double[] orderedPrices = new double[2];
        String[] orderedAllergens = new String[2];

        // if user entered item # 5 for their first item
        orderedAllergens[0] = foodAllergens[4];
        orderedPrices[0] = foodPrices[4];
        orderedNames[0] = foodNames[4];

        // second item, they chose pizza
        orderedAllergens[1] = foodAllergens[2];
        orderedPrices[1] = foodPrices[2];
        orderedNames[1] = foodNames[2];

        // alternatively
        // store the ordered items in a single array
        int[] orderedItems = new int[2];
        orderedItems[0] = 4; // <-- pasta
        orderedItems[1] = 2; // <-- pizza
