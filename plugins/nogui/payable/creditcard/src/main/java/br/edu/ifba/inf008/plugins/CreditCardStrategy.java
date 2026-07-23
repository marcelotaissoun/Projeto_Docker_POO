package br.edu.ifba.inf008.plugins;

import br.edu.ifba.inf008.interfaces.IPayableStrategy;

public class CreditCardStrategy {
   
    @Override
    public boolean authPayment(String payMethod){
        if(payMethod.length() != 20)
            return false;

        return true;
    }
}
