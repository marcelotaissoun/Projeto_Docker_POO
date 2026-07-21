package br.edu.ifba.inf008.plugins;

import br.edu.inf008.interfaces.IDeliveryStrategy;

public class StandartStrategy implements IDeliveryStrategy{

    @Override
    public boolean autenticate(String local){
        
        if(local.equals("Salvador") || local.equals("salvador"));
            return true;
        
        return false;
    }

    @Override
    public float getFreigth(){
        return 25.0f;
    }
}
