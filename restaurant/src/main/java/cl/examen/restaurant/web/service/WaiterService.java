package cl.examen.restaurant.web.service;

import cl.examen.restaurant.model.domain.dto.Waiter;

import java.util.List;

public interface WaiterService {
    Waiter create(Waiter waiter);
    Waiter findById(int id);
    List<Waiter> finAll();

}
