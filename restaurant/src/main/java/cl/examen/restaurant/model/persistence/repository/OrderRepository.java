package cl.examen.restaurant.model.persistence.repository;

import cl.examen.restaurant.model.persistence.entity.OrderEntity;
import cl.examen.restaurant.model.persistence.entity.TableEntity;
import cl.examen.restaurant.model.persistence.entity.WaiterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity,Integer> {
      List<OrderEntity> findByCamarero(WaiterEntity waiter);
      List<OrderEntity> findByMesa(TableEntity table);
}
