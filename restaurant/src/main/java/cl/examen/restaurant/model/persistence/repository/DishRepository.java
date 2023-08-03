package cl.examen.restaurant.model.persistence.repository;

import cl.examen.restaurant.model.persistence.entity.DishEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DishRepository extends JpaRepository<DishEntity, Integer> {
}
