import br.edu.ifba.inf008.domain.Cart;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CheckoutService {

    public String getSubtotal(Cart cart) {

        return "R$ " + cart.getSubtotal();
    }

    public String getDiscount(Cart cart, String option) {

        return "R$ " + calculateDiscount(cart, option);
    }

    public String getShipping(String option) {

        return "R$ " + calculateShipping(option);
    }

    public String getTotal(
            Cart cart,
            String discount,
            String shipping
    ) {

        BigDecimal subtotal = cart.getSubtotal();
BigDecimal total = subtotal
                .subtract(calculateDiscount(cart, discount))
                .add(calculateShipping(shipping));

        return "R$ " + total;
    }

    private BigDecimal calculateDiscount(
            Cart cart,
            String option
    ) {

        BigDecimal subtotal = cart.getSubtotal();

        if ("10%".equals(option))
            return subtotal.multiply(new BigDecimal("0.10"));

        if ("20%".equals(option))
            return subtotal.multiply(new BigDecimal("0.20"));

        return BigDecimal.ZERO;
    }

    private BigDecimal calculateShipping(String option) {

        if ("Entrega Normal".equals(option))
            return new BigDecimal("15");

        if ("Entrega Expressa".equals(option))
            return new BigDecimal("30");

        return BigDecimal.ZERO;
    }

    public void finalizarCompra(
            Cart cart,
            String pagamento,
            String desconto,
            String frete
    ) {

        BigDecimal subtotal = cart.getSubtotal();

        BigDecimal total = subtotal
                .subtract(calculateDiscount(cart, desconto))
                .add(calculateShipping(frete));

        System.out.println("========== CHECKOUT ==========");
        System.out.println("Pagamento: " + pagamento);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Total: " + total);

        orderRepository.save(order);
    }

}