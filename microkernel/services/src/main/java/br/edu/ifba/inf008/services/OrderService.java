package br.edu.ifba.inf008.services;

import java.util.List;

import br.edu.ifba.inf008.services.OrderItem;
import br.edu.ifba.inf008.services.Product;
import br.edu.ifba.inf008.services.Order;

public class OrderService {
    
    private Order items;

    public void addOrderItem(Product item, int quantity){
        if(item.exists()){
           items.addItem(new OrderItem(product, quantity));
        }
    }

    public List<OrderItem> newOrder(items){
        if(!items.isEmpty())
            return items;
        
        throw new exception("The order is empty!");
    }

    //Um método para adicionar todo o carrinho
    //O código falha por conta do items.exists(), linha 14. O método não existe ainda em Product.java
}
