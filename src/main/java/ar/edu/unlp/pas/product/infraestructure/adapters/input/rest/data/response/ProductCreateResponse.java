package ar.edu.unlp.pas.product.infraestructure.adapters.input.rest.data.response;
import lombok.*;

@Builder
@Data
public class ProductCreateResponse {
    private Long id;
    private String name;
    private  Double price;
    private  String description;
    private String category;
    private Address address;
}
