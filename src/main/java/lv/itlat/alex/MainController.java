package lv.itlat.alex;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    public void AddRecord() throws IOException {

        var stage = new Stage();


        Parent root = FXMLLoader.load(getClass().getResource("data-entry.fxml"));

        stage.initOwner(Main.primaryStage);
        stage.initModality(Modality.APPLICATION_MODAL);

        stage.setTitle("Add record");
        var scene= new Scene(root);
        stage.setScene(scene);
        stage.showAndWait();
    }
}
