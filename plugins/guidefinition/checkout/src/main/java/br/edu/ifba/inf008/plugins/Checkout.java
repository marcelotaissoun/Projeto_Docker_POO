package br.edu.ifba.inf008.plugins;

import br.edu.ifba.inf008.interfaces.IGUI;
import br.edu.ifba.inf008.screens.CheckoutScreen;

public class Checkout extends IGUI {
    
    @Override
    public void init(){
        CheckoutScreen.constructScene();
    }

    @Override 
    public void setMainNode(){
        mainNode = CheckoutScreen.constructScene();
    }
}