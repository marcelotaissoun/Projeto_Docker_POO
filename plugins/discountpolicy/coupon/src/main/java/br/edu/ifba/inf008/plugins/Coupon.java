package br.edu.ifba.inf008.plugins;

import br.edu.ifba.inf008.interfaces.IDiscountPolicy;

public class CupomDiscountPolicy implements IDiscountPolicy{
    private IOriginDiscount origin;
    private float amount;

    public Coupon(IOriginDiscount origin, float amount){
        this.origin = origin;
        this.amount = amount;
    }

    @Override
    public void init(){
        applyDiscount(origin, amount);
    }

    @Override
    public  float applyDiscount(IOriginDiscount origin, float amount){
        if(origin.authDiscount)
            return amount - 50.0f;

        throw new Exception("Your coupon isnt valid!");
    }
}
