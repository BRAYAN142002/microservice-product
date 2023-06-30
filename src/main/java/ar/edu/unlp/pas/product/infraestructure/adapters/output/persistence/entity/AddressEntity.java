package ar.edu.unlp.pas.product.infraestructure.adapters.output.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity 
@Table(name="Address")
@Data
public class AddressEntity {
    
    @Id
    @Column(nullable = false, unique = true, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "street")
    private Integer street;

    @NotNull
    @Column(name = "houseNumber")
    private Integer houseNumber;

    @Column(name = "floorNumber")
    private Integer floorNumber;

    @Column(name = "department")
    // Podria ser string
    private Integer department;

    @NotNull
    @Column(name = "city")
    private String city;

    @NotNull
    @Column(name = "province")
    private String province;

    @NotNull
    @Column(name = "country")
    private String country;
}
