package dtcc.listviewapp;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class MainScreenController {

    private ObservableList<String> observableItems;

    @FXML
    private Button addButton;

    @FXML
    private Button deleteButton;

    @FXML
    private TextField newToDoItemTextArea;

    // this is all the todo list items in the GUI
    @FXML
    private ListView<String> todoListView;

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
        TodoListApp.todoListItems.add(itemToAdd);

        // you MIGHT have to refresh the front end
        todoListView.refresh();

        newToDoItemTextArea.setText("");
        newToDoItemTextArea.setPromptText("Enter new to do item here.");
    }

    @FXML
    void deleteButtonHandler(ActionEvent event) {
        String selectedItem = todoListView.getSelectionModel().getSelectedItem();
        if (selectedItem != null)
            todoListView.getItems().remove(selectedItem);
    }

    @FXML
    void newToDoItemTextAreaOnActionHandler(ActionEvent event) {

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
        /*
        for (int i = 0; i < TodoListApp.todoListItems.size(); i++) {
            todoListView.getItems().add(TodoListApp.todoListItems.get(i));
            String currentTodoItemFromData = todoListItems.get(i);

        }
        */
        // instead of manually loading
        // we can use the "middle man" ObservableList
        // in order for the UI to be "alerted" whenever
        // changes are made to the data
        observableItems = FXCollections.observableArrayList(TodoListApp.todoListItems);
        todoListView.setItems(observableItems);

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
