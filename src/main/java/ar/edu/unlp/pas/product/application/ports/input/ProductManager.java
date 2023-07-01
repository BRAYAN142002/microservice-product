package ar.edu.unlp.pas.product.application.ports.input;

import ar.edu.unlp.pas.product.domain.models.Product;
import java.util.List;
public interface  ProductManager {
    Product createProduct(Product product);
    Product modifyStock(Long id,Product product);
    Product postStock(Product product);
    void suspendPublication(Long id);
    List<Product> findProductsAll();
    List<Product> find(String name);
    Product findById(Long id);
    Product updateProduct(Long id, Product product);
    void deleteProduct(Long id);


}
