package br.edu.ifba.inf008.plugins;

import br.edu.ifba.inf008.interfaces.IGUI;
import br.edu.ifba.inf008.screens.MainScreenScreen;

public class MainScreen extends IGUI {
    
    @Override
    public void init(){
        MainScreenScreen.constructScene();
    }

    @Override 
    public void setMainNode(){
        mainNode = MainScreenScreen.constructScene();
    }
}