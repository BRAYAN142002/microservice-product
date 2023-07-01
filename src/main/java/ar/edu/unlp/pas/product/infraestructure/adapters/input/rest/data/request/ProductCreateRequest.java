package ar.edu.unlp.pas.product.infraestructure.adapters.input.rest.data.request;

import javax.validation.constraints.NotEmpty;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductCreateRequest {
    @NotEmpty(message = "Name may not be empty")
    private String name;

    @NotEmpty(message = "price may not be empty")
    private double price;

    @NotEmpty(message = "Description may not be empty")
    private String description;

    @NotEmpty(message = "category may not be empty")
    private String category;

    @NotEmpty(message = "street may not be empty")
    private int street;

    @NotEmpty(message = "haouseNumber may not be empty")
    private int houseNumber;
    

    @NotEmpty(message = "city may not be empty")
    private String city;
    @NotEmpty(message = "province may not be empty")
    private String province;

    @NotEmpty(message = "country may not be empty")
    private String country;


}
