package br.edu.ifba.inf008.plugins;

import br.edu.ifba.inf008.interfaces.IOriginDiscount;

public class CouponOrigin implements IOriginDiscount{

    private TypesDiscount type;
    prrivate String value;

    public CouponOrigin(TypesDiscount type, String value){
        this.type = type;
        this.value = value;
    }

    @Override
    public  float authOrigin(TypesDiscount type, String value){

        if(type != TypesDiscount.COUPON)
            throw new Exception("Invalid type");

        return true;

        @Override
        public void init(){
            authOrigin(type, value);
        }
    }
}
