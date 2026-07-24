package br.edu.ifba.inf008.services;

import br.edu.ifba.inf008.shell.Core;
import br.edu.ifba.inf008.domain.Cart;
import br.edu.ifba.inf008.domain.Product;

import javafx.collections.ObservableList;

public class MainService {

    
    
    public void changeCheckout() {
        Cart cart = new cart();

        if(cart.isEmpty())
            throw new exception("The cart is empty");

        String checkoutScreen = "br.edu.ifba.inf008.plugins.Checkout"; 
        
        Core.getInstance().mudarTela(checkoutScreen);
    }

    public List<Product> listAllProducts(){
        return Product.getAll();
    }

    public Product findProduct(){

    }
}