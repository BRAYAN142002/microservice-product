package ar.edu.unlp.pas.product.domain.models;

import lombok.*;
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class publication {
    private Long id;
    private Integer stock;
    private Double sellPrice;
    private Double minPrice;
    private Double maxPrice;
    private Boolean isActive;
    private Product product;
}
