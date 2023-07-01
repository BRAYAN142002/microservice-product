package ar.edu.unlp.pas.product.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import java.util.ArrayList;
import ar.edu.unlp.pas.product.application.ports.input.ProductManager;

import ar.edu.unlp.pas.product.application.ports.output.ProductOutputPort;
import ar.edu.unlp.pas.product.domain.models.Product;
import ar.edu.unlp.pas.product.infraestructure.adapters.output.persistence.ProductPersistenceAdapter;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements ProductManager{
 
    private final ProductPersistenceAdapter productOutputPort;
    @Autowired
    public ProductService(ProductPersistenceAdapter productOutputPort) {
        this.productOutputPort = productOutputPort;
    }

    @Override
    public Product createProduct(Product product) {
        product=productOutputPort.create(product);
        return product;
    }

    @Override
    public Product modifyStock(Long id, Product product) {
       product=productOutputPort.update(id, product);
       return product;

    }

    @Override
    public Product postStock(Product product) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'postStock'");
    }

    @Override
    public void suspendPublication(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'suspendPublication'");
    }

    @Override
    public List<Product> findProductsAll() {
       List<Product> products;
       products=productOutputPort.findAll();
       return products;
    }

    @Override
    public List<Product> find(String name) {
        List<Product> products;
        products=productOutputPort.find(name);
        return products;
    }


    @Override
    public Product findById(Long id) {
        return productOutputPort.findById(id);
    }

    @Override
    public Product updateProduct(Long id, Product product) {
       return productOutputPort.update(id, product);
    }

    @Override
    public void deleteProduct(Long id) {
        productOutputPort.delete(id);
    }
}