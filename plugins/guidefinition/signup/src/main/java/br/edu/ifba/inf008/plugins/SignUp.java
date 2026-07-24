package br.edu.ifba.inf008.plugins;

import br.edu.ifba.inf008.interfaces.IGUI;
import br.edu.ifba.inf008.screens.SignUpScreen;

public class SignUp extends IGUI {
    
    @Override
    public void init(){
        SignUpScreen.constructScene();
    }

    @Override 
    public void setMainNode(){
        mainNode = SignUpScreen.constructScene();
    }
}