package br.edu.ifba.inf008.plugins;

import br.edu.ifba.inf008.interfaces.IPayableStrategy;

public class PixStrategy implements IPayableStrategy{
    
    @Override
    public boolean authPayment(String payMethod){
        if(payMethod.length() == 15 || 
            payMethod.contains("@gmail.com") || 
            payMethod.length() == 13)
                return true;

        return false;
    }
}
