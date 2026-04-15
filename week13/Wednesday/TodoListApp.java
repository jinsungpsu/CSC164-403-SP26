package dtcc.listviewapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TodoListApp extends Application {
    // this is all the to do list items
    // a fake way of implementing MVC
    // separating model/data and view

    static final String DEFAULT_FILE = "data/todo.csv";
    static public ArrayList<TodoTask> todoListItems = new ArrayList<>();

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TodoListApp.class.getResource("main-screen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("To Do List");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {

        File myfile = new File(DEFAULT_FILE);
        Scanner keyboard = new Scanner(System.in);
        Scanner myfileScanner;

        while(true) { // try to open a file
            try {
                myfileScanner = new Scanner(myfile);
                break; // break out of the loop, because we have a valid filepath!
            } catch (FileNotFoundException error) {
                System.out.println("Default file is not found! Enter new filepath!");
                String newfilepath = keyboard.nextLine();
                myfile = new File(newfilepath);
                continue;
            }
        }

        // let's deal with this file
        // parse the csv correctly

        // throw away header row, because it's not actual data
        String headerDescriptions = myfileScanner.nextLine();

        while(myfileScanner.hasNextLine()) {
            /*
            String lineOfData = myfileScanner.nextLine();
            String[] data = lineOfData.split(",");
             */
            String[] data = myfileScanner.nextLine().split(",");
            String todoDescription = data[0].trim();  // get rid of any whitespaces before or after
                                                        // which may cause parsing errors
            String priority = data[1].trim();
            int priorityNumber = Integer.parseInt(priority);
            String completed = data[2].trim();
            boolean completedBoolean = Boolean.parseBoolean(completed);
            TodoTask todo = new TodoTask(todoDescription, priorityNumber, completedBoolean);

            // for your assignment
            // what is the first column value??? is it Food?  then you can expect a pattern
            // is it a drink, then you can expect a pattern

            todoListItems.add(todo);
        }



        launch();
    }

    static void oldCode() {
        // weird things that exist in programming (including java)
        int num1;
        int num2 = (num1 = 5);

        Cat cat1;
        Cat cat2;

        cat1 = (cat2 = null);



        // finally can fix the last problem in our Cat lab
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What's the cat's age?");
        try {
            //int age = keyboard.nextInt(); // <<--- this can result
            // in a inputmismatchexception
        } catch (InputMismatchException error) {
            System.out.println("You didn't enter a number...");
            System.out.println("Try again");
            try {
                //int age = keyboard.nextInt();
            } catch (InputMismatchException error2) {

            }
        }

        // thanks chat gpt!

        while (true) {
            try {
                System.out.print("Enter age: ");
                //int age = keyboard.nextInt();
                break; // success
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                //keyboard.next(); // consume invalid input
            }
        }


        //    you're allowed to do this
        // just tell whoever is using this program
        // it might blow up
        //    public static void main(String[] args) throws FileNotFoundException {

        // Exceptions example
        int[] numbers = {1,2,3};

        try {
            System.out.println(numbers[2]);
        } catch (IndexOutOfBoundsException error) {
            System.out.println("The problem was: " + error.toString());
            System.out.println("Whatever... this program is not gonna crash this time");
        }

        // you would put this wherever it makes sense for your application
        // you can read it from a file
        // ANYWHERE, just like you can get keyboard input
        // from anywhere in your program

        // the File constructor needs a file path and file name
        // file path = where
        // a couple of different ways of saying where
        // absolute vs relative path
        // generally working with relative paths
        // relative path means... from "here" which is the
        // project folder
        // file name = what
        File todolistFile = new File("data/todolistsaved.txt");
        Scanner fileInput = null;
        try {
            fileInput = new Scanner(todolistFile);
            // int x = 5/0;
        } catch (FileNotFoundException e) {
            //System.out.println("File not found!  Exiting program!");
            System.out.println(e.toString());
            // this is the code that should deal with our problem

        } catch (Exception e) {
            System.out.println("During trying to open a file for the to do list app, some unknown, unexpected error occurred.");
            System.exit(452);
        }


        // if my data is coming from a file now
        // NON volatile - meaning it'll come back next time i
        // use this app

        // i am no longer going to "hard code"
        // we want to read these items from a file
//        todoListItems.add("sleep");
//        todoListItems.add("study");
//        todoListItems.add("eat");
//        todoListItems.add("work out");

        while (fileInput.hasNextLine()) {
            //todoListItems.add(fileInput.nextLine());
        }
        // let's loop this and make this WAY more flexible
//        todoListItems.add(fileInput.nextLine());
//        todoListItems.add(fileInput.nextLine());
//        todoListItems.add(fileInput.nextLine());
//        todoListItems.add(fileInput.nextLine());

        try {
            function1();
        } catch (FileNotFoundException e) {

        }
    }

    static void function1() throws FileNotFoundException {

    }
}

class Cat {

}

class TodoTask {
    private String description;
    private int priority;
    private boolean completed;

    public TodoTask(String description, int priority, boolean completed) {
        this.description = description;
        this.priority = priority;
        this.completed = completed;
    }

    public boolean isCompleted() {
        return completed;
    }

    @Override
    public String toString() {
        return "TodoTask{" +
                "description='" + description + '\'' +
                ", priority=" + priority +
                ", completed=" + completed +
                '}';
    }
}
