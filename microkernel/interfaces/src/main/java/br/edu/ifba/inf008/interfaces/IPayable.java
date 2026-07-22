package br.edu.ifba.inf008.interfaces;

import br.edu.ifba.inf008.interfaces.IPlugin;
import br.edu.ifba.inf008.interfaces.IPayableStrategy;

public interface IPayable extends IPlugin{
    public abstract boolean pay(IPayableStrategy payMethod, float amount);
}