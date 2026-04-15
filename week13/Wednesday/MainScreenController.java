package dtcc.listviewapp;

import javafx.scene.control.CheckBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

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
