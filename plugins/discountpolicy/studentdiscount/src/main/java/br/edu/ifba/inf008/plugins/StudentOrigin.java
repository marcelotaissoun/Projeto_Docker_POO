package br.edu.ifba.inf008.plugins;

import br.edu.ifba.inf008.interfaces.IOriginDiscount;

public class CouponOrigin implements IOriginDiscount{

    private TypesDiscount type;
    prrivate String value;

    public StudentOrigin(TypesDiscount type, String value){
        this.type = type;
        this.value = value;
    }

    @Override
    public  float authOrigin(TypesDiscount type, String value){

        if(type != TypesDiscount.STUDENT)
            throw new Exception("Invalid type");

        return true;

        @Override
        public void init(){
            authOrigin(type, value);
        }
    }
}
