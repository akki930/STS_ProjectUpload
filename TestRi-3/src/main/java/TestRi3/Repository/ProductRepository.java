package TestRi3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import TestRi3.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
