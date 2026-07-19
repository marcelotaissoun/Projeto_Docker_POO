package br.edu.ifba.inf008.plugins;

import  br.edu.ifba.inf008.screens.MainScreen;
import br.edu.ifba.inf008.interfaces.IGUI;

public class MainScreen implements IGUI {

    @Override
    public void init(){
        MainScreen.constructScene();
    }

    @Override
    public void namePlugin(){
        return MainScreen.class.getName();
    }

    new ControllerMainScreen(new MainScreen());

}
