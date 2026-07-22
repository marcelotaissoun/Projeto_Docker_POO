package br.edu.ifba.inf008.interfaces;

import br.edu.ifba.inf008.enum.typesDiscount;

public interface IOriginDiscount extends IPlugin{
    public boolean authDiscount(TypesDiscount type, String value);
}
