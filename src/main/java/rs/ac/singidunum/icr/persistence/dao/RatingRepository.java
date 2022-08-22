package rs.ac.singidunum.icr.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.ac.singidunum.icr.persistence.model.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Integer> {
    Rating findByIdEquals(int it);
    Rating findByProductIdEquals(int productId);
}
