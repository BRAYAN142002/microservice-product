package ar.edu.unlp.pas.product.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import java.util.ArrayList;
import ar.edu.unlp.pas.product.application.ports.input.ProductManager;

import ar.edu.unlp.pas.product.application.ports.output.ProductOutputPort;
import ar.edu.unlp.pas.product.domain.models.Product;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

import lombok.*;

@Service
@AllArgsConstructor
public class ProductService implements ProductManager{
    @Autowired
    private final ProductOutputPort productOutputPort;

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
       List<Product> products=new ArrayList<>();
       products=productOutputPort.findAll();
       return products;
    }

    @Override
    public List<Product> find(String name) {
        List<Product> products=new ArrayList<>();
        products=productOutputPort.find(name);
        return products;
    }
}
