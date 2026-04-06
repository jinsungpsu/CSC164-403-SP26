package dtcc.listviewapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class MainScreenController {

    @FXML
    private Button addButton;

    @FXML
    private Button deleteButton;

    @FXML
    private TextField newToDoItemTextArea;

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
        todoListView.getItems().add(itemToAdd);
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
        // any code that you want to run when the FXML file finishes loading
        // AKA - initializing the GUI

        // not EVENT DRIVEN
        todoListView.getItems().add("Sleep");
        todoListView.getItems().add("Eat");
        todoListView.getItems().add("Study");
        todoListView.getItems().add("Come to exam on time.");
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
