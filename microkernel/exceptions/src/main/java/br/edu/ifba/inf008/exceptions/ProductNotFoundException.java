package br.edu.ifba.inf008.exceptions;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException() {
        super("Produto não encontrado.");
    }

    public ProductNotFoundException(String message) {
        super(message);
    }
}
