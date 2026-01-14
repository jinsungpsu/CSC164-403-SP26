public class Program {
    public static void main(String[] args) {
        // System.out.println("something");
        // is exactly the same as
        // System.out.print("something\n");
        // cout << "something" << endl;
        // cout << "something\n";


        System.out.println("Hello, I am " +
                "writing this dumb program, " +
                "because my instructor told me " +
                "to do it.  And that's what school " +
                "is all about.  Doing whatever it " +
                "takes to get a great grade.");

        System.out.print("blah blah blah");

        System.out.print("this is gonna print in the same line as the blah blah blah");

        // formatted printing
        System.out.printf("this works too");

        int num = 5;
        // augmented operator
        num += 3;

        // same as
        num = num + 3;

        num /= 5;


        num = (num + 3*7) + 5;

        String name = "joe";
    }
}
