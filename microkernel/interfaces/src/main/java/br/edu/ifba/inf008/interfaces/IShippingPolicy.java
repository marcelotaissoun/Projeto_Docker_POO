package br.edu.inf008.interfaces;

import br.edu.inf008.interfaces.DeliveryStrategy;

public interface IShippingPolicy {
    public abstract float delivery(DeliveryStrategy strategy, float amount);
}
