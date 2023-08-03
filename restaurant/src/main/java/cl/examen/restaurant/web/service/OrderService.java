package cl.examen.restaurant.web.service;

import cl.examen.restaurant.model.domain.dto.Order;
import cl.examen.restaurant.model.persistence.entity.WaiterEntity;

import java.util.List;

public interface OrderService {
    Order findById(int id);
    List<Order> findAll();
    List<Order> findAll(WaiterEntity waiter);
    Order update (Order order);
}
