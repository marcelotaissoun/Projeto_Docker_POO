package br.edu.ifba.inf008.exceptions;

public class InvalidPaymentException extends RuntimeException {

    public InvalidPaymentException() {
        super("Forma de pagamento inválida.");
    }

    public InvalidPaymentException(String message) {
        super(message);
    }
}
