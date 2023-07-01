package ar.edu.unlp.pas.product.infraestructure.adapters.output.persistence.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import ar.edu.unlp.pas.product.domain.models.Address;
import lombok.Data;

@Entity
@Table(name="products")
@Data
public class ProductEntity {

    @Id
    @Column(nullable = false, unique = true, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    @NotNull(message="El nombre es obligatorio")
    private String name;

    @Column(nullable = false, name = "price")
    @NotNull(message="el precio es obligatorio")
    private Double price;

    @Column(name = "description")
    private String description;

    @Column(name = "category")
    private String category;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id")
    private AddressEntity address;
}
