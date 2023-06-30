package ar.edu.unlp.pas.product.domain.models;
import javax.persistence.Entity;
import lombok.Data;

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

