import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char[] grades = {'a', 'b', 'c', 'f'};

        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }

        ArrayList<String> graduatingClassOf2030 = new ArrayList<>();
        graduatingClassOf2030.add("Bob1"); // append
        graduatingClassOf2030.add("Bob2"); // append
        graduatingClassOf2030.add("Bob3"); // append
        graduatingClassOf2030.add("Bob4"); // append
        graduatingClassOf2030.add("Bob5"); // append
        graduatingClassOf2030.add("Bob6"); // append
        graduatingClassOf2030.add("Bob7"); // append

        graduatingClassOf2030.set(4, "Mike"); // replace or "set" value in 5th item (or index 4)

        if (graduatingClassOf2030.contains("Mary")) {
            System.out.println("Mary's graduating!");
        }

        System.out.println(graduatingClassOf2030.indexOf("Bob2"));

        ArrayList<Integer> numbers3 = new ArrayList<>();

        // print the 3rd item
        System.out.println(graduatingClassOf2030.get(2));





        Object[] stuff = {1, "hi", new Scanner(System.in)};

        ArrayList grades2 = new ArrayList();
        grades2.add('a');
        grades2.add('b');
        grades2.add('c');
        grades2.add('f');
        grades2.add(5);
        grades2.add(new Scanner(System.in));

        System.out.println(grades2);

        for (int i = 0; i < grades2.size(); i++) {
            System.out.println(grades2.get(i));
        }


    }
}
