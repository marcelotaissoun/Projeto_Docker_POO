import br.edu.ifba.inf008.domain.Cart;
import br.edu.ifba.inf008.domain.CartItem;



import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class CheckoutController {

    @FXML
    private TableView<CartItem> tableCart;

    @FXML
    private TableColumn<CartItem, String> colProduct;

    @FXML
    private TableColumn<CartItem, Integer> colQuantity;

    @FXML
    private TableColumn<CartItem, Number> colPrice;

    @FXML
    private TableColumn<CartItem, Number> colSubtotal;

    @FXML
    private ComboBox<String> cbDiscount;

    @FXML
    private ComboBox<String> cbShipping;

    @FXML
    private RadioButton rbCredit;

    @FXML
    private RadioButton rbPix;

    @FXML
    private RadioButton rbCash;

    @FXML
    private Label lblSubtotal;

    @FXML
    private Label lblDiscount;

    @FXML
    private Label lblShipping;

    @FXML
    private Label lblTotal;

    private final CheckoutService service = new CheckoutService();

    private Cart cart;

    @FXML
    public void initialize() {

        ToggleGroup group = new ToggleGroup();

        rbCredit.setToggleGroup(group);
        rbPix.setToggleGroup(group);
        rbCash.setToggleGroup(group);

        cbDiscount.getItems().addAll(
                "Sem desconto",
                "10%",
                "20%"
        );

        cbShipping.getItems().addAll(
                "Retirada",
                "Entrega Normal",
                "Entrega Expressa"
        );

        cbDiscount.getSelectionModel().selectFirst();
        cbShipping.getSelectionModel().selectFirst();

        cbDiscount.setOnAction(e -> atualizarResumo());
        cbShipping.setOnAction(e -> atualizarResumo());
    }

    public void setCart(Cart cart) {

        this.cart = cart;

        tableCart.setItems(
                FXCollections.observableArrayList(cart.getItems())
        );

        atualizarResumo();
    }

    private void atualizarResumo() {

        if (cart == null)
            return;

        lblSubtotal.setText(service.getSubtotal(cart));

        lblDiscount.setText(
                service.getDiscount(
                        cart,
                        cbDiscount.getValue()
                )
        );

        lblShipping.setText(
                service.getShipping(
                        cbShipping.getValue()
                )
        );

        lblTotal.setText(
                service.getTotal(
                        cart,
                        cbDiscount.getValue(),
                        cbShipping.getValue()
                )
        );
    }

    @FXML
    private void finalizarCompra() {

        String pagamento = "";

        if (rbCredit.isSelected())
            pagamento = "Crédito";

        else if (rbPix.isSelected())
            pagamento = "Pix";

        else if (rbCash.isSelected())
            pagamento = "Dinheiro";

        service.finalizarCompra(
                cart,
                pagamento,
                cbDiscount.getValue(),
                cbShipping.getValue()
        );

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setHeaderText(null);
        alert.setContentText("Pedido realizado com sucesso!");

        alert.showAndWait();
    }

    @FXML
    private void voltar() {

    }

}