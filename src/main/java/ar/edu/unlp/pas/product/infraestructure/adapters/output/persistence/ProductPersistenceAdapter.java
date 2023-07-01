package ar.edu.unlp.pas.product.infraestructure.adapters.output.persistence;

import ar.edu.unlp.pas.product.application.ports.output.ProductOutputPort;
import ar.edu.unlp.pas.product.domain.models.Product;
import ar.edu.unlp.pas.product.infraestructure.adapters.output.persistence.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductPersistenceAdapter implements ProductOutputPort {

    private final ProductRepository productRepository;

    @Autowired
    public ProductPersistenceAdapter(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product create(Product product) {
        return null;
    }

    @Override
    public Product update(Long id, Product product) {
        return null;
    }

    @Override
    public List<Product> find(String name) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public Product findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

}