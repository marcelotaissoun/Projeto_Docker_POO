package br.edu.ifba.inf008.interfaces;

import br.edu.ifba.inf008.interfaces.IOriginDiscount;
import br.edu.ifba.inf008.interfaces.IPlugin;

public interface IDiscountPolicy extends IPlugin{
    public abstract float applyDiscount(IOriginDiscount origin, float amount);
}
