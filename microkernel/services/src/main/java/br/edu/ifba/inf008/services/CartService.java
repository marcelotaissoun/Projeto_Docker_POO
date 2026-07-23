package br.edu.ifba.inf008.services;

import br.edu.ifba.inf008.domain.Cart;
import br.edu.ifba.inf008.domain.Product;

public class CartService {
    
    private Cart cart;
    private boolean success;

    public CartService(Cart cart){
        this.cart = cart;
    }

    public List<CartItem> getItemsCart{

        if(!cart.isEmpty())
            return cart.getItems();

        throw new exception("empty cart");
    }

    public boolean addCartItem(Product product, int quantity){
        
        if(product.exists()){
            
            cart.addProduct(product, quantity);
            return true;

        }

        throw new exception("The refered product does not exist!");
    }

    public boolean removeItemCart(Product product){
        
        if(product.exists()){
            if(product.isPresent(cart, product)){
                cart.removeProduct(product);
            
                return true;
                }else{
                    throw new exception("The product doesnt exist on the cart!");        
                }
        } else{
            throw new exception("Its not possible remove the product. It doesnt exist!");
        }

    }

    public float getCartAmount(){
        
        if(!cart.isEmpty())
            return cart.getSubtotal();

        throw new exception("The cart is empty!");
        
    }

    public boolean clearCart(){
        if(!cart.isEmpty())
            return cart.clearCart();

        throw new exception("The cart is empty!");
    }
}
