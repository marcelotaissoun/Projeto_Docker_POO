package br.edu.infba.inf008.plugins;

import br.edu.ifba.inf008.interfaces.IPayable;
import br.edu.ifba.inf008.interfaces.IPayableStrategy;

public class CreditCard {
    private IPayableStrategy payMethod;
    private float amount;
    
    public CreditCard(IPayableStrategy payMethod, float amount){
        this.payMethod = payMethod;
        this.amount = amount;
    }

    @Override
    public void init(){
        pay(payMethod, amount);
    }

    @Override
    public boolean pay(IPayableStrategy payMethod, float amount){
        if(payMethod.authPayment){
            return true;

        }
        
        throw new Exception("Invalid Payment!");
    }
}
