package cl.examen.restaurant.model.domain.service;

import cl.examen.restaurant.model.domain.dto.Order;
import cl.examen.restaurant.model.persistence.entity.WaiterEntity;
import cl.examen.restaurant.model.persistence.mapper.OrderMapper;
import cl.examen.restaurant.model.persistence.repository.OrderRepository;
import cl.examen.restaurant.model.persistence.repository.WaiterRepository;
import cl.examen.restaurant.web.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository repository;
    private final OrderMapper mapper;
    @Override
    public Order findById(int id) {
        return mapper.toOrder(repository.findById(id).get());
    }

    @Override
    public List<Order> findAll() {
        return mapper.toOrders(repository.findAll());
    }

    @Override
    public List<Order> findAll(WaiterEntity waiter) {
        if(waiter.getNombre()!= null){
            return mapper.toOrders(repository.findByCamarero(waiter));
        }
        return mapper.toOrders(repository.findAll());
    }

    @Override
    public Order update(Order order) {
        return mapper.toOrder(repository.save(mapper.toOrderEntity(order)));
    }
}
