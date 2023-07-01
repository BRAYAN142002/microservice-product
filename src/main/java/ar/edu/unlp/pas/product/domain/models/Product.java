package ar.edu.unlp.pas.product.domain.models;


import javax.persistence.Entity;

import lombok.Data;

@Data
public class Product {
    private Long id;
    private String name;
    private  Double price;
    private  String description;
    private String category;
    private Address address;
}
