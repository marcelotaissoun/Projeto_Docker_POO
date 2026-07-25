package br.edu.ifba.inf008.exceptions;

public class InsufficientStockException extends RuntimeException {

    public InsufficientStockException() {
        super("Estoque insuficiente.");
    }

    public InsufficientStockException(String message) {
        super(message);
    }
}
