package ar.edu.unlp.pas.product.infraestructure.adapters.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ar.edu.unlp.pas.product.infraestructure.adapters.output.persistence.mapper.ProductPersistenceMapper;
import ar.edu.unlp.pas.product.infraestructure.adapters.output.persistence.repository.ProductRepository;

@Configuration
public class BeanConfiguration {
    @Bean
    public ProductPersistenceAdapter productPersistenceAdapter(ProductRepository productRepository, ProductPersistenceMapper productPersistenceMapper) {
        return new ProductPersistenceAdapter(productRepository, productPersistenceMapper);
    }
}
