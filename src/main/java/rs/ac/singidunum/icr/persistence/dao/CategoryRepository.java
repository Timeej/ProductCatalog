package rs.ac.singidunum.icr.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.ac.singidunum.icr.persistence.model.Category;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    List<Category> findByPathIdContaining(String pathId);
    Category findByIdEquals(int id);
    Category findByPathIdEquals(String pathId);
    List<Category> findByNameContaining(String name);
    Category findByNameEquals(String name);
}
