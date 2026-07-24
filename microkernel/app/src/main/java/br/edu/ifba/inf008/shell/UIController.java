package br.edu.ifba.inf008.shell;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class UIController extends Application implements IUIController {
    private static UIController instance;
    
    // O container "vazio" que vai segurar as telas do Scene Builder
    private static StackPane rootContainer = new StackPane();

    public static UIController getInstance() { return instance; }
    public static StackPane getRootContainer() { return rootContainer; }

    @Override
    public void start(Stage primaryStage) throws Exception {
        instance = this;

        Scene mainScene = new Scene(rootContainer, 800, 600);
        primaryStage.setScene(mainScene);
        primaryStage.setTitle("The Fantastic E-Commerce");
        primaryStage.show();
        
        Core.getInstance().mudarTela("br.edu.ifba.inf008.plugins.LogIn");
    }
}
