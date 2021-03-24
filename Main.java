import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main(String[] args){
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{

        ObservableList<String> langs = FXCollections.observableArrayList("Java","JavaScript", "C#","Python");
        ComboBox<String> langsComboBox = new ComboBox<String>(langs);
        langsComboBox.setValue("Java"); // määrame vaikimisi valitud element
        Label lbl = new Label();
        // saame valitud element
        langsComboBox.setOnAction(event -> lbl.setText(langsComboBox.getValue()));

        FlowPane root = new FlowPane(10,10, langsComboBox, lbl);
        Scene scene = new Scene(root,300,250);

        stage.setScene(scene);
        stage.setTitle("ComboBox in JavaFX");
        stage.show();
    }
}