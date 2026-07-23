package br.edu.ifba.inf008.plugins;

import br.edu.interfaces.IShippingPolicy;
import br.edu.interfaces.IPlugin;
import br.edu.ifba.inf008.plugins.StandartStrategy;

public class Standart implements IShippingPolicy, IPlugin{
    
    StandartStrategy standartStrategy;

    public Standart(StandartStrategy standartStrategy){
        this.standartStrategy = standartStrategy;
    }

    @Override
    public void init(){
        public void delivery(DeliveryStrategy standartStrategy, float amount);
    }

    @Override
    public float delivery(DeliveryStrategy standartStrategy, float amount){
        if(standartStrategy.autenticate){
            return amount + standartStrategy.getFreigth();
        }
    }
}
