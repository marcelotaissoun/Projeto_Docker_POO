package br.edu.ifba.inf008.plugins;

import br.edu.ifba.inf008.interfaces.IGUI;
import br.edu.ifba.inf008.screens.ChoosePoliciesScreen;

public class ChoosePolicies{
    
    @Override
    public void init(){
        ChoosePoliciesScreen.constructScene();
    }

    @Override
    public String getPluginName(){
        return this.getClass().getName();
    }
}