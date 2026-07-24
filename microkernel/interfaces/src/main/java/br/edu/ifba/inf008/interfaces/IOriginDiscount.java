package br.edu.ifba.inf008.interfaces;

import br.edu.ifba.inf008.enums.typesDiscount;

public interface IOriginDiscount extends IPlugin{
    public boolean authDiscount(TypesDiscount type, String value);
}
