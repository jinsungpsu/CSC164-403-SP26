package dtcc.csc164_javafx_blank;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello!");

        /* ArrayList Review */
        ArrayList<String> stuff = new ArrayList<>();
        stuff.add("apple");
        stuff.add("orange");
        stuff.add("pineapple");

        System.out.println(stuff);

        // how would I remove orange?
        //stuff.remove(1);
        stuff.remove("orange");

        System.out.println(stuff);

        // change orange to coke
        stuff.set(1, "coke");

        System.out.println(stuff);

        // you need to know this!
        for (int i = 0; i < stuff.size(); i++){
            System.out.println(stuff.get(i));
        }

        launch();
    }
}
