package ar.edu.unlp.pas.product.infraestructure.adapters.output.persistence.repository;

import ar.edu.unlp.pas.product.infraestructure.adapters.output.persistence.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Long> {

}

