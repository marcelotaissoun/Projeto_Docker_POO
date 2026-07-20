package br.edu.inf008.interfaces;

public interface IDeliveryStrategy {
    public abstract boolean autenticate(String local);
    public abstract float getFreigth();
}
