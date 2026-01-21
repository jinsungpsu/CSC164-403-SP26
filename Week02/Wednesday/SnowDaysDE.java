/*
We generated this using AI just to mess around and use the debugger
*/
public class SnowDaysDE {
    public static void main(String[] args) {
        String[] counties = {"New Castle","Kent","Sussex"};
        int days = 31;
        double[][] snow = new double[counties.length][days];
        int[] closures = new int[counties.length];
        int statewide = 0;
        double[] bias = {1.2, 0.9, 0.6}; // north to south bias
        for (int c = 0; c < counties.length; c++) {
            for (int d = 0; d < days; d++) {
                double base = Math.random() * 6.0;      // base snowfall 0–6 in
                double gust = Math.random() < 0.15 ? Math.random() * 4.0 : 0.0; // occasional burst
                double val = base * bias[c] + gust;
                // don't forget to delete this later
                // testing purposes
                // ##########################################
                // ##########################################
                System.out.println("Value of variable val is: " + val);
                snow[c][d] = Math.round(val * 10.0) / 10.0; // 0.1 precision
            }
        }
        for (int d = 0; d < days; d++) {
            int closedToday = 0;
            for (int c = 0; c < counties.length; c++) {
                if (snow[c][d] >= 2.0) { closures[c]++; closedToday++; }
            }
            if (closedToday == counties.length) { statewide++; }
        }
        System.out.println("Delaware Snow Days Simulator (January) ❄");
        System.out.println("----------------------------------------");
        for (int c = 0; c < counties.length; c++) {
            System.out.println(counties[c] + " closures: " + closures[c]);
        }
        System.out.println("Statewide closures: " + statewide);
        System.out.println("\nASCII snowfall heatmap ('.' <2 in, '*' ≥2 in)");
        for (int c = 0; c < counties.length; c++) {
            System.out.println("\n" + counties[c]);
            System.out.print(" ");
            for (int d = 0; d < days; d++) {
                char ch = snow[c][d] >= 2.0 ? '*' : '.';
                System.out.print(ch);
            }
        }
        double max = 0, min = 10, sum = 0; int n = counties.length * days;
        for (int c = 0; c < counties.length; c++) {
            for (int d = 0; d < days; d++) {
                double v = snow[c][d];
                if (v > max) max = v;
                if (v < min) min = v;
                sum += v;
            }
        }
        System.out.println("\n\nAvg snowfall: " + Math.round((sum / n) * 10.0) / 10.0 + " in");
        System.out.println("Max day anywhere: " + max + " in; Min: " + min + " in");
        System.out.println("Rule: closure if county ≥ 2.0 in on a day.");
        System.out.println("Note: North tends to get more than South (simple bias).");
    }
}
