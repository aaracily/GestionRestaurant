package cl.examen.restaurant.model.persistence.repository;

import cl.examen.restaurant.model.persistence.entity.TableEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepository extends JpaRepository<TableEntity,Integer> {
}
