package br.edu.ifba.inf008.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Product")
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String sku;
    
    private String name;
    
    private String description;
    @
    Column(name = "unit_price")
    private float unitPrice;
    
    private boolean active;

    public Product(){}

    // Getter e Setter para id
    public Long getId() {
        return id;
    }

    // Getter e Setter para sku
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    // Getter e Setter para name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter e Setter para description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Getter e Setter para unitPrice
    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    // Getter e Setter para active (padrão 'is' para booleanos)
    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
