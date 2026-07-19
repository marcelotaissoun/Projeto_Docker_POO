package br.edu.ifba.inf008.plugins;

import  br.edu.ifba.inf008.screens.SignUpScreen;
import br.edu.ifba.inf008.interfaces.IGUI;

public class ChoosePolicies implements IGUI{

    @Override
    public void init(){
        SignUpScreen.constructScene();
    }

    @Override
    public String namePlugin(){
        return ChoosePolicies.class.getName();
    }

    new ControllerSignUpScreen(new SignUpScreen());


}
