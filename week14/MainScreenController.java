package dtcc.listviewapp;

import javafx.scene.control.CheckBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MainScreenController {

    @FXML
    private CheckBox notCompletedCheckBox;

    private ObservableList<String> observableItems;

    @FXML
    private Button addButton;

    @FXML
    private Button deleteButton;

    @FXML
    private TextField newToDoItemTextArea;

    // this is all the todo list items in the GUI
    @FXML
    private ListView<TodoTask> todoListView;

    @FXML
    void filterCompletedItemsHandler(ActionEvent event) {
        boolean isChecked = notCompletedCheckBox.isSelected();
        todoListView.getItems().clear();
        if (isChecked) {
            // only show active aka completed = false
            for (int i = 0; i < TodoListApp.todoListItems.size(); i++) {
                if (!TodoListApp.todoListItems.get(i).isCompleted()) {
                    todoListView.getItems().add(TodoListApp.todoListItems.get(i));
                }
            }
        } else {
            // show everything
            refreshTodoListView();
        }
    }

    @FXML
    void addButtonHandler(ActionEvent event) {
        String itemToAdd = newToDoItemTextArea.getText();
        if (itemToAdd.isBlank()) {
            // pop up an error of some sort!
            // new item can't be blank!
            return;
        }
        // changed this from the old app
        // we want to add it to the "back end"
        TodoListApp.todoListItems.add(new TodoTask(itemToAdd, 0, false));

        newToDoItemTextArea.setText("");
        newToDoItemTextArea.setPromptText("Enter new to do item here.");

        refreshTodoListView();

        writeTodoListToFile(TodoListApp.todoListItems, TodoListApp.getFilepath());

        // we can reuse the same code from deletion
        // which re-writes the whole file
        // but if we just want to append when adding
        // which is technically better...
        // we could maybe write a new method

        /*
        File file = new File("data.txt");

        try {
            if (file.createNewFile()) {
                // this part is unnecessary because we don't create a new file
                // we should be using the existing file we imported from!!!
                FileWriter fw = new FileWriter(file);
                fw.write(itemToAdd);
                fw.close();
            } else {
                // the file I should be writing to
                // is the same file I read the original CSV data from
                // which is stored in the TodoListApp class
                String filepath = TodoListApp.getFilepath();
                System.out.println("Cannot create new file!");
                System.out.println("So let's append to an existing file");
                FileWriter fw = new FileWriter(filepath, true);
                fw.write("\n" + itemToAdd + ", 0, true");
                fw.close();
                // so let's do better... write back to the CSV in the correct format
            }
        } catch (IOException error) {

        }

         */
    }

    private void refreshTodoListView() {
        // it's going to reload all items from the arraylist into the listview
        todoListView.getItems().clear();
        for (int i = 0; i < TodoListApp.todoListItems.size(); i++) {
            todoListView.getItems().add(TodoListApp.todoListItems.get(i));
        }
    }

    @FXML
    void deleteButtonHandler(ActionEvent event) {
        TodoTask selectedItem = todoListView.getSelectionModel().getSelectedItem();
        if (selectedItem != null) {
            todoListView.getItems().remove(selectedItem);   // delete from "frontend"
            TodoListApp.todoListItems.remove(selectedItem); // delete from "backend"
        }
        /*
        how do we write the updated data into a file?
        ... we can't easily delete... so it's more "typical"
        to just re-write the entire file from scratch
        leaving out what you want to delete
         */

        /*
        loop through all items in your arraylist
         (not the listview)
         and write everything to a file...
         CSV format.
         */

        // typically
        // you do not want to automatically make all changes
        // to file
        // because this is SLOW
        // in general, in computing,
        // you do not want to go to the hard drive
        // for read/write unless absolutely necessary
        writeTodoListToFile(TodoListApp.todoListItems, TodoListApp.getFilepath());
    }

    @FXML
    void newToDoItemTextAreaOnActionHandler(ActionEvent event) {

    }

    private void writeTodoListToFile(ArrayList<TodoTask> data, String filepath) {
        try {
            FileWriter fw = new FileWriter(filepath);

            fw.write("description, priority, completed");
            for (int i = 0; i < data.size(); i++) {
                fw.write(data.get(i).getDescription() + "," + data.get(i).getPriority() +  "," + data.get(i).isCompleted() + "\n");
            }

            fw.close();

        } catch (IOException e) {
            // problem
        }
    }

    @FXML
    public void initialize() {

        /*
        // we're going to initialize our "database"
        todoListItems.add("sleep");
        todoListItems.add("study");
        todoListItems.add("eat");
        todoListItems.add("work out");
        */



        // any code that you want to run when the FXML file finishes loading
        // AKA - initializing the GUI


        // manually load the data
        refreshTodoListView();

    }
}

class ListView2 {
    private ArrayList<String> items;
    public ArrayList<String> getItems() {
        return items;
    }
    public void add(String item) {
        items.add(item);
    }
}
