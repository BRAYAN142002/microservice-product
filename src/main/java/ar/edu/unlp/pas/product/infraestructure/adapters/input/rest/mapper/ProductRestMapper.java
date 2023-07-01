package ar.edu.unlp.pas.product.infraestructure.adapters.input.rest.mapper;

import ar.edu.unlp.pas.product.domain.models.Product;
import ar.edu.unlp.pas.product.infraestructure.adapters.input.rest.data.response.ProductQueryResponse;
import ar.edu.unlp.pas.product.infraestructure.adapters.input.rest.data.request.ProductCreateRequest;
import ar.edu.unlp.pas.product.infraestructure.adapters.input.rest.data.response.ProductCreateResponse;
public interface ProductRestMapper {
    
    Product toProduct(ProductCreateRequest productCreaterequest);
    ProductCreateResponse toProductCreateResponse(Product prodouct);
    ProductQueryResponse toProductQueryResponse(Product product);
}
