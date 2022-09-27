package TestRi2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import TestRi2.Entity.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products, Integer> {

}
