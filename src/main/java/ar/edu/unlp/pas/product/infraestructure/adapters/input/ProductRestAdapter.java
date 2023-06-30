package ar.edu.unlp.pas.product.infraestructure.adapters.input;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.unlp.pas.product.application.ports.input.ProductManager;
import ar.edu.unlp.pas.product.domain.models.Product;
import ar.edu.unlp.pas.product.infraestructure.adapters.input.rest.data.request.ProductCreateRequest;
import ar.edu.unlp.pas.product.infraestructure.adapters.input.rest.data.response.ProductCreateResponse;
import ar.edu.unlp.pas.product.infraestructure.adapters.input.rest.data.response.ProductQueryResponse;
import ar.edu.unlp.pas.product.infraestructure.adapters.input.rest.mapper.ProductRestMapper;
import lombok.RequiredArgsConstructor;
import java.util.List;
import java.util.ArrayList;



@RestController
@RequestMapping("products")
@RequiredArgsConstructor
public class ProductRestAdapter {

    private final ProductManager productManager;
    private final ProductRestMapper productRestMapper;

     @RequestMapping(method=RequestMethod.POST, produces="application/json")
    @ResponseBody
    public ResponseEntity<ProductCreateResponse> createProduct(@RequestBody @Valid ProductCreateRequest productCreateRequest){
        // Request to domain
        Product product = productRestMapper.toProduct(productCreateRequest);

        product = productManager.createProduct(product);

        // Domain to response
        return new ResponseEntity<>(productRestMapper.toProductCreateResponse(product), HttpStatus.CREATED);
    }
    
    @RequestMapping(value = "{name}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ResponseEntity<List<ProductQueryResponse>> getProduct(@PathVariable String name) {
        List<Product> products = productManager.find(name);

        if (!products.isEmpty()) {
            List<ProductQueryResponse> responseList = new ArrayList<>();
            for (Product product : products) {
                ProductQueryResponse response = productRestMapper.toProductQueryResponse(product);
                responseList.add(response);
            }
            return ResponseEntity.ok(responseList);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}



