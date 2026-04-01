package dtcc.csc164_javafx_blank;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class HelloController {

    @FXML
    private Text receiptText;

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField phoneTextField;

    @FXML
    void printReceiptButtonOnActionHandler(ActionEvent event) {
        System.out.println(event);

        String customerName = nameTextField.getText();
        String customerPhone = phoneTextField.getText();

        Receipt receipt = new Receipt(customerName, customerPhone);

        receiptText.setText(receipt.toString());


    }

}

class Receipt {
    private String name;
    private String phone;
    private double total;
    private ArrayList<String> thingsOrdered = new ArrayList<>();

    public Receipt(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public void addToOrder(String it) {
        thingsOrdered.add(it);
    }

    @Override
    public String toString() {
        String o = "";
        o += this.name + "\n";
        o += this.phone + "\n";

        if (thingsOrdered.isEmpty()) {
            o += "[ nothing ordered ] \n";
        }

        o += "Total is $ " + total;

        return o;
    }
}
