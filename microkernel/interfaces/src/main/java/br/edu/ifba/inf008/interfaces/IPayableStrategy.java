package br.edu.ifba.inf008.interfaces;

public interface IPayableStrategy{
    public abstract boolean authPayment(String payMethod);
}