package br.edu.ifba.inf008.shell;

import br.edu.ifba.inf008.interfaces.*;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.layout.StackPane;
import javafx.scene.Node;

public class Core extends ICore
{
    private static String scene = "br.edu.ifba.inf0008.plugins.LogIn";
    private StackPane root = new StackPane();
    
    private IAuthenticationController authenticationController = new AuthenticationController();
    private IIOController ioController = new IOController();
    private IPluginController pluginController = new PluginController();
    private IUIController UIController = new UIController();

    private Core() {}

    public static boolean init() {
	if (instance != null) {
	    System.out.println("Fatal error: core is already initialized!");
	    System.exit(-1);
	}

	    instance = new Core();
        instance.getPluginController().init();
        UIController.launch(UIController.class);

        return true;
    }

    public void changeScreen(String pluginName){
        scene = pluginName;

        Platform.runLater(() -> {
            try {
                
                Class<?> clazz = Class.forName(scene);
                IPlugin currentPlugin = (IPlugin) clazz.getDeclaredConstructor().newInstance();
                
                
                currrentPlugin.init();
                
                Node currentScene = pluginInstancia.getVisualComponent(); 
                
                rootContainer.getChildren().setAll(currentScene);
                
            } catch (Exception e) {
                System.err.println("Erro ao carregar a tela do plugin: " + e.getMessage());
                e.printStackTrace();
            }
     
        });
    }

    public StackPane getRootContainer() {
        return rootContainer;
    }

    public IUIController getUIController() {
        return UIController.getInstance();
    }
    public IAuthenticationController getAuthenticationController() {
        return authenticationController;
    }
    public IIOController getIOController() {
        return ioController;
    }
    public IPluginController getPluginController() {
        return pluginController;
    }

}
