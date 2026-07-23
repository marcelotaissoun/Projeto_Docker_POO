package br.edu.ifba.inf008.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="customer_id")
    private Long customerId;

    @Column(name="cart_id")
    private Long cartId;

    @Column(name="shipping_method_id")
    private Long shippingMethodId;

    private String status;
    private BigDecimal subtotal;

    @Column(name="discount_total")
    private BigDecimal discountTotal;

    @Column(name="shipping_total")
    private BigDecimal shippingTotal;

    @Column(name="grand_total")
    private BigDecimal grandTotal;

    @Column(name="created_at")
    private LocalDateTime createdAt;

    public Order() {
    }

    public Order(Long id, Long customerId, Long cartId, Long shippingMethodId, String status, BigDecimal subtotal, BigDecimal discountTotal, BigDecimal shippingTotal, BigDecimal grandTotal, LocalDateTime createdAt) {
        this.id = id;
        this.customerId = customerId;
        this.cartId = cartId;
        this.shippingMethodId = shippingMethodId;
        this.status = status;
        this.subtotal = subtotal;
        this.discountTotal = discountTotal;
        this.shippingTotal = shippingTotal;
        this.grandTotal = grandTotal;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public Long getShippingMethodId() {
        return shippingMethodId;
    }

    public void setShippingMethodId(Long shippingMethodId) {
        this.shippingMethodId = shippingMethodId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getDiscountTotal() {
        return discountTotal;
    }

    public void setDiscountTotal(BigDecimal discountTotal) {
        this.discountTotal = discountTotal;
    }

    public BigDecimal getShippingTotal() {
        return shippingTotal;
    }

    public void setShippingTotal(BigDecimal shippingTotal) {
        this.shippingTotal = shippingTotal;
    }

    public BigDecimal getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(BigDecimal grandTotal) {
        this.grandTotal = grandTotal;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}

