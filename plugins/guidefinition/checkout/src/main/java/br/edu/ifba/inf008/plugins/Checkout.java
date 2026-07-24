package br.edu.ifba.inf008.plugins;

import br.edu.ifba.inf008.interfaces.IGUI;
import br.edu.ifba.inf008.screens.CheckoutScreen;

public class Checkout{
    
    @Override
    public void init(){
        CheckoutScreen.constructScene();
    }

    @Override
    public String getPluginName(){
        return this.getClass().getName();
    }
}