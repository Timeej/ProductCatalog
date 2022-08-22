package rs.ac.singidunum.icr.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.ac.singidunum.icr.persistence.model.Product;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByPathIdContaining(String pathId);
    Product findByIdEquals(int id);
    Product findByPathIdEquals(String pathId);
    Product findByNameEquals(String name);
    List<Product> findByNameContaining(String name);
    List<Product> findByCategoryIdEquals(int categoryId);
}
