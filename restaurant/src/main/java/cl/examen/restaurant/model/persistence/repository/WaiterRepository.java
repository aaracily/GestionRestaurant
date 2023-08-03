package cl.examen.restaurant.model.persistence.repository;

import cl.examen.restaurant.model.persistence.entity.WaiterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WaiterRepository extends JpaRepository<WaiterEntity, Integer> {
}
