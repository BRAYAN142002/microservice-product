package ar.edu.unlp.pas.product.infraestructure.adapters.input.rest;


import java.util.List;

import javax.validation.Valid;

import ar.edu.unlp.pas.product.application.ports.input.ProductManager;
import ar.edu.unlp.pas.product.domain.models.Product;
import ar.edu.unlp.pas.product.infraestructure.adapters.input.rest.data.request.ProductCreateRequest;
import ar.edu.unlp.pas.product.infraestructure.adapters.input.rest.data.response.ProductCreateResponse;
import ar.edu.unlp.pas.product.infraestructure.adapters.input.rest.data.response.ProductQueryResponse;
import ar.edu.unlp.pas.product.infraestructure.adapters.input.rest.mapper.ProductRestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductRestAdapter {

    @Autowired
    private final ProductManager productManager;
     @Autowired
    private final ProductRestMapper productRestMapper;

    @Autowired
    public ProductRestAdapter(ProductManager productManager,ProductRestMapper productRestMapper){
        this.productManager = productManager;
        this.productRestMapper = productRestMapper;
    }

    @RequestMapping(method= RequestMethod.POST, produces="application/json")
    @ResponseBody
    public ResponseEntity<ProductCreateResponse> createProduct(@RequestBody @Valid ProductCreateRequest productCreateRequest){
        // Request to domain
        Product product = productRestMapper.toProduct(productCreateRequest);

        product = productManager.createProduct(product);

        
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



