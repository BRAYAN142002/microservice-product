package ar.edu.unlp.pas.product.application.ports.output;

import ar.edu.unlp.pas.product.domain.models.Product;
import java.util.List;

public interface ProductOutputPort {
     Product create(Product product);
     Product update(Long id,Product product);
     List<Product> find(String name);
     List<Product> findAll();
     Product findById(Long id);
     void delete(Long id);
}
