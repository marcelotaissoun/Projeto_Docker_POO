package br.edu.ifba.inf008.plugins.checkout;

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
    private TableColumn<CartItem, Double> colPrice;

    @FXML
    private TableColumn<CartItem, Double> colSubtotal;

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

    @FXML
    private Button btnCheckout;

    @FXML
    private Button btnReturn;

    private final CheckoutService checkoutService = new CheckoutService();

    private Cart cart;

    @FXML
    public void initialize() {

        ToggleGroup paymentGroup = new ToggleGroup();

        rbCredit.setToggleGroup(paymentGroup);
        rbPix.setToggleGroup(paymentGroup);
        rbCash.setToggleGroup(paymentGroup);

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

        checkoutService.atualizarResumo(
                cart,
                cbDiscount.getValue(),
                cbShipping.getValue(),
                lblSubtotal,
                lblDiscount,
                lblShipping,
                lblTotal
        );
    }

    @FXML
    private void finalizarCompra() {

        Toggle toggle = rbCredit.getToggleGroup().getSelectedToggle();

        if (toggle == null) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText(null);
            alert.setContentText("Selecione uma forma de pagamento.");
            alert.showAndWait();
            return;
        }

        checkoutService.finalizarCompra(
                cart,
                cbDiscount.getValue(),
                cbShipping.getValue(),
                ((RadioButton) toggle).getText()
        );

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setHeaderText(null);
        alert.setContentText("Compra realizada com sucesso!");

        alert.showAndWait();
    }

    @FXML
    private void voltar() {

    }

}
