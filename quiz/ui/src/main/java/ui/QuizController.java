package ui;

import java.io.IOException;

import core.Quiz;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class QuizController {

    private Quiz quiz;

    @FXML Button createQuizbtn;
    @FXML Button startQuizbtn;

public void handleCreateButtonClick() throws IOException{

    try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CreateQuiz.fxml"));
        Stage createStage = new Stage();
        Parent parent = (Parent) fxmlLoader.load();
        createStage.setScene(new Scene(parent));
        createStage.show();
    } catch (IOException e) {
        throw new IOException("couldn't open window");
    }
}

public void handleStartButtonClick() throws IOException{

    try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("StartQuiz.fxml"));
        Stage createStage = new Stage();
        Parent parent = (Parent) fxmlLoader.load();
        createStage.setScene(new Scene(parent));
        createStage.show();
    } catch (IOException e) {
        throw new IOException("couldn't open window");
    }
}
}