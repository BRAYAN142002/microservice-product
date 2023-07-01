package ar.edu.unlp.pas.product.infraestructure.adapters.input.rest.mapper;

import ar.edu.unlp.pas.product.domain.models.Product;
import ar.edu.unlp.pas.product.infraestructure.adapters.input.rest.data.request.ProductCreateRequest;
import ar.edu.unlp.pas.product.infraestructure.adapters.input.rest.data.response.ProductCreateResponse;
import ar.edu.unlp.pas.product.infraestructure.adapters.input.rest.data.response.ProductQueryResponse;
import org.springframework.stereotype.Component;

@Component
public class ProductRestMapperImpl implements ProductRestMapper {

    @Override
    public Product toProduct(ProductCreateRequest productCreateRequest) {
        // Implementación de la conversión de ProductCreateRequest a Product
        return null;
    }

    @Override
    public ProductCreateResponse toProductCreateResponse(Product product) {
        // Implementación de la conversión de Product a ProductCreateResponse
        return null;
    }

    @Override
    public ProductQueryResponse toProductQueryResponse(Product product) {
        // Implementación de la conversión de Product a ProductQueryResponse
        return null;
    }
}