package ar.edu.unlp.pas.product.domain.models;
import javax.persistence.*;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    private Long id;
    private Integer street;
    private Integer houseNumber;
    private String city;
    private String province;
    private String country;


}

