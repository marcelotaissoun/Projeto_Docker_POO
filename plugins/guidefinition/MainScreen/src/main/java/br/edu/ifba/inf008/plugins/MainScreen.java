package br.edu.ifba.inf008.plugins;

import br.edu.ifba.inf008.interfaces.IGUI;
import br.edu.ifba.inf008.screens.MainScreen;

public class MainScreen implements IGUI{
    
    @Override
    public void init(){
        MainScreen.constructScene();
    }

    @Override
    public String getPluginName(){
        return this.getClass().getName();
    }
}