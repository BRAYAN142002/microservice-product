package ar.edu.unlp.pas.product.domain.exception;

public class ProductNotFound extends RuntimeException  {
     public ProductNotFound(String message) {
        super(message);
    }
}
