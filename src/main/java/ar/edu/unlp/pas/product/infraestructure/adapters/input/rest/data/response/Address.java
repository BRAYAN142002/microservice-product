package ar.edu.unlp.pas.product.infraestructure.adapters.input.rest.data.response;

import lombok.*;
@Builder
@Data
public class Address {
    private Long id;
    private Integer street;
    private Integer houseNumber;
    private Integer floorNumber;
    private String department;

    private String city;
    private String province;
    private String country;
}
