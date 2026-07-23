import java.time.LocalDateTime;

@Entity
@Table(name="customer")
public class Customer {

    @Id
    @GeneratedValue(stratetegy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name")
    private String fullName;

    private String email;

    @Column(name="customer_type")
    private String customerType; //Enum posteriormente

    @Column(name="created_at")
    private LocalDateTime createdAt;

    // Construtor padrão
    public Customer() {
    }

    // Construtor completo (útil para instanciar dados vindos do banco)
    public Customer(Long id, String fullName, String email, String customerType, LocalDateTime createdAt) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.customerType = customerType;
        this.createdAt = createdAt;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
