package br.edu.ifba.inf008.plugins;

import br.edu.ifba.inf008.interfaces.IGUI;
import br.edu.ifba.inf008.screens.LogInScreen;

public class LogIn {
    
    @Override
    public void init(){
        LogInScreen.constructScene();
    }

    @Override
    public String getPluginName(){
        return this.getClass().getName();
    }
}

