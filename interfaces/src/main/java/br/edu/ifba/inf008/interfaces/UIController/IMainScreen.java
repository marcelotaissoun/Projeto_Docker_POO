package br.edu.ifba.inf008.uicontroller;
import javafx.scene.layout.HBox

public interface IMainScreen{

    public abstract HBox listNewProduct();
    public abstract HBox listCalledProduct(int id);
    public abstract HBox listAllProducts();

}
