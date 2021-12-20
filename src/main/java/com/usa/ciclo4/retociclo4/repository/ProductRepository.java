package com.usa.ciclo4.retociclo4.repository;

import com.usa.ciclo4.retociclo4.model.Product;
import com.usa.ciclo4.retociclo4.repository.crudrepository.ProductCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {
    @Autowired
    private ProductCrudRepository productCrudRepository;

    public List<Product> getAll(){

        return (List<Product>) productCrudRepository.findAll();
    }

    public Optional<Product> getProduct(String reference) {

        return productCrudRepository.findById(reference);
    }

    public Product save(Product product) {

        return productCrudRepository.save(product);
    }

    public void update(Product product) {
        productCrudRepository.save(product);
    }

    public void delete(Product product) {
        productCrudRepository.delete(product);
    }

}
