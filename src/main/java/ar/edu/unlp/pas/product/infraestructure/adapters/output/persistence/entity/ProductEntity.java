package ar.edu.unlp.pas.product.infraestructure.adapters.output.persistence.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
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

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id")
    private Address address;
}
