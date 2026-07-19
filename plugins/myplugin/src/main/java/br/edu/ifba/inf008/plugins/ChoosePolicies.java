package br.edu.ifba.inf008.plugins;

import  br.edu.ifba.inf008.screens.ChoosePoliciesScreen;
import br.edu.ifba.inf008.interfaces.IGUI;

public class ChoosePolicies implements IGUI{
    @Override
    public void init(){
        ChoosePoliciesScreen.constructScene();
    }

    @Override
    public String namePlugin(){
        return "ChoosePolicies";
    }

    new ControllerChoosePolicesScreen(new ChoosePoliciesScreen());
    new ServiceChoosePolicesScreen(new ChoosePoliciesScreen());

}
