package br.edu.ifba.inf008.controllers;

import br.edu.ifba.inf008.services.MainService;
import javafx.fxml.FXML;

public class MainController {

    private MainService mainService = new MainService();
    private ObservableList<Product> allProducts = FXCollections.observableArrayList();
    private ObservableList<Product> filteredProducts;
    

    public void startProducts() {
        
        allProducts.setAll(produtoService.listAllProducts());
    
        filteredProducts = new FilteredList<>(allProducts, p -> true);
    
        listViewProdutos.setItems(produtosFiltrados);
    }

    // Chame este método no evento 'On Key Typed' do campo de texto de busca
    @FXML
    private void handleFindProduct() {
        String query = txtBusca.getText().toLowerCase().trim();
    
        produtosFiltrados.setPredicate(produto -> {

        return produto.getNome().toLowerCase().contains(busca);
    });
}


    @FXML
    private void handleCreateOrder() {
        try{

            mainService.changeCheckout();
        }Catch(Exception e){

        }
    }

    listViewCart.setCellFactory(lv -> new ListCell<CartItem>() {
    private final CheckBox checkBox = new CheckBox();

    @Override
    protected void updateItem(CartItem item, boolean empty) {
        super.updateItem(item, empty);
        if (empty || item == null) {
            setText(null);
            setGraphic(null);
        } else {
            checkBox.setSelected(item.isSelect());
            checkBox.setOnAction(e -> item.setSelect(checkBox.isSelected()));
            
            setText(item.getProduto().getName() + " - R$ " + item.getPrice());
            setGraphic(checkBox);
        }
    }
});
}