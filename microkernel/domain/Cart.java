import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class Cart {
    private List<CartItem> items;
    private Long id;
    private Long customerId;
    private String status;
    private LocalDateTime createdAt;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public List<CartItem> getItems() {
        return items;
    }

    public void addProduct(Product product, int quantity) {
        for(CartItem item : items) {
            if(item.getProduct().getId() == product.getId()) {
                item.increaseQuantity(quantity);
                return;
            }
        }
        items.add(new CartItem(product, quantity));
    }

    public void removeProduct(Product product) {
        items.removeIf(item -> item.getProduct().getId() == product.getId());
    }

    public void clearCart() {
        items.clear();
    }

    public BigDecimal getSubtotal() {
        BigDecimal subtotal = BigDecimal.ZERO;

        for(CartItem item : items) {
            subtotal = subtotal.add(item.getSubtotal());
        }
        return subtotal;
    }
}
